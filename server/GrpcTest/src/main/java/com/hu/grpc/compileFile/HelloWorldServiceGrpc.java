package com.hu.grpc.compileFile;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * 服务名字
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.11.0)",
    comments = "Source: helloWorld.proto")
public final class HelloWorldServiceGrpc {

  private HelloWorldServiceGrpc() {}

  public static final String SERVICE_NAME = "com.hu.grpc.compileFile.HelloWorldService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSayHelloMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.hu.grpc.compileFile.Person,
      com.hu.grpc.compileFile.PinnedPart> METHOD_SAY_HELLO = getSayHelloMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.hu.grpc.compileFile.Person,
      com.hu.grpc.compileFile.PinnedPart> getSayHelloMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.hu.grpc.compileFile.Person,
      com.hu.grpc.compileFile.PinnedPart> getSayHelloMethod() {
    return getSayHelloMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.hu.grpc.compileFile.Person,
      com.hu.grpc.compileFile.PinnedPart> getSayHelloMethodHelper() {
    io.grpc.MethodDescriptor<com.hu.grpc.compileFile.Person, com.hu.grpc.compileFile.PinnedPart> getSayHelloMethod;
    if ((getSayHelloMethod = HelloWorldServiceGrpc.getSayHelloMethod) == null) {
      synchronized (HelloWorldServiceGrpc.class) {
        if ((getSayHelloMethod = HelloWorldServiceGrpc.getSayHelloMethod) == null) {
          HelloWorldServiceGrpc.getSayHelloMethod = getSayHelloMethod = 
              io.grpc.MethodDescriptor.<com.hu.grpc.compileFile.Person, com.hu.grpc.compileFile.PinnedPart>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.hu.grpc.compileFile.HelloWorldService", "sayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hu.grpc.compileFile.Person.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hu.grpc.compileFile.PinnedPart.getDefaultInstance()))
                  .setSchemaDescriptor(new HelloWorldServiceMethodDescriptorSupplier("sayHello"))
                  .build();
          }
        }
     }
     return getSayHelloMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSayGreetingMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.hu.grpc.compileFile.Person,
      com.hu.grpc.compileFile.Greeting> METHOD_SAY_GREETING = getSayGreetingMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.hu.grpc.compileFile.Person,
      com.hu.grpc.compileFile.Greeting> getSayGreetingMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.hu.grpc.compileFile.Person,
      com.hu.grpc.compileFile.Greeting> getSayGreetingMethod() {
    return getSayGreetingMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.hu.grpc.compileFile.Person,
      com.hu.grpc.compileFile.Greeting> getSayGreetingMethodHelper() {
    io.grpc.MethodDescriptor<com.hu.grpc.compileFile.Person, com.hu.grpc.compileFile.Greeting> getSayGreetingMethod;
    if ((getSayGreetingMethod = HelloWorldServiceGrpc.getSayGreetingMethod) == null) {
      synchronized (HelloWorldServiceGrpc.class) {
        if ((getSayGreetingMethod = HelloWorldServiceGrpc.getSayGreetingMethod) == null) {
          HelloWorldServiceGrpc.getSayGreetingMethod = getSayGreetingMethod = 
              io.grpc.MethodDescriptor.<com.hu.grpc.compileFile.Person, com.hu.grpc.compileFile.Greeting>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.hu.grpc.compileFile.HelloWorldService", "sayGreeting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hu.grpc.compileFile.Person.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hu.grpc.compileFile.Greeting.getDefaultInstance()))
                  .setSchemaDescriptor(new HelloWorldServiceMethodDescriptorSupplier("sayGreeting"))
                  .build();
          }
        }
     }
     return getSayGreetingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloWorldServiceStub newStub(io.grpc.Channel channel) {
    return new HelloWorldServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelloWorldServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HelloWorldServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HelloWorldServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HelloWorldServiceFutureStub(channel);
  }

