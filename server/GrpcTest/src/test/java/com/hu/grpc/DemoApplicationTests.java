package com.hu.grpc;

import com.hu.grpc.client.HelloWorldClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private HelloWorldClient helloWorldClient;

    @Test
    void contextLoads() {
    }

    @Test
    public void testSayHello() {
        helloWorldClient.sayHello("John", "Doe");
    }

    @Test
    public void testSayHello2() {
        helloWorldClient.sayGreeting("John", "Doe");
    }


}
