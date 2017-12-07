package com.xiaoliang.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBootJavajConfig {
    @Value("${guru.jms.server}")
    String jmsServer;

    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker fake = new FakeJmsBroker();
        fake.setJmsServer(jmsServer);
        return fake;
    }

}
