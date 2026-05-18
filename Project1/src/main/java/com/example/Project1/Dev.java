package com.example.Project1;

import org.springframework.aop.scope.ScopedProxyUtils;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    public void build(){
        System.out.println("Hello World");
    }
}
