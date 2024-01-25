package com.example.demo.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ProfileChecker {

    @Autowired
    private ApplicationContext applicationContext;

    public void checkActiveProfiles() {
        String[] activeProfiles = applicationContext.getEnvironment().getActiveProfiles();
        System.out.println("Active Profiles: " + String.join(", ", activeProfiles));
        
        // Check if a specific profile is active
        boolean isDevelopmentProfileActive = applicationContext.getEnvironment().acceptsProfiles("dev");
       // System.out.println("Is Development Profile Active? " + isDevelopmentProfileActive);
    }
}
