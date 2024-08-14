package com.github.pablowinck.testaspectdebug;

import org.springframework.stereotype.Component;

@Component
public class DemoComponent {
    @TimeLogger
    public void sayHello() {
        System.out.println("hello");
    }
}