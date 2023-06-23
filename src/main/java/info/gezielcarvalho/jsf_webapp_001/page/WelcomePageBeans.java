/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info.gezielcarvalho.jsf_webapp_001.page;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

/**
 *
 * @author Geziel Carvalho
 */
@Named("welcomePageBean")
@RequestScoped
public class WelcomePageBeans {
    
    private String welcomeUserName;
    private String completedGreeting;

    public String getWelcomeUserName() {
        return welcomeUserName;
    }

    public void setWelcomeUserName(String welcomeUserName) {
        this.welcomeUserName = welcomeUserName;
    }

    public String getCompletedGreeting() {
        return completedGreeting;
    }

    public void setCompletedGreeting(String completedGreeting) {
        this.completedGreeting = completedGreeting;
    }
    
    public void sayHello(){
        completedGreeting = "Hello, "+welcomeUserName;
    }
}
