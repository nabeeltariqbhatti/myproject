package com.example.myproject;

import org.springframework.boot.ApplicationArguments;
import org.springframework.context.annotation.Profile;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Component

@Order(0)

public class MyBean implements Ordered {

    public MyBean(ApplicationArguments args){
        boolean debug = args.containsOption("debug");

        List<String> files = args.getNonOptionArgs();
        if(debug){
            System.out.println(files);
        }
    }

    MyBean(){
        System.out.println("created at number 0");
    }
    @Override
    public int getOrder() {
        return 0;
    }
}
