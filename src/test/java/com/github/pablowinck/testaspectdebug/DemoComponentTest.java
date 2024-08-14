package com.github.pablowinck.testaspectdebug;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@Import(AnnotationAwareAspectJAutoProxyCreator.class)
@SpringBootTest(classes = {DemoComponent.class, TimeLoggerAspect.class})
class DemoComponentTest {

    @Autowired
    private DemoComponent demoComponent;

    @Test
    public void shouldLogMethodTiming() {
        demoComponent.sayHello();
    }
}