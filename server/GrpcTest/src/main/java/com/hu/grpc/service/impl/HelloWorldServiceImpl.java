package com.hu.grpc.service.impl;

import com.hu.grpc.compileFile.*;
import com.hu.grpc.service.HelloWorldServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import org.lognet.springboot.grpc.GRpcService;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@GRpcService
public class HelloWorldServiceImpl extends HelloWorldServiceGrpc.HelloWorldServiceImplBase {

    /**
     * @param request
     * @param responseObserver
     */
    @Override
    public void sayHello(Person request, StreamObserver<PinnedPart> responseObserver) {
        // super.sayHello(request, responseObserver);
        log.info("服务端收到信息: server received {}", request);

        List<Greeting> greetingList = new ArrayList<>();
        for (int i = 0; i <= 1; i++) {
            String message = "Hello " + request.getFirstName() + " " + request.getLastName() + "!" + i;
            Greeting greeting = Greeting.newBuilder().setMessage(message).build();
            greetingList.add(greeting);
        }
        PinnedPart pinnedPart = PinnedPart.newBuilder().setPartType(1).setIgnoreMcc(true).addAllDataSet(greetingList).build();

        log.info("服务端返回信息: server responded {}", pinnedPart);
        // 返回数据 onNext 方法一个一个的处理客户端连续发送的消息，对应着客户端的一次onNext 调用
        responseObserver.onNext(pinnedPart);


        // 结束方法 onCompleted方法表示 客户端发送消息结束，对应着客户端的一次onCompleted 调用
        responseObserver.onCompleted();
    }

    /**
     * @param request
     * @param responseObserver
     */
    @Override
    public void sayGreeting(Person request, StreamObserver<Greeting> responseObserver) {
        // super.sayHello(request, responseObserver);
        log.info("服务端收到信息: server received {}", request);


        Greeting greeting = Greeting.newBuilder().setMessage("hello1").build();
        Greeting greeting2 = Greeting.newBuilder().setMessage("hello2").build();

        log.info("服务端返回信息1: server responded");
        // 返回数据 onNext 方法一个一个的处理客户端连续发送的消息，对应着客户端的一次onNext 调用
        responseObserver.onNext(greeting);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("服务端返回信息2: server responded");
        responseObserver.onNext(greeting2);

        // 结束方法 onCompleted方法表示 客户端发送消息结束，对应着客户端的一次onCompleted 调用
        responseObserver.onCompleted();
    }
}