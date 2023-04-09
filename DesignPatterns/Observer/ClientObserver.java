package DesignPatterns.Observer;

import DesignPatterns.Observer.editor.Editor;
import DesignPatterns.Observer.listeners.EmailListener;
import DesignPatterns.Observer.listeners.LogOpenListener;

public class ClientObserver {


    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.eventManager.subcribe("open", new LogOpenListener("/home/aashish/c.txt"));
        editor.eventManager.subcribe("save", new EmailListener("aashishjhaoff@gmail.com"));

        try {
            editor.openFile("test.txt");
            editor.save();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
