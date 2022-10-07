package com.study.mvc20220927jaeryul.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

    @Bean
    public TestSetting testSetting() { //이 메소드 명으로 bean객체가 들어오게 된다.
        return new TestSetting();
    }

}
