package com.seck.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.orm.jpa.support.OpenEntityManagerInViewInterceptor;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

import javax.persistence.EntityManagerFactory;
import java.util.List;

/**
 * Created by elias on 19/06/17.
 */

@Configuration
@EnableWebMvc
@ComponentScan("com.seck.controller")
public class WebConfig{

    @Bean
    ViewResolver setupViewResolver(){
        UrlBasedViewResolver resolver = new UrlBasedViewResolver();
        resolver.setPrefix("/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);
        return resolver;
    }

//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/views/").setViewName("index");
////        registry.addViewController("login").setViewName("login");
////        registry.addViewController("impersonate").setViewName("impersonate");
////        registry.addViewController("error").setViewName("error");
//        super.addViewControllers(registry);
//    }
//
//    @Override
//    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
//    }
//
//    @Override
//    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
//        configurer.enable();
//    }
//
//    @Autowired
//    private EntityManagerFactory entityManagerFactory;
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        OpenEntityManagerInViewInterceptor interceptor = new OpenEntityManagerInViewInterceptor();
//        interceptor.setEntityManagerFactory(entityManagerFactory);
//        registry.addWebRequestInterceptor(interceptor);
//    }

}
