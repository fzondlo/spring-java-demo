package com.example.demo;

import org.springframework.stereotype.Component;

/**
 * Created by fxz5152 on 3/2/18.
 */
@Component
public class InjectedByConstructorService {
    private HelloWorldService helloWorldService;

    public InjectedByConstructorService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public void getMessage() {
        helloWorldService.sayHello();
    }
}
