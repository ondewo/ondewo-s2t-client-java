package ondewo.s2t;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * &lt;p&gt;Speech-to-text service&lt;/p&gt;
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class Speech2TextGrpc {

  private Speech2TextGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ondewo.s2t.Speech2Text";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.TranscribeFileRequest,
      ondewo.s2t.SpeechToText.TranscribeFileResponse> getTranscribeFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TranscribeFile",
      requestType = ondewo.s2t.SpeechToText.TranscribeFileRequest.class,
      responseType = ondewo.s2t.SpeechToText.TranscribeFileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.TranscribeFileRequest,
      ondewo.s2t.SpeechToText.TranscribeFileResponse> getTranscribeFileMethod() {
    io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.TranscribeFileRequest, ondewo.s2t.SpeechToText.TranscribeFileResponse> getTranscribeFileMethod;
    if ((getTranscribeFileMethod = Speech2TextGrpc.getTranscribeFileMethod) == null) {
      synchronized (Speech2TextGrpc.class) {
        if ((getTranscribeFileMethod = Speech2TextGrpc.getTranscribeFileMethod) == null) {
          Speech2TextGrpc.getTranscribeFileMethod = getTranscribeFileMethod =
              io.grpc.MethodDescriptor.<ondewo.s2t.SpeechToText.TranscribeFileRequest, ondewo.s2t.SpeechToText.TranscribeFileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TranscribeFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.s2t.SpeechToText.TranscribeFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.s2t.SpeechToText.TranscribeFileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new Speech2TextMethodDescriptorSupplier("TranscribeFile"))
              .build();
        }
      }
    }
    return getTranscribeFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.TranscribeStreamRequest,
      ondewo.s2t.SpeechToText.TranscribeStreamResponse> getTranscribeStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TranscribeStream",
      requestType = ondewo.s2t.SpeechToText.TranscribeStreamRequest.class,
      responseType = ondewo.s2t.SpeechToText.TranscribeStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.TranscribeStreamRequest,
      ondewo.s2t.SpeechToText.TranscribeStreamResponse> getTranscribeStreamMethod() {
    io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.TranscribeStreamRequest, ondewo.s2t.SpeechToText.TranscribeStreamResponse> getTranscribeStreamMethod;
    if ((getTranscribeStreamMethod = Speech2TextGrpc.getTranscribeStreamMethod) == null) {
      synchronized (Speech2TextGrpc.class) {
        if ((getTranscribeStreamMethod = Speech2TextGrpc.getTranscribeStreamMethod) == null) {
          Speech2TextGrpc.getTranscribeStreamMethod = getTranscribeStreamMethod =
              io.grpc.MethodDescriptor.<ondewo.s2t.SpeechToText.TranscribeStreamRequest, ondewo.s2t.SpeechToText.TranscribeStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TranscribeStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.s2t.SpeechToText.TranscribeStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.s2t.SpeechToText.TranscribeStreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new Speech2TextMethodDescriptorSupplier("TranscribeStream"))
              .build();
        }
      }
    }
    return getTranscribeStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.S2tPipelineId,
      ondewo.s2t.SpeechToText.Speech2TextConfig> getGetS2tPipelineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetS2tPipeline",
      requestType = ondewo.s2t.SpeechToText.S2tPipelineId.class,
      responseType = ondewo.s2t.SpeechToText.Speech2TextConfig.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.S2tPipelineId,
      ondewo.s2t.SpeechToText.Speech2TextConfig> getGetS2tPipelineMethod() {
    io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.S2tPipelineId, ondewo.s2t.SpeechToText.Speech2TextConfig> getGetS2tPipelineMethod;
    if ((getGetS2tPipelineMethod = Speech2TextGrpc.getGetS2tPipelineMethod) == null) {
      synchronized (Speech2TextGrpc.class) {
        if ((getGetS2tPipelineMethod = Speech2TextGrpc.getGetS2tPipelineMethod) == null) {
          Speech2TextGrpc.getGetS2tPipelineMethod = getGetS2tPipelineMethod =
              io.grpc.MethodDescriptor.<ondewo.s2t.SpeechToText.S2tPipelineId, ondewo.s2t.SpeechToText.Speech2TextConfig>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetS2tPipeline"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.s2t.SpeechToText.S2tPipelineId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.s2t.SpeechToText.Speech2TextConfig.getDefaultInstance()))
              .setSchemaDescriptor(new Speech2TextMethodDescriptorSupplier("GetS2tPipeline"))
              .build();
        }
      }
    }
    return getGetS2tPipelineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.Speech2TextConfig,
      ondewo.s2t.SpeechToText.S2tPipelineId> getCreateS2tPipelineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateS2tPipeline",
      requestType = ondewo.s2t.SpeechToText.Speech2TextConfig.class,
      responseType = ondewo.s2t.SpeechToText.S2tPipelineId.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.Speech2TextConfig,
      ondewo.s2t.SpeechToText.S2tPipelineId> getCreateS2tPipelineMethod() {
    io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.Speech2TextConfig, ondewo.s2t.SpeechToText.S2tPipelineId> getCreateS2tPipelineMethod;
    if ((getCreateS2tPipelineMethod = Speech2TextGrpc.getCreateS2tPipelineMethod) == null) {
      synchronized (Speech2TextGrpc.class) {
        if ((getCreateS2tPipelineMethod = Speech2TextGrpc.getCreateS2tPipelineMethod) == null) {
          Speech2TextGrpc.getCreateS2tPipelineMethod = getCreateS2tPipelineMethod =
              io.grpc.MethodDescriptor.<ondewo.s2t.SpeechToText.Speech2TextConfig, ondewo.s2t.SpeechToText.S2tPipelineId>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateS2tPipeline"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.s2t.SpeechToText.Speech2TextConfig.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.s2t.SpeechToText.S2tPipelineId.getDefaultInstance()))
              .setSchemaDescriptor(new Speech2TextMethodDescriptorSupplier("CreateS2tPipeline"))
              .build();
        }
      }
    }
    return getCreateS2tPipelineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.S2tPipelineId,
      com.google.protobuf.Empty> getDeleteS2tPipelineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteS2tPipeline",
      requestType = ondewo.s2t.SpeechToText.S2tPipelineId.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.S2tPipelineId,
      com.google.protobuf.Empty> getDeleteS2tPipelineMethod() {
    io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.S2tPipelineId, com.google.protobuf.Empty> getDeleteS2tPipelineMethod;
    if ((getDeleteS2tPipelineMethod = Speech2TextGrpc.getDeleteS2tPipelineMethod) == null) {
      synchronized (Speech2TextGrpc.class) {
        if ((getDeleteS2tPipelineMethod = Speech2TextGrpc.getDeleteS2tPipelineMethod) == null) {
          Speech2TextGrpc.getDeleteS2tPipelineMethod = getDeleteS2tPipelineMethod =
              io.grpc.MethodDescriptor.<ondewo.s2t.SpeechToText.S2tPipelineId, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteS2tPipeline"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.s2t.SpeechToText.S2tPipelineId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new Speech2TextMethodDescriptorSupplier("DeleteS2tPipeline"))
              .build();
        }
      }
    }
    return getDeleteS2tPipelineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.Speech2TextConfig,
      com.google.protobuf.Empty> getUpdateS2tPipelineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateS2tPipeline",
      requestType = ondewo.s2t.SpeechToText.Speech2TextConfig.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.Speech2TextConfig,
      com.google.protobuf.Empty> getUpdateS2tPipelineMethod() {
    io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.Speech2TextConfig, com.google.protobuf.Empty> getUpdateS2tPipelineMethod;
    if ((getUpdateS2tPipelineMethod = Speech2TextGrpc.getUpdateS2tPipelineMethod) == null) {
      synchronized (Speech2TextGrpc.class) {
        if ((getUpdateS2tPipelineMethod = Speech2TextGrpc.getUpdateS2tPipelineMethod) == null) {
          Speech2TextGrpc.getUpdateS2tPipelineMethod = getUpdateS2tPipelineMethod =
              io.grpc.MethodDescriptor.<ondewo.s2t.SpeechToText.Speech2TextConfig, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateS2tPipeline"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.s2t.SpeechToText.Speech2TextConfig.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new Speech2TextMethodDescriptorSupplier("UpdateS2tPipeline"))
              .build();
        }
      }
    }
    return getUpdateS2tPipelineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.ListS2tPipelinesRequest,
      ondewo.s2t.SpeechToText.ListS2tPipelinesResponse> getListS2tPipelinesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListS2tPipelines",
      requestType = ondewo.s2t.SpeechToText.ListS2tPipelinesRequest.class,
      responseType = ondewo.s2t.SpeechToText.ListS2tPipelinesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.ListS2tPipelinesRequest,
      ondewo.s2t.SpeechToText.ListS2tPipelinesResponse> getListS2tPipelinesMethod() {
    io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.ListS2tPipelinesRequest, ondewo.s2t.SpeechToText.ListS2tPipelinesResponse> getListS2tPipelinesMethod;
    if ((getListS2tPipelinesMethod = Speech2TextGrpc.getListS2tPipelinesMethod) == null) {
      synchronized (Speech2TextGrpc.class) {
        if ((getListS2tPipelinesMethod = Speech2TextGrpc.getListS2tPipelinesMethod) == null) {
          Speech2TextGrpc.getListS2tPipelinesMethod = getListS2tPipelinesMethod =
              io.grpc.MethodDescriptor.<ondewo.s2t.SpeechToText.ListS2tPipelinesRequest, ondewo.s2t.SpeechToText.ListS2tPipelinesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListS2tPipelines"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.s2t.SpeechToText.ListS2tPipelinesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.s2t.SpeechToText.ListS2tPipelinesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new Speech2TextMethodDescriptorSupplier("ListS2tPipelines"))
              .build();
        }
      }
    }
    return getListS2tPipelinesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.ListS2tLanguagesRequest,
      ondewo.s2t.SpeechToText.ListS2tLanguagesResponse> getListS2tLanguagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListS2tLanguages",
      requestType = ondewo.s2t.SpeechToText.ListS2tLanguagesRequest.class,
      responseType = ondewo.s2t.SpeechToText.ListS2tLanguagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.ListS2tLanguagesRequest,
      ondewo.s2t.SpeechToText.ListS2tLanguagesResponse> getListS2tLanguagesMethod() {
    io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.ListS2tLanguagesRequest, ondewo.s2t.SpeechToText.ListS2tLanguagesResponse> getListS2tLanguagesMethod;
    if ((getListS2tLanguagesMethod = Speech2TextGrpc.getListS2tLanguagesMethod) == null) {
      synchronized (Speech2TextGrpc.class) {
        if ((getListS2tLanguagesMethod = Speech2TextGrpc.getListS2tLanguagesMethod) == null) {
          Speech2TextGrpc.getListS2tLanguagesMethod = getListS2tLanguagesMethod =
              io.grpc.MethodDescriptor.<ondewo.s2t.SpeechToText.ListS2tLanguagesRequest, ondewo.s2t.SpeechToText.ListS2tLanguagesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListS2tLanguages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.s2t.SpeechToText.ListS2tLanguagesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.s2t.SpeechToText.ListS2tLanguagesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new Speech2TextMethodDescriptorSupplier("ListS2tLanguages"))
              .build();
        }
      }
    }
    return getListS2tLanguagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.ListS2tDomainsRequest,
      ondewo.s2t.SpeechToText.ListS2tDomainsResponse> getListS2tDomainsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListS2tDomains",
      requestType = ondewo.s2t.SpeechToText.ListS2tDomainsRequest.class,
      responseType = ondewo.s2t.SpeechToText.ListS2tDomainsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.ListS2tDomainsRequest,
      ondewo.s2t.SpeechToText.ListS2tDomainsResponse> getListS2tDomainsMethod() {
    io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.ListS2tDomainsRequest, ondewo.s2t.SpeechToText.ListS2tDomainsResponse> getListS2tDomainsMethod;
    if ((getListS2tDomainsMethod = Speech2TextGrpc.getListS2tDomainsMethod) == null) {
      synchronized (Speech2TextGrpc.class) {
        if ((getListS2tDomainsMethod = Speech2TextGrpc.getListS2tDomainsMethod) == null) {
          Speech2TextGrpc.getListS2tDomainsMethod = getListS2tDomainsMethod =
              io.grpc.MethodDescriptor.<ondewo.s2t.SpeechToText.ListS2tDomainsRequest, ondewo.s2t.SpeechToText.ListS2tDomainsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListS2tDomains"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.s2t.SpeechToText.ListS2tDomainsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.s2t.SpeechToText.ListS2tDomainsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new Speech2TextMethodDescriptorSupplier("ListS2tDomains"))
              .build();
        }
      }
    }
    return getListS2tDomainsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      ondewo.s2t.SpeechToText.S2tGetServiceInfoResponse> getGetServiceInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetServiceInfo",
      requestType = com.google.protobuf.Empty.class,
      responseType = ondewo.s2t.SpeechToText.S2tGetServiceInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      ondewo.s2t.SpeechToText.S2tGetServiceInfoResponse> getGetServiceInfoMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, ondewo.s2t.SpeechToText.S2tGetServiceInfoResponse> getGetServiceInfoMethod;
    if ((getGetServiceInfoMethod = Speech2TextGrpc.getGetServiceInfoMethod) == null) {
      synchronized (Speech2TextGrpc.class) {
        if ((getGetServiceInfoMethod = Speech2TextGrpc.getGetServiceInfoMethod) == null) {
          Speech2TextGrpc.getGetServiceInfoMethod = getGetServiceInfoMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, ondewo.s2t.SpeechToText.S2tGetServiceInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetServiceInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.s2t.SpeechToText.S2tGetServiceInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new Speech2TextMethodDescriptorSupplier("GetServiceInfo"))
              .build();
        }
      }
    }
    return getGetServiceInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.ListS2tLanguageModelsRequest,
      ondewo.s2t.SpeechToText.ListS2tLanguageModelsResponse> getListS2tLanguageModelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListS2tLanguageModels",
      requestType = ondewo.s2t.SpeechToText.ListS2tLanguageModelsRequest.class,
      responseType = ondewo.s2t.SpeechToText.ListS2tLanguageModelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.ListS2tLanguageModelsRequest,
      ondewo.s2t.SpeechToText.ListS2tLanguageModelsResponse> getListS2tLanguageModelsMethod() {
    io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.ListS2tLanguageModelsRequest, ondewo.s2t.SpeechToText.ListS2tLanguageModelsResponse> getListS2tLanguageModelsMethod;
    if ((getListS2tLanguageModelsMethod = Speech2TextGrpc.getListS2tLanguageModelsMethod) == null) {
      synchronized (Speech2TextGrpc.class) {
        if ((getListS2tLanguageModelsMethod = Speech2TextGrpc.getListS2tLanguageModelsMethod) == null) {
          Speech2TextGrpc.getListS2tLanguageModelsMethod = getListS2tLanguageModelsMethod =
              io.grpc.MethodDescriptor.<ondewo.s2t.SpeechToText.ListS2tLanguageModelsRequest, ondewo.s2t.SpeechToText.ListS2tLanguageModelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListS2tLanguageModels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.s2t.SpeechToText.ListS2tLanguageModelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.s2t.SpeechToText.ListS2tLanguageModelsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new Speech2TextMethodDescriptorSupplier("ListS2tLanguageModels"))
              .build();
        }
      }
    }
    return getListS2tLanguageModelsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.CreateUserLanguageModelRequest,
      com.google.protobuf.Empty> getCreateUserLanguageModelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUserLanguageModel",
      requestType = ondewo.s2t.SpeechToText.CreateUserLanguageModelRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.CreateUserLanguageModelRequest,
      com.google.protobuf.Empty> getCreateUserLanguageModelMethod() {
    io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.CreateUserLanguageModelRequest, com.google.protobuf.Empty> getCreateUserLanguageModelMethod;
    if ((getCreateUserLanguageModelMethod = Speech2TextGrpc.getCreateUserLanguageModelMethod) == null) {
      synchronized (Speech2TextGrpc.class) {
        if ((getCreateUserLanguageModelMethod = Speech2TextGrpc.getCreateUserLanguageModelMethod) == null) {
          Speech2TextGrpc.getCreateUserLanguageModelMethod = getCreateUserLanguageModelMethod =
              io.grpc.MethodDescriptor.<ondewo.s2t.SpeechToText.CreateUserLanguageModelRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateUserLanguageModel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.s2t.SpeechToText.CreateUserLanguageModelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new Speech2TextMethodDescriptorSupplier("CreateUserLanguageModel"))
              .build();
        }
      }
    }
    return getCreateUserLanguageModelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.DeleteUserLanguageModelRequest,
      com.google.protobuf.Empty> getDeleteUserLanguageModelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteUserLanguageModel",
      requestType = ondewo.s2t.SpeechToText.DeleteUserLanguageModelRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.DeleteUserLanguageModelRequest,
      com.google.protobuf.Empty> getDeleteUserLanguageModelMethod() {
    io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.DeleteUserLanguageModelRequest, com.google.protobuf.Empty> getDeleteUserLanguageModelMethod;
    if ((getDeleteUserLanguageModelMethod = Speech2TextGrpc.getDeleteUserLanguageModelMethod) == null) {
      synchronized (Speech2TextGrpc.class) {
        if ((getDeleteUserLanguageModelMethod = Speech2TextGrpc.getDeleteUserLanguageModelMethod) == null) {
          Speech2TextGrpc.getDeleteUserLanguageModelMethod = getDeleteUserLanguageModelMethod =
              io.grpc.MethodDescriptor.<ondewo.s2t.SpeechToText.DeleteUserLanguageModelRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteUserLanguageModel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.s2t.SpeechToText.DeleteUserLanguageModelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new Speech2TextMethodDescriptorSupplier("DeleteUserLanguageModel"))
              .build();
        }
      }
    }
    return getDeleteUserLanguageModelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.AddDataToUserLanguageModelRequest,
      com.google.protobuf.Empty> getAddDataToUserLanguageModelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddDataToUserLanguageModel",
      requestType = ondewo.s2t.SpeechToText.AddDataToUserLanguageModelRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.AddDataToUserLanguageModelRequest,
      com.google.protobuf.Empty> getAddDataToUserLanguageModelMethod() {
    io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.AddDataToUserLanguageModelRequest, com.google.protobuf.Empty> getAddDataToUserLanguageModelMethod;
    if ((getAddDataToUserLanguageModelMethod = Speech2TextGrpc.getAddDataToUserLanguageModelMethod) == null) {
      synchronized (Speech2TextGrpc.class) {
        if ((getAddDataToUserLanguageModelMethod = Speech2TextGrpc.getAddDataToUserLanguageModelMethod) == null) {
          Speech2TextGrpc.getAddDataToUserLanguageModelMethod = getAddDataToUserLanguageModelMethod =
              io.grpc.MethodDescriptor.<ondewo.s2t.SpeechToText.AddDataToUserLanguageModelRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddDataToUserLanguageModel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.s2t.SpeechToText.AddDataToUserLanguageModelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new Speech2TextMethodDescriptorSupplier("AddDataToUserLanguageModel"))
              .build();
        }
      }
    }
    return getAddDataToUserLanguageModelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.TrainUserLanguageModelRequest,
      com.google.protobuf.Empty> getTrainUserLanguageModelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TrainUserLanguageModel",
      requestType = ondewo.s2t.SpeechToText.TrainUserLanguageModelRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.TrainUserLanguageModelRequest,
      com.google.protobuf.Empty> getTrainUserLanguageModelMethod() {
    io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.TrainUserLanguageModelRequest, com.google.protobuf.Empty> getTrainUserLanguageModelMethod;
    if ((getTrainUserLanguageModelMethod = Speech2TextGrpc.getTrainUserLanguageModelMethod) == null) {
      synchronized (Speech2TextGrpc.class) {
        if ((getTrainUserLanguageModelMethod = Speech2TextGrpc.getTrainUserLanguageModelMethod) == null) {
          Speech2TextGrpc.getTrainUserLanguageModelMethod = getTrainUserLanguageModelMethod =
              io.grpc.MethodDescriptor.<ondewo.s2t.SpeechToText.TrainUserLanguageModelRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TrainUserLanguageModel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.s2t.SpeechToText.TrainUserLanguageModelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new Speech2TextMethodDescriptorSupplier("TrainUserLanguageModel"))
              .build();
        }
      }
    }
    return getTrainUserLanguageModelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.ListS2tNormalizationPipelinesRequest,
      ondewo.s2t.SpeechToText.ListS2tNormalizationPipelinesResponse> getListS2tNormalizationPipelinesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListS2tNormalizationPipelines",
      requestType = ondewo.s2t.SpeechToText.ListS2tNormalizationPipelinesRequest.class,
      responseType = ondewo.s2t.SpeechToText.ListS2tNormalizationPipelinesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.ListS2tNormalizationPipelinesRequest,
      ondewo.s2t.SpeechToText.ListS2tNormalizationPipelinesResponse> getListS2tNormalizationPipelinesMethod() {
    io.grpc.MethodDescriptor<ondewo.s2t.SpeechToText.ListS2tNormalizationPipelinesRequest, ondewo.s2t.SpeechToText.ListS2tNormalizationPipelinesResponse> getListS2tNormalizationPipelinesMethod;
    if ((getListS2tNormalizationPipelinesMethod = Speech2TextGrpc.getListS2tNormalizationPipelinesMethod) == null) {
      synchronized (Speech2TextGrpc.class) {
        if ((getListS2tNormalizationPipelinesMethod = Speech2TextGrpc.getListS2tNormalizationPipelinesMethod) == null) {
          Speech2TextGrpc.getListS2tNormalizationPipelinesMethod = getListS2tNormalizationPipelinesMethod =
              io.grpc.MethodDescriptor.<ondewo.s2t.SpeechToText.ListS2tNormalizationPipelinesRequest, ondewo.s2t.SpeechToText.ListS2tNormalizationPipelinesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListS2tNormalizationPipelines"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.s2t.SpeechToText.ListS2tNormalizationPipelinesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ondewo.s2t.SpeechToText.ListS2tNormalizationPipelinesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new Speech2TextMethodDescriptorSupplier("ListS2tNormalizationPipelines"))
              .build();
        }
      }
    }
    return getListS2tNormalizationPipelinesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static Speech2TextStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<Speech2TextStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<Speech2TextStub>() {
        @java.lang.Override
        public Speech2TextStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new Speech2TextStub(channel, callOptions);
        }
      };
    return Speech2TextStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static Speech2TextBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<Speech2TextBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<Speech2TextBlockingV2Stub>() {
        @java.lang.Override
        public Speech2TextBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new Speech2TextBlockingV2Stub(channel, callOptions);
        }
      };
    return Speech2TextBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static Speech2TextBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<Speech2TextBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<Speech2TextBlockingStub>() {
        @java.lang.Override
        public Speech2TextBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new Speech2TextBlockingStub(channel, callOptions);
        }
      };
    return Speech2TextBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static Speech2TextFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<Speech2TextFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<Speech2TextFutureStub>() {
        @java.lang.Override
        public Speech2TextFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new Speech2TextFutureStub(channel, callOptions);
        }
      };
    return Speech2TextFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * &lt;p&gt;Speech-to-text service&lt;/p&gt;
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * &lt;p&gt;Transcribes an audio file&lt;/p&gt;
     * </pre>
     */
    default void transcribeFile(ondewo.s2t.SpeechToText.TranscribeFileRequest request,
        io.grpc.stub.StreamObserver<ondewo.s2t.SpeechToText.TranscribeFileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTranscribeFileMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Transcribes an audio stream.&lt;/p&gt;
     * </pre>
     */
    default io.grpc.stub.StreamObserver<ondewo.s2t.SpeechToText.TranscribeStreamRequest> transcribeStream(
        io.grpc.stub.StreamObserver<ondewo.s2t.SpeechToText.TranscribeStreamResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getTranscribeStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Gets a speech to text pipeline corresponding to the id specified in &lt;code&gt;S2tPipelineId&lt;/code&gt;. If no corresponding id is
     * found, raises &lt;code&gt;ModuleNotFoundError&lt;/code&gt; in server.&lt;/p&gt;
     * </pre>
     */
    default void getS2tPipeline(ondewo.s2t.SpeechToText.S2tPipelineId request,
        io.grpc.stub.StreamObserver<ondewo.s2t.SpeechToText.Speech2TextConfig> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetS2tPipelineMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Creates a new speech to text pipeline from a &lt;code&gt;Speech2TextConfig&lt;/code&gt; and registers the new pipeline in the server.&lt;/p&gt;
     * </pre>
     */
    default void createS2tPipeline(ondewo.s2t.SpeechToText.Speech2TextConfig request,
        io.grpc.stub.StreamObserver<ondewo.s2t.SpeechToText.S2tPipelineId> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateS2tPipelineMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Deletes a pipeline corresponding to the id parsed in &lt;code&gt;S2tPipelineId&lt;/code&gt;. If no corresponding id is
     * found, raises &lt;code&gt;ModuleNotFoundError&lt;/code&gt; in server.&lt;/p&gt;
     * </pre>
     */
    default void deleteS2tPipeline(ondewo.s2t.SpeechToText.S2tPipelineId request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteS2tPipelineMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Updates a pipeline with the id specified in &lt;code&gt;Speech2TextConfig&lt;/code&gt; with the new config. If no corresponding id is
     * found, raises &lt;code&gt;ModuleNotFoundError&lt;/code&gt; in server.&lt;/p&gt;
     * </pre>
     */
    default void updateS2tPipeline(ondewo.s2t.SpeechToText.Speech2TextConfig request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateS2tPipelineMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Lists all speech to text pipelines.&lt;/p&gt;
     * </pre>
     */
    default void listS2tPipelines(ondewo.s2t.SpeechToText.ListS2tPipelinesRequest request,
        io.grpc.stub.StreamObserver<ondewo.s2t.SpeechToText.ListS2tPipelinesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListS2tPipelinesMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Returns a message containing a list of all languages for which there exist pipelines.&lt;/p&gt;
     * </pre>
     */
    default void listS2tLanguages(ondewo.s2t.SpeechToText.ListS2tLanguagesRequest request,
        io.grpc.stub.StreamObserver<ondewo.s2t.SpeechToText.ListS2tLanguagesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListS2tLanguagesMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Returns a message containing a list of all domains for which there exist pipelines.&lt;/p&gt;
     * </pre>
     */
    default void listS2tDomains(ondewo.s2t.SpeechToText.ListS2tDomainsRequest request,
        io.grpc.stub.StreamObserver<ondewo.s2t.SpeechToText.ListS2tDomainsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListS2tDomainsMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Returns a message containing the version of the running speech to text server.&lt;/p&gt;
     * </pre>
     */
    default void getServiceInfo(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<ondewo.s2t.SpeechToText.S2tGetServiceInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetServiceInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Given a list of pipeline ids, returns a list of &lt;code&gt;LanguageModelPipelineId&lt;/code&gt; messages containing the pipeline
     * id and a list of the language models loaded in the pipeline.&lt;/p&gt;
     * </pre>
     */
    default void listS2tLanguageModels(ondewo.s2t.SpeechToText.ListS2tLanguageModelsRequest request,
        io.grpc.stub.StreamObserver<ondewo.s2t.SpeechToText.ListS2tLanguageModelsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListS2tLanguageModelsMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Create a user language model.&lt;/p&gt;
     * </pre>
     */
    default void createUserLanguageModel(ondewo.s2t.SpeechToText.CreateUserLanguageModelRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUserLanguageModelMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Delete a user language model.&lt;/p&gt;
     * </pre>
     */
    default void deleteUserLanguageModel(ondewo.s2t.SpeechToText.DeleteUserLanguageModelRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUserLanguageModelMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Add data to a user language model.&lt;/p&gt;
     * </pre>
     */
    default void addDataToUserLanguageModel(ondewo.s2t.SpeechToText.AddDataToUserLanguageModelRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddDataToUserLanguageModelMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Train a user language model.&lt;/p&gt;
     * </pre>
     */
    default void trainUserLanguageModel(ondewo.s2t.SpeechToText.TrainUserLanguageModelRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTrainUserLanguageModelMethod(), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves a list of normalization pipelines based on specific requirements.&lt;/p&gt;
     * </pre>
     */
    default void listS2tNormalizationPipelines(ondewo.s2t.SpeechToText.ListS2tNormalizationPipelinesRequest request,
        io.grpc.stub.StreamObserver<ondewo.s2t.SpeechToText.ListS2tNormalizationPipelinesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListS2tNormalizationPipelinesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Speech2Text.
   * <pre>
   * &lt;p&gt;Speech-to-text service&lt;/p&gt;
   * </pre>
   */
  public static abstract class Speech2TextImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return Speech2TextGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Speech2Text.
   * <pre>
   * &lt;p&gt;Speech-to-text service&lt;/p&gt;
   * </pre>
   */
  public static final class Speech2TextStub
      extends io.grpc.stub.AbstractAsyncStub<Speech2TextStub> {
    private Speech2TextStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Speech2TextStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new Speech2TextStub(channel, callOptions);
    }

    /**
     * <pre>
     * &lt;p&gt;Transcribes an audio file&lt;/p&gt;
     * </pre>
     */
    public void transcribeFile(ondewo.s2t.SpeechToText.TranscribeFileRequest request,
        io.grpc.stub.StreamObserver<ondewo.s2t.SpeechToText.TranscribeFileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTranscribeFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Transcribes an audio stream.&lt;/p&gt;
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ondewo.s2t.SpeechToText.TranscribeStreamRequest> transcribeStream(
        io.grpc.stub.StreamObserver<ondewo.s2t.SpeechToText.TranscribeStreamResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getTranscribeStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Gets a speech to text pipeline corresponding to the id specified in &lt;code&gt;S2tPipelineId&lt;/code&gt;. If no corresponding id is
     * found, raises &lt;code&gt;ModuleNotFoundError&lt;/code&gt; in server.&lt;/p&gt;
     * </pre>
     */
    public void getS2tPipeline(ondewo.s2t.SpeechToText.S2tPipelineId request,
        io.grpc.stub.StreamObserver<ondewo.s2t.SpeechToText.Speech2TextConfig> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetS2tPipelineMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Creates a new speech to text pipeline from a &lt;code&gt;Speech2TextConfig&lt;/code&gt; and registers the new pipeline in the server.&lt;/p&gt;
     * </pre>
     */
    public void createS2tPipeline(ondewo.s2t.SpeechToText.Speech2TextConfig request,
        io.grpc.stub.StreamObserver<ondewo.s2t.SpeechToText.S2tPipelineId> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateS2tPipelineMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Deletes a pipeline corresponding to the id parsed in &lt;code&gt;S2tPipelineId&lt;/code&gt;. If no corresponding id is
     * found, raises &lt;code&gt;ModuleNotFoundError&lt;/code&gt; in server.&lt;/p&gt;
     * </pre>
     */
    public void deleteS2tPipeline(ondewo.s2t.SpeechToText.S2tPipelineId request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteS2tPipelineMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Updates a pipeline with the id specified in &lt;code&gt;Speech2TextConfig&lt;/code&gt; with the new config. If no corresponding id is
     * found, raises &lt;code&gt;ModuleNotFoundError&lt;/code&gt; in server.&lt;/p&gt;
     * </pre>
     */
    public void updateS2tPipeline(ondewo.s2t.SpeechToText.Speech2TextConfig request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateS2tPipelineMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Lists all speech to text pipelines.&lt;/p&gt;
     * </pre>
     */
    public void listS2tPipelines(ondewo.s2t.SpeechToText.ListS2tPipelinesRequest request,
        io.grpc.stub.StreamObserver<ondewo.s2t.SpeechToText.ListS2tPipelinesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListS2tPipelinesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Returns a message containing a list of all languages for which there exist pipelines.&lt;/p&gt;
     * </pre>
     */
    public void listS2tLanguages(ondewo.s2t.SpeechToText.ListS2tLanguagesRequest request,
        io.grpc.stub.StreamObserver<ondewo.s2t.SpeechToText.ListS2tLanguagesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListS2tLanguagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Returns a message containing a list of all domains for which there exist pipelines.&lt;/p&gt;
     * </pre>
     */
    public void listS2tDomains(ondewo.s2t.SpeechToText.ListS2tDomainsRequest request,
        io.grpc.stub.StreamObserver<ondewo.s2t.SpeechToText.ListS2tDomainsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListS2tDomainsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Returns a message containing the version of the running speech to text server.&lt;/p&gt;
     * </pre>
     */
    public void getServiceInfo(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<ondewo.s2t.SpeechToText.S2tGetServiceInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetServiceInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Given a list of pipeline ids, returns a list of &lt;code&gt;LanguageModelPipelineId&lt;/code&gt; messages containing the pipeline
     * id and a list of the language models loaded in the pipeline.&lt;/p&gt;
     * </pre>
     */
    public void listS2tLanguageModels(ondewo.s2t.SpeechToText.ListS2tLanguageModelsRequest request,
        io.grpc.stub.StreamObserver<ondewo.s2t.SpeechToText.ListS2tLanguageModelsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListS2tLanguageModelsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Create a user language model.&lt;/p&gt;
     * </pre>
     */
    public void createUserLanguageModel(ondewo.s2t.SpeechToText.CreateUserLanguageModelRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateUserLanguageModelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Delete a user language model.&lt;/p&gt;
     * </pre>
     */
    public void deleteUserLanguageModel(ondewo.s2t.SpeechToText.DeleteUserLanguageModelRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteUserLanguageModelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Add data to a user language model.&lt;/p&gt;
     * </pre>
     */
    public void addDataToUserLanguageModel(ondewo.s2t.SpeechToText.AddDataToUserLanguageModelRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddDataToUserLanguageModelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Train a user language model.&lt;/p&gt;
     * </pre>
     */
    public void trainUserLanguageModel(ondewo.s2t.SpeechToText.TrainUserLanguageModelRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTrainUserLanguageModelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves a list of normalization pipelines based on specific requirements.&lt;/p&gt;
     * </pre>
     */
    public void listS2tNormalizationPipelines(ondewo.s2t.SpeechToText.ListS2tNormalizationPipelinesRequest request,
        io.grpc.stub.StreamObserver<ondewo.s2t.SpeechToText.ListS2tNormalizationPipelinesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListS2tNormalizationPipelinesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Speech2Text.
   * <pre>
   * &lt;p&gt;Speech-to-text service&lt;/p&gt;
   * </pre>
   */
  public static final class Speech2TextBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<Speech2TextBlockingV2Stub> {
    private Speech2TextBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Speech2TextBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new Speech2TextBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * &lt;p&gt;Transcribes an audio file&lt;/p&gt;
     * </pre>
     */
    public ondewo.s2t.SpeechToText.TranscribeFileResponse transcribeFile(ondewo.s2t.SpeechToText.TranscribeFileRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getTranscribeFileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Transcribes an audio stream.&lt;/p&gt;
     * </pre>
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<ondewo.s2t.SpeechToText.TranscribeStreamRequest, ondewo.s2t.SpeechToText.TranscribeStreamResponse>
        transcribeStream() {
      return io.grpc.stub.ClientCalls.blockingBidiStreamingCall(
          getChannel(), getTranscribeStreamMethod(), getCallOptions());
    }

    /**
     * <pre>
     * &lt;p&gt;Gets a speech to text pipeline corresponding to the id specified in &lt;code&gt;S2tPipelineId&lt;/code&gt;. If no corresponding id is
     * found, raises &lt;code&gt;ModuleNotFoundError&lt;/code&gt; in server.&lt;/p&gt;
     * </pre>
     */
    public ondewo.s2t.SpeechToText.Speech2TextConfig getS2tPipeline(ondewo.s2t.SpeechToText.S2tPipelineId request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetS2tPipelineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Creates a new speech to text pipeline from a &lt;code&gt;Speech2TextConfig&lt;/code&gt; and registers the new pipeline in the server.&lt;/p&gt;
     * </pre>
     */
    public ondewo.s2t.SpeechToText.S2tPipelineId createS2tPipeline(ondewo.s2t.SpeechToText.Speech2TextConfig request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateS2tPipelineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Deletes a pipeline corresponding to the id parsed in &lt;code&gt;S2tPipelineId&lt;/code&gt;. If no corresponding id is
     * found, raises &lt;code&gt;ModuleNotFoundError&lt;/code&gt; in server.&lt;/p&gt;
     * </pre>
     */
    public com.google.protobuf.Empty deleteS2tPipeline(ondewo.s2t.SpeechToText.S2tPipelineId request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteS2tPipelineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Updates a pipeline with the id specified in &lt;code&gt;Speech2TextConfig&lt;/code&gt; with the new config. If no corresponding id is
     * found, raises &lt;code&gt;ModuleNotFoundError&lt;/code&gt; in server.&lt;/p&gt;
     * </pre>
     */
    public com.google.protobuf.Empty updateS2tPipeline(ondewo.s2t.SpeechToText.Speech2TextConfig request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpdateS2tPipelineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Lists all speech to text pipelines.&lt;/p&gt;
     * </pre>
     */
    public ondewo.s2t.SpeechToText.ListS2tPipelinesResponse listS2tPipelines(ondewo.s2t.SpeechToText.ListS2tPipelinesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListS2tPipelinesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Returns a message containing a list of all languages for which there exist pipelines.&lt;/p&gt;
     * </pre>
     */
    public ondewo.s2t.SpeechToText.ListS2tLanguagesResponse listS2tLanguages(ondewo.s2t.SpeechToText.ListS2tLanguagesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListS2tLanguagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Returns a message containing a list of all domains for which there exist pipelines.&lt;/p&gt;
     * </pre>
     */
    public ondewo.s2t.SpeechToText.ListS2tDomainsResponse listS2tDomains(ondewo.s2t.SpeechToText.ListS2tDomainsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListS2tDomainsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Returns a message containing the version of the running speech to text server.&lt;/p&gt;
     * </pre>
     */
    public ondewo.s2t.SpeechToText.S2tGetServiceInfoResponse getServiceInfo(com.google.protobuf.Empty request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetServiceInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Given a list of pipeline ids, returns a list of &lt;code&gt;LanguageModelPipelineId&lt;/code&gt; messages containing the pipeline
     * id and a list of the language models loaded in the pipeline.&lt;/p&gt;
     * </pre>
     */
    public ondewo.s2t.SpeechToText.ListS2tLanguageModelsResponse listS2tLanguageModels(ondewo.s2t.SpeechToText.ListS2tLanguageModelsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListS2tLanguageModelsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Create a user language model.&lt;/p&gt;
     * </pre>
     */
    public com.google.protobuf.Empty createUserLanguageModel(ondewo.s2t.SpeechToText.CreateUserLanguageModelRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateUserLanguageModelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Delete a user language model.&lt;/p&gt;
     * </pre>
     */
    public com.google.protobuf.Empty deleteUserLanguageModel(ondewo.s2t.SpeechToText.DeleteUserLanguageModelRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteUserLanguageModelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Add data to a user language model.&lt;/p&gt;
     * </pre>
     */
    public com.google.protobuf.Empty addDataToUserLanguageModel(ondewo.s2t.SpeechToText.AddDataToUserLanguageModelRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getAddDataToUserLanguageModelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Train a user language model.&lt;/p&gt;
     * </pre>
     */
    public com.google.protobuf.Empty trainUserLanguageModel(ondewo.s2t.SpeechToText.TrainUserLanguageModelRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getTrainUserLanguageModelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves a list of normalization pipelines based on specific requirements.&lt;/p&gt;
     * </pre>
     */
    public ondewo.s2t.SpeechToText.ListS2tNormalizationPipelinesResponse listS2tNormalizationPipelines(ondewo.s2t.SpeechToText.ListS2tNormalizationPipelinesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListS2tNormalizationPipelinesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Speech2Text.
   * <pre>
   * &lt;p&gt;Speech-to-text service&lt;/p&gt;
   * </pre>
   */
  public static final class Speech2TextBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<Speech2TextBlockingStub> {
    private Speech2TextBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Speech2TextBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new Speech2TextBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * &lt;p&gt;Transcribes an audio file&lt;/p&gt;
     * </pre>
     */
    public ondewo.s2t.SpeechToText.TranscribeFileResponse transcribeFile(ondewo.s2t.SpeechToText.TranscribeFileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTranscribeFileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Gets a speech to text pipeline corresponding to the id specified in &lt;code&gt;S2tPipelineId&lt;/code&gt;. If no corresponding id is
     * found, raises &lt;code&gt;ModuleNotFoundError&lt;/code&gt; in server.&lt;/p&gt;
     * </pre>
     */
    public ondewo.s2t.SpeechToText.Speech2TextConfig getS2tPipeline(ondewo.s2t.SpeechToText.S2tPipelineId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetS2tPipelineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Creates a new speech to text pipeline from a &lt;code&gt;Speech2TextConfig&lt;/code&gt; and registers the new pipeline in the server.&lt;/p&gt;
     * </pre>
     */
    public ondewo.s2t.SpeechToText.S2tPipelineId createS2tPipeline(ondewo.s2t.SpeechToText.Speech2TextConfig request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateS2tPipelineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Deletes a pipeline corresponding to the id parsed in &lt;code&gt;S2tPipelineId&lt;/code&gt;. If no corresponding id is
     * found, raises &lt;code&gt;ModuleNotFoundError&lt;/code&gt; in server.&lt;/p&gt;
     * </pre>
     */
    public com.google.protobuf.Empty deleteS2tPipeline(ondewo.s2t.SpeechToText.S2tPipelineId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteS2tPipelineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Updates a pipeline with the id specified in &lt;code&gt;Speech2TextConfig&lt;/code&gt; with the new config. If no corresponding id is
     * found, raises &lt;code&gt;ModuleNotFoundError&lt;/code&gt; in server.&lt;/p&gt;
     * </pre>
     */
    public com.google.protobuf.Empty updateS2tPipeline(ondewo.s2t.SpeechToText.Speech2TextConfig request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateS2tPipelineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Lists all speech to text pipelines.&lt;/p&gt;
     * </pre>
     */
    public ondewo.s2t.SpeechToText.ListS2tPipelinesResponse listS2tPipelines(ondewo.s2t.SpeechToText.ListS2tPipelinesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListS2tPipelinesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Returns a message containing a list of all languages for which there exist pipelines.&lt;/p&gt;
     * </pre>
     */
    public ondewo.s2t.SpeechToText.ListS2tLanguagesResponse listS2tLanguages(ondewo.s2t.SpeechToText.ListS2tLanguagesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListS2tLanguagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Returns a message containing a list of all domains for which there exist pipelines.&lt;/p&gt;
     * </pre>
     */
    public ondewo.s2t.SpeechToText.ListS2tDomainsResponse listS2tDomains(ondewo.s2t.SpeechToText.ListS2tDomainsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListS2tDomainsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Returns a message containing the version of the running speech to text server.&lt;/p&gt;
     * </pre>
     */
    public ondewo.s2t.SpeechToText.S2tGetServiceInfoResponse getServiceInfo(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetServiceInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Given a list of pipeline ids, returns a list of &lt;code&gt;LanguageModelPipelineId&lt;/code&gt; messages containing the pipeline
     * id and a list of the language models loaded in the pipeline.&lt;/p&gt;
     * </pre>
     */
    public ondewo.s2t.SpeechToText.ListS2tLanguageModelsResponse listS2tLanguageModels(ondewo.s2t.SpeechToText.ListS2tLanguageModelsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListS2tLanguageModelsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Create a user language model.&lt;/p&gt;
     * </pre>
     */
    public com.google.protobuf.Empty createUserLanguageModel(ondewo.s2t.SpeechToText.CreateUserLanguageModelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUserLanguageModelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Delete a user language model.&lt;/p&gt;
     * </pre>
     */
    public com.google.protobuf.Empty deleteUserLanguageModel(ondewo.s2t.SpeechToText.DeleteUserLanguageModelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUserLanguageModelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Add data to a user language model.&lt;/p&gt;
     * </pre>
     */
    public com.google.protobuf.Empty addDataToUserLanguageModel(ondewo.s2t.SpeechToText.AddDataToUserLanguageModelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddDataToUserLanguageModelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Train a user language model.&lt;/p&gt;
     * </pre>
     */
    public com.google.protobuf.Empty trainUserLanguageModel(ondewo.s2t.SpeechToText.TrainUserLanguageModelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTrainUserLanguageModelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves a list of normalization pipelines based on specific requirements.&lt;/p&gt;
     * </pre>
     */
    public ondewo.s2t.SpeechToText.ListS2tNormalizationPipelinesResponse listS2tNormalizationPipelines(ondewo.s2t.SpeechToText.ListS2tNormalizationPipelinesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListS2tNormalizationPipelinesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Speech2Text.
   * <pre>
   * &lt;p&gt;Speech-to-text service&lt;/p&gt;
   * </pre>
   */
  public static final class Speech2TextFutureStub
      extends io.grpc.stub.AbstractFutureStub<Speech2TextFutureStub> {
    private Speech2TextFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Speech2TextFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new Speech2TextFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * &lt;p&gt;Transcribes an audio file&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.s2t.SpeechToText.TranscribeFileResponse> transcribeFile(
        ondewo.s2t.SpeechToText.TranscribeFileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTranscribeFileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Gets a speech to text pipeline corresponding to the id specified in &lt;code&gt;S2tPipelineId&lt;/code&gt;. If no corresponding id is
     * found, raises &lt;code&gt;ModuleNotFoundError&lt;/code&gt; in server.&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.s2t.SpeechToText.Speech2TextConfig> getS2tPipeline(
        ondewo.s2t.SpeechToText.S2tPipelineId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetS2tPipelineMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Creates a new speech to text pipeline from a &lt;code&gt;Speech2TextConfig&lt;/code&gt; and registers the new pipeline in the server.&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.s2t.SpeechToText.S2tPipelineId> createS2tPipeline(
        ondewo.s2t.SpeechToText.Speech2TextConfig request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateS2tPipelineMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Deletes a pipeline corresponding to the id parsed in &lt;code&gt;S2tPipelineId&lt;/code&gt;. If no corresponding id is
     * found, raises &lt;code&gt;ModuleNotFoundError&lt;/code&gt; in server.&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteS2tPipeline(
        ondewo.s2t.SpeechToText.S2tPipelineId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteS2tPipelineMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Updates a pipeline with the id specified in &lt;code&gt;Speech2TextConfig&lt;/code&gt; with the new config. If no corresponding id is
     * found, raises &lt;code&gt;ModuleNotFoundError&lt;/code&gt; in server.&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateS2tPipeline(
        ondewo.s2t.SpeechToText.Speech2TextConfig request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateS2tPipelineMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Lists all speech to text pipelines.&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.s2t.SpeechToText.ListS2tPipelinesResponse> listS2tPipelines(
        ondewo.s2t.SpeechToText.ListS2tPipelinesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListS2tPipelinesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Returns a message containing a list of all languages for which there exist pipelines.&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.s2t.SpeechToText.ListS2tLanguagesResponse> listS2tLanguages(
        ondewo.s2t.SpeechToText.ListS2tLanguagesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListS2tLanguagesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Returns a message containing a list of all domains for which there exist pipelines.&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.s2t.SpeechToText.ListS2tDomainsResponse> listS2tDomains(
        ondewo.s2t.SpeechToText.ListS2tDomainsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListS2tDomainsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Returns a message containing the version of the running speech to text server.&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.s2t.SpeechToText.S2tGetServiceInfoResponse> getServiceInfo(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetServiceInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Given a list of pipeline ids, returns a list of &lt;code&gt;LanguageModelPipelineId&lt;/code&gt; messages containing the pipeline
     * id and a list of the language models loaded in the pipeline.&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.s2t.SpeechToText.ListS2tLanguageModelsResponse> listS2tLanguageModels(
        ondewo.s2t.SpeechToText.ListS2tLanguageModelsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListS2tLanguageModelsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Create a user language model.&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> createUserLanguageModel(
        ondewo.s2t.SpeechToText.CreateUserLanguageModelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateUserLanguageModelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Delete a user language model.&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteUserLanguageModel(
        ondewo.s2t.SpeechToText.DeleteUserLanguageModelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteUserLanguageModelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Add data to a user language model.&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> addDataToUserLanguageModel(
        ondewo.s2t.SpeechToText.AddDataToUserLanguageModelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddDataToUserLanguageModelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Train a user language model.&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> trainUserLanguageModel(
        ondewo.s2t.SpeechToText.TrainUserLanguageModelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTrainUserLanguageModelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * &lt;p&gt;Retrieves a list of normalization pipelines based on specific requirements.&lt;/p&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ondewo.s2t.SpeechToText.ListS2tNormalizationPipelinesResponse> listS2tNormalizationPipelines(
        ondewo.s2t.SpeechToText.ListS2tNormalizationPipelinesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListS2tNormalizationPipelinesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TRANSCRIBE_FILE = 0;
  private static final int METHODID_GET_S2T_PIPELINE = 1;
  private static final int METHODID_CREATE_S2T_PIPELINE = 2;
  private static final int METHODID_DELETE_S2T_PIPELINE = 3;
  private static final int METHODID_UPDATE_S2T_PIPELINE = 4;
  private static final int METHODID_LIST_S2T_PIPELINES = 5;
  private static final int METHODID_LIST_S2T_LANGUAGES = 6;
  private static final int METHODID_LIST_S2T_DOMAINS = 7;
  private static final int METHODID_GET_SERVICE_INFO = 8;
  private static final int METHODID_LIST_S2T_LANGUAGE_MODELS = 9;
  private static final int METHODID_CREATE_USER_LANGUAGE_MODEL = 10;
  private static final int METHODID_DELETE_USER_LANGUAGE_MODEL = 11;
  private static final int METHODID_ADD_DATA_TO_USER_LANGUAGE_MODEL = 12;
  private static final int METHODID_TRAIN_USER_LANGUAGE_MODEL = 13;
  private static final int METHODID_LIST_S2T_NORMALIZATION_PIPELINES = 14;
  private static final int METHODID_TRANSCRIBE_STREAM = 15;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TRANSCRIBE_FILE:
          serviceImpl.transcribeFile((ondewo.s2t.SpeechToText.TranscribeFileRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.s2t.SpeechToText.TranscribeFileResponse>) responseObserver);
          break;
        case METHODID_GET_S2T_PIPELINE:
          serviceImpl.getS2tPipeline((ondewo.s2t.SpeechToText.S2tPipelineId) request,
              (io.grpc.stub.StreamObserver<ondewo.s2t.SpeechToText.Speech2TextConfig>) responseObserver);
          break;
        case METHODID_CREATE_S2T_PIPELINE:
          serviceImpl.createS2tPipeline((ondewo.s2t.SpeechToText.Speech2TextConfig) request,
              (io.grpc.stub.StreamObserver<ondewo.s2t.SpeechToText.S2tPipelineId>) responseObserver);
          break;
        case METHODID_DELETE_S2T_PIPELINE:
          serviceImpl.deleteS2tPipeline((ondewo.s2t.SpeechToText.S2tPipelineId) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_S2T_PIPELINE:
          serviceImpl.updateS2tPipeline((ondewo.s2t.SpeechToText.Speech2TextConfig) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_S2T_PIPELINES:
          serviceImpl.listS2tPipelines((ondewo.s2t.SpeechToText.ListS2tPipelinesRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.s2t.SpeechToText.ListS2tPipelinesResponse>) responseObserver);
          break;
        case METHODID_LIST_S2T_LANGUAGES:
          serviceImpl.listS2tLanguages((ondewo.s2t.SpeechToText.ListS2tLanguagesRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.s2t.SpeechToText.ListS2tLanguagesResponse>) responseObserver);
          break;
        case METHODID_LIST_S2T_DOMAINS:
          serviceImpl.listS2tDomains((ondewo.s2t.SpeechToText.ListS2tDomainsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.s2t.SpeechToText.ListS2tDomainsResponse>) responseObserver);
          break;
        case METHODID_GET_SERVICE_INFO:
          serviceImpl.getServiceInfo((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<ondewo.s2t.SpeechToText.S2tGetServiceInfoResponse>) responseObserver);
          break;
        case METHODID_LIST_S2T_LANGUAGE_MODELS:
          serviceImpl.listS2tLanguageModels((ondewo.s2t.SpeechToText.ListS2tLanguageModelsRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.s2t.SpeechToText.ListS2tLanguageModelsResponse>) responseObserver);
          break;
        case METHODID_CREATE_USER_LANGUAGE_MODEL:
          serviceImpl.createUserLanguageModel((ondewo.s2t.SpeechToText.CreateUserLanguageModelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_USER_LANGUAGE_MODEL:
          serviceImpl.deleteUserLanguageModel((ondewo.s2t.SpeechToText.DeleteUserLanguageModelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_ADD_DATA_TO_USER_LANGUAGE_MODEL:
          serviceImpl.addDataToUserLanguageModel((ondewo.s2t.SpeechToText.AddDataToUserLanguageModelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_TRAIN_USER_LANGUAGE_MODEL:
          serviceImpl.trainUserLanguageModel((ondewo.s2t.SpeechToText.TrainUserLanguageModelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_S2T_NORMALIZATION_PIPELINES:
          serviceImpl.listS2tNormalizationPipelines((ondewo.s2t.SpeechToText.ListS2tNormalizationPipelinesRequest) request,
              (io.grpc.stub.StreamObserver<ondewo.s2t.SpeechToText.ListS2tNormalizationPipelinesResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TRANSCRIBE_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.transcribeStream(
              (io.grpc.stub.StreamObserver<ondewo.s2t.SpeechToText.TranscribeStreamResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getTranscribeFileMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.s2t.SpeechToText.TranscribeFileRequest,
              ondewo.s2t.SpeechToText.TranscribeFileResponse>(
                service, METHODID_TRANSCRIBE_FILE)))
        .addMethod(
          getTranscribeStreamMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              ondewo.s2t.SpeechToText.TranscribeStreamRequest,
              ondewo.s2t.SpeechToText.TranscribeStreamResponse>(
                service, METHODID_TRANSCRIBE_STREAM)))
        .addMethod(
          getGetS2tPipelineMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.s2t.SpeechToText.S2tPipelineId,
              ondewo.s2t.SpeechToText.Speech2TextConfig>(
                service, METHODID_GET_S2T_PIPELINE)))
        .addMethod(
          getCreateS2tPipelineMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.s2t.SpeechToText.Speech2TextConfig,
              ondewo.s2t.SpeechToText.S2tPipelineId>(
                service, METHODID_CREATE_S2T_PIPELINE)))
        .addMethod(
          getDeleteS2tPipelineMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.s2t.SpeechToText.S2tPipelineId,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_S2T_PIPELINE)))
        .addMethod(
          getUpdateS2tPipelineMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.s2t.SpeechToText.Speech2TextConfig,
              com.google.protobuf.Empty>(
                service, METHODID_UPDATE_S2T_PIPELINE)))
        .addMethod(
          getListS2tPipelinesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.s2t.SpeechToText.ListS2tPipelinesRequest,
              ondewo.s2t.SpeechToText.ListS2tPipelinesResponse>(
                service, METHODID_LIST_S2T_PIPELINES)))
        .addMethod(
          getListS2tLanguagesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.s2t.SpeechToText.ListS2tLanguagesRequest,
              ondewo.s2t.SpeechToText.ListS2tLanguagesResponse>(
                service, METHODID_LIST_S2T_LANGUAGES)))
        .addMethod(
          getListS2tDomainsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.s2t.SpeechToText.ListS2tDomainsRequest,
              ondewo.s2t.SpeechToText.ListS2tDomainsResponse>(
                service, METHODID_LIST_S2T_DOMAINS)))
        .addMethod(
          getGetServiceInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              ondewo.s2t.SpeechToText.S2tGetServiceInfoResponse>(
                service, METHODID_GET_SERVICE_INFO)))
        .addMethod(
          getListS2tLanguageModelsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.s2t.SpeechToText.ListS2tLanguageModelsRequest,
              ondewo.s2t.SpeechToText.ListS2tLanguageModelsResponse>(
                service, METHODID_LIST_S2T_LANGUAGE_MODELS)))
        .addMethod(
          getCreateUserLanguageModelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.s2t.SpeechToText.CreateUserLanguageModelRequest,
              com.google.protobuf.Empty>(
                service, METHODID_CREATE_USER_LANGUAGE_MODEL)))
        .addMethod(
          getDeleteUserLanguageModelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.s2t.SpeechToText.DeleteUserLanguageModelRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_USER_LANGUAGE_MODEL)))
        .addMethod(
          getAddDataToUserLanguageModelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.s2t.SpeechToText.AddDataToUserLanguageModelRequest,
              com.google.protobuf.Empty>(
                service, METHODID_ADD_DATA_TO_USER_LANGUAGE_MODEL)))
        .addMethod(
          getTrainUserLanguageModelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.s2t.SpeechToText.TrainUserLanguageModelRequest,
              com.google.protobuf.Empty>(
                service, METHODID_TRAIN_USER_LANGUAGE_MODEL)))
        .addMethod(
          getListS2tNormalizationPipelinesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ondewo.s2t.SpeechToText.ListS2tNormalizationPipelinesRequest,
              ondewo.s2t.SpeechToText.ListS2tNormalizationPipelinesResponse>(
                service, METHODID_LIST_S2T_NORMALIZATION_PIPELINES)))
        .build();
  }

  private static abstract class Speech2TextBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    Speech2TextBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ondewo.s2t.SpeechToText.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Speech2Text");
    }
  }

  private static final class Speech2TextFileDescriptorSupplier
      extends Speech2TextBaseDescriptorSupplier {
    Speech2TextFileDescriptorSupplier() {}
  }

  private static final class Speech2TextMethodDescriptorSupplier
      extends Speech2TextBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    Speech2TextMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (Speech2TextGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new Speech2TextFileDescriptorSupplier())
              .addMethod(getTranscribeFileMethod())
              .addMethod(getTranscribeStreamMethod())
              .addMethod(getGetS2tPipelineMethod())
              .addMethod(getCreateS2tPipelineMethod())
              .addMethod(getDeleteS2tPipelineMethod())
              .addMethod(getUpdateS2tPipelineMethod())
              .addMethod(getListS2tPipelinesMethod())
              .addMethod(getListS2tLanguagesMethod())
              .addMethod(getListS2tDomainsMethod())
              .addMethod(getGetServiceInfoMethod())
              .addMethod(getListS2tLanguageModelsMethod())
              .addMethod(getCreateUserLanguageModelMethod())
              .addMethod(getDeleteUserLanguageModelMethod())
              .addMethod(getAddDataToUserLanguageModelMethod())
              .addMethod(getTrainUserLanguageModelMethod())
              .addMethod(getListS2tNormalizationPipelinesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
