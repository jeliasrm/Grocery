package com.seck.config;

import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.Properties;
import java.util.concurrent.Executor;

@Configuration
@Import({ HibernateConfig.class })
@ComponentScan({"com.seck"})
@EnableAsync
public class AppConfig {

//    @Bean(name = "threadPoolTaskExecutor")
//    public Executor threadPoolTaskExecutor() {
//        return new ThreadPoolTaskExecutor();
//    }

}