  /**
   * <pre>
   * 服务名字
   * </pre>
   */
  public static abstract class HelloWorldServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 方法 sayHello
     * 入参 Person
     * 返回值 Greeting
     * </pre>
     */
    public void sayHello(com.hu.grpc.compileFile.Person request,
        io.grpc.stub.StreamObserver<com.hu.grpc.compileFile.PinnedPart> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethodHelper(), responseObserver);
    }

    /**
     */
    public void sayGreeting(com.hu.grpc.compileFile.Person request,
        io.grpc.stub.StreamObserver<com.hu.grpc.compileFile.Greeting> responseObserver) {
      asyncUnimplementedUnaryCall(getSayGreetingMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hu.grpc.compileFile.Person,
                com.hu.grpc.compileFile.PinnedPart>(
                  this, METHODID_SAY_HELLO)))
          .addMethod(
            getSayGreetingMethodHelper(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.hu.grpc.compileFile.Person,
                com.hu.grpc.compileFile.Greeting>(
                  this, METHODID_SAY_GREETING)))
          .build();
    }
  }

  /**
   * <pre>
   * 服务名字
   * </pre>
   */
  public static final class HelloWorldServiceStub extends io.grpc.stub.AbstractStub<HelloWorldServiceStub> {
    private HelloWorldServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloWorldServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloWorldServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloWorldServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 方法 sayHello
     * 入参 Person
     * 返回值 Greeting
     * </pre>
     */
    public void sayHello(com.hu.grpc.compileFile.Person request,
        io.grpc.stub.StreamObserver<com.hu.grpc.compileFile.PinnedPart> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sayGreeting(com.hu.grpc.compileFile.Person request,
        io.grpc.stub.StreamObserver<com.hu.grpc.compileFile.Greeting> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSayGreetingMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * 服务名字
   * </pre>
   */
  public static final class HelloWorldServiceBlockingStub extends io.grpc.stub.AbstractStub<HelloWorldServiceBlockingStub> {
    private HelloWorldServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloWorldServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloWorldServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloWorldServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 方法 sayHello
     * 入参 Person
     * 返回值 Greeting
     * </pre>
     */
    public com.hu.grpc.compileFile.PinnedPart sayHello(com.hu.grpc.compileFile.Person request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.hu.grpc.compileFile.Greeting> sayGreeting(
        com.hu.grpc.compileFile.Person request) {
      return blockingServerStreamingCall(
          getChannel(), getSayGreetingMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 服务名字
   * </pre>
   */
  public static final class HelloWorldServiceFutureStub extends io.grpc.stub.AbstractStub<HelloWorldServiceFutureStub> {
    private HelloWorldServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloWorldServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloWorldServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloWorldServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 方法 sayHello
     * 入参 Person
     * 返回值 Greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hu.grpc.compileFile.PinnedPart> sayHello(
        com.hu.grpc.compileFile.Person request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_SAY_GREETING = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HelloWorldServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HelloWorldServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((com.hu.grpc.compileFile.Person) request,
              (io.grpc.stub.StreamObserver<com.hu.grpc.compileFile.PinnedPart>) responseObserver);
          break;
        case METHODID_SAY_GREETING:
          serviceImpl.sayGreeting((com.hu.grpc.compileFile.Person) request,
              (io.grpc.stub.StreamObserver<com.hu.grpc.compileFile.Greeting>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class HelloWorldServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HelloWorldServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.hu.grpc.compileFile.HelloWorld.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HelloWorldService");
    }
  }

  private static final class HelloWorldServiceFileDescriptorSupplier
      extends HelloWorldServiceBaseDescriptorSupplier {
    HelloWorldServiceFileDescriptorSupplier() {}
  }

  private static final class HelloWorldServiceMethodDescriptorSupplier
      extends HelloWorldServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HelloWorldServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HelloWorldServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HelloWorldServiceFileDescriptorSupplier())
              .addMethod(getSayHelloMethodHelper())
              .addMethod(getSayGreetingMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
