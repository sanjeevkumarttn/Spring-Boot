package com.springboot.SpringBoot.event;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap {

    @EventListener(ApplicationStartedEvent.class)
    public void init(){
        System.out.println("Your Application is up and running");
    }
}
