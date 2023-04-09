package DesignPatterns.Observer.listeners;

import java.io.File;

public class EmailListener implements EventListener {

    private String mail;


    public EmailListener(String mail) {
        this.mail = mail;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Email to " + this.mail + ": Someone has performed " + eventType + " operation with the following file : " + file.getName());
    }
}
