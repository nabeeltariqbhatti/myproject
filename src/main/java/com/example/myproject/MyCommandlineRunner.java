package com.example.myproject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Order(1)
public class MyCommandlineRunner implements  Ordered {
//    @Override
//    public void run(String... args) throws Exception {
//        System.out.println("command line runner is called and created at number 1");
//    }

    MyCommandlineRunner(){
        System.out.println("i am number 1");
    }
    @Override
    public int getOrder() {
        return 1;
    }
}
