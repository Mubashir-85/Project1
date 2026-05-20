package com.example.Project1;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Laptop1 implements Computer{
    public void compile(){
        System.out.println("Laptop");
    }
}
