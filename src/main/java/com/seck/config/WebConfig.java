package com.seck.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

/**
 * Created by elias on 19/06/17.
 */

@Configuration
@EnableWebMvc
@ComponentScan("com.seck.controller")
public class WebConfig extends WebMvcConfigurerAdapter{

    @Bean
    UrlBasedViewResolver setupViewResolver(){
        UrlBasedViewResolver resolver = new UrlBasedViewResolver();
        resolver.setPrefix("/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);
        return resolver;
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/views/").setViewName("index");
//        registry.addViewController("login").setViewName("login");
//        registry.addViewController("impersonate").setViewName("impersonate");
//        registry.addViewController("error").setViewName("error");
        super.addViewControllers(registry);
    }

}
