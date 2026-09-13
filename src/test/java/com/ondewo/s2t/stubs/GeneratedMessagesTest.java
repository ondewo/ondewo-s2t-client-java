package com.ondewo.s2t.stubs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;
import ondewo.s2t.SpeechToText;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Exercises the committed protoc output. These are the tests that catch a broken generator:
 * they build a message, push it through the real binary marshaller and read it back.
 *
 * <p>ondewo-s2t-api is a single proto that does NOT set {@code java_multiple_files}, so every
 * message is nested in the outer class {@code ondewo.s2t.SpeechToText} and no
 * {@code com.ondewo.s2t} classes are generated at all - the pilot's separate multi-file case
 * has no counterpart here.
 */
class GeneratedMessagesTest {

    @Test
    void roundTripsAnOuterClassMessage() throws Exception {
        final SpeechToText.TranscribeFileResponse original =
                SpeechToText.TranscribeFileResponse.newBuilder()
                        .setAudioUuid("6a1b2c3d-0000-4000-8000-000000000000")
                        .setTime(1.25f)
                        .addTranscriptions(
                                SpeechToText.Transcription.newBuilder()
                                        .setTranscription("guten morgen")
                                        .setConfidenceScore(0.91f)
                                        .build())
                        .addTranscriptions(
                                SpeechToText.Transcription.newBuilder()
                                        .setTranscription("guten abend")
                                        .setConfidenceScore(0.42f)
                                        .build())
                        .build();

        final byte[] wire = original.toByteArray();
        final SpeechToText.TranscribeFileResponse parsed =
                SpeechToText.TranscribeFileResponse.parseFrom(wire);

        assertEquals(original, parsed);
        assertEquals("6a1b2c3d-0000-4000-8000-000000000000", parsed.getAudioUuid());
        assertEquals(1.25f, parsed.getTime());
        assertEquals(2, parsed.getTranscriptionsCount());
        assertEquals("guten abend", parsed.getTranscriptions(1).getTranscription());
        assertEquals(0.91f, parsed.getTranscriptions(0).getConfidenceScore());
        assertTrue(wire.length > 0);
    }

    /**
     * {@code optional string language = 9} in speech-to-text.proto. Explicit presence is what
     * lets a client send the zero value; losing it is the exact regression that broke the
     * angular target, so it is asserted on the wire here.
     */
    @Test
    void keepsExplicitPresenceOfAnOptionalScalar() throws Exception {
        final SpeechToText.TranscribeRequestConfig unset =
                SpeechToText.TranscribeRequestConfig.newBuilder().setS2TPipelineId("de_1").build();
        final SpeechToText.TranscribeRequestConfig explicitEmpty =
                SpeechToText.TranscribeRequestConfig.newBuilder()
                        .setS2TPipelineId("de_1")
                        .setLanguage("")
                        .build();

        assertFalse(
                SpeechToText.TranscribeRequestConfig.parseFrom(unset.toByteArray()).hasLanguage());
        assertTrue(
                SpeechToText.TranscribeRequestConfig.parseFrom(explicitEmpty.toByteArray())
                        .hasLanguage());
        assertEquals(
                "",
                SpeechToText.TranscribeRequestConfig.parseFrom(explicitEmpty.toByteArray())
                        .getLanguage());
        // An explicitly set empty string has to reach the wire, an unset field must not.
        assertTrue(explicitEmpty.toByteArray().length > unset.toByteArray().length);
    }

    @Test
    void keepsTheProtoPackageInTheDescriptor() {
        // The java_package of these protos is rewritten by the compiler image, but the PROTO
        // package - what goes on the wire - must stay ondewo.s2t.
        assertEquals(
                "ondewo.s2t.TranscribeFileResponse",
                SpeechToText.TranscribeFileResponse.getDescriptor().getFullName());
        assertEquals(
                "ondewo.s2t.TranscribeRequestConfig",
                SpeechToText.TranscribeRequestConfig.getDescriptor().getFullName());
    }

    @ParameterizedTest(name = "{0} has the zero value {1}")
    @MethodSource("zeroValues")
    void everyEnumDeclaresItsZeroValue(final String name, final int number, final Object zeroValue) {
        assertEquals(0, number, name);
        assertEquals(name, zeroValue.toString());
    }

    private static Stream<Arguments> zeroValues() {
        return Stream.of(
                Arguments.of(
                        "DEFAULT",
                        SpeechToText.Decoding.DEFAULT.getNumber(),
                        SpeechToText.Decoding.forNumber(0)),
                Arguments.of(
                        "INFERENCE_BACKEND_UNKNOWN",
                        SpeechToText.InferenceBackend.INFERENCE_BACKEND_UNKNOWN.getNumber(),
                        SpeechToText.InferenceBackend.forNumber(0)),
                Arguments.of(
                        "VAD_METHOD_UNSPECIFIED",
                        SpeechToText.VadMethod.VAD_METHOD_UNSPECIFIED.getNumber(),
                        SpeechToText.VadMethod.forNumber(0)));
    }

    @Test
    void defaultInstancesAreEmpty() {
        final SpeechToText.TranscribeRequestConfig config =
                SpeechToText.TranscribeRequestConfig.getDefaultInstance();

        assertEquals("", config.getS2TPipelineId());
        assertEquals(SpeechToText.Decoding.DEFAULT, config.getDecoding());
        assertFalse(config.hasLanguage());
        assertEquals(0, config.getSerializedSize());
    }
}
