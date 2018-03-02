package com.example.demo;

import org.springframework.stereotype.Component;

/**
 * Created by fxz5152 on 3/2/18.
 */
@Component
public class HelloWorldImpl implements HelloWorldService{
    public int getCallCount() {
        return callCount;
    }

    public void setCallCount(int callCount) {
        this.callCount = callCount;
    }

    private int callCount = 0;

    public void sayHello() {
        setCallCount(getCallCount() + 1);
        System.out.println("Called " + getCallCount());
    }

}
