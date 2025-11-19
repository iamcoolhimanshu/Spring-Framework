package com.Udemy.spring_framework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Udemy.spring_framework.Controller.DemoController;
import com.Udemy.spring_framework.Service.DemoService;
import com.Udemy.spring_framework.repositery.DemoRepositery;

public class DemoClient {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new 
        		AnnotationConfigApplicationContext(AppConfig.class);
        
        DemoController demoController=applicationContext.getBean(DemoController.class);
        System.out.println(demoController.hello());
        
        DemoService demoService=applicationContext.getBean(DemoService.class);
        System.out.println(demoService.hello());
        
        DemoRepositery demoRepositery=applicationContext.getBean(DemoRepositery.class);
        System.out.println(demoRepositery.hello());

}
    }