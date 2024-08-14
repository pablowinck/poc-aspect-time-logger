package com.github.pablowinck.testaspectdebug;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class TestAspectDebugApplication implements CommandLineRunner {

    @Autowired
    private DemoComponent demoComponent;


    public static void main(String[] args) {
        SpringApplication.run(TestAspectDebugApplication.class, args);
    }


    @Override
    public void run(String... args) {
        demoComponent.sayHello();
    }
}
