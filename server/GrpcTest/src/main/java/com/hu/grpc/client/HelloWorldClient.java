package com.hu.grpc.client;

import com.hu.grpc.compileFile.Greeting;
import com.hu.grpc.compileFile.HelloWorldServiceGrpc;
import com.hu.grpc.compileFile.Person;
import com.hu.grpc.compileFile.PinnedPart;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import java.util.Iterator;
import java.util.List;

/**
 * @Author wei.chen8
 * @Date 2022/7/5 14:24
 * @Version 1.0
 */
@Component
@Slf4j
public class HelloWorldClient {
    private HelloWorldServiceGrpc.HelloWorldServiceBlockingStub helloWorldServiceBlockingStub;

    @PostConstruct
    // 初始化信道和存根: 信道,用于RPC通信的ip和端口号; 存根,存放的客户端提供的对应方法
    private void init() {
        // 对应的服务器地址
        ManagedChannel managedChannel = ManagedChannelBuilder
                .forAddress("127.0.0.1", 6565).usePlaintext().build();

        // 客户端存根,调用方法就是对应的服务器提供的相应方法
        helloWorldServiceBlockingStub =
                HelloWorldServiceGrpc.newBlockingStub(managedChannel);



    }

    public void sayHello(String firstName, String lastName) {
        // 根据参数创建入参
        Person person = Person.newBuilder().setFirstName(firstName)
                .setLastName(lastName).build();
        log.info("客户端发送信息: client sending {}", person);

        // 客户端调用对应的方法,并获得对应的返回值
        PinnedPart greeting =
                helloWorldServiceBlockingStub.sayHello(person);
        log.info("客户端收到信息: client received {}", greeting);

        //return greeting.getMessage();
    }

    public void sayGreeting(String firstName, String lastName) {
        // 根据参数创建入参
        Person person = Person.newBuilder().setFirstName(firstName)
                .setLastName(lastName).build();
        log.info("客户端发送信息: client sending {}", person);

        // 客户端调用对应的方法,并获得对应的返回值
        Iterator<Greeting> greeting =
                 helloWorldServiceBlockingStub.sayGreeting(person);
        log.info("客户端收到信息: client received: {}",greeting.next());
        while (greeting.hasNext()) {
            log.info("打印数据{}",greeting.next());
        }

        //return greeting.getMessage();
    }
}
