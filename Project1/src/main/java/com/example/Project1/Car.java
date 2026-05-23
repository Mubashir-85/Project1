package com.example.Project1;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
    private Engine engine;
    @Autowired
    public Car(Engine engine){
        this.engine = engine;
    }
    public void drive(){
        engine.start();
        System.out.println("Car is Running");
    }
}
