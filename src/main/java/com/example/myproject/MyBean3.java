package com.example.myproject;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;


@Component
@Order(2)
public class MyBean3 implements Ordered {


    MyBean3(){
        System.out.println(" I am created at #2" );
    }


    @Override
    public int getOrder() {
        return 2;
    }
}
