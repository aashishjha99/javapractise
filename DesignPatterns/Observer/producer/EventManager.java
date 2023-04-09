package DesignPatterns.Observer.producer;

import DesignPatterns.Observer.listeners.EventListener;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {

    Map<String, List<EventListener>> listener = new HashMap<>();

    public EventManager(String... listener){
        for(String operation : listener){
            this.listener.put(operation,new ArrayList<>());
        }
    }


    public  void subcribe(String eventType, EventListener eventListener){
        List<EventListener> users = listener.get(eventType);
        users.add(eventListener);
    }

    public void unsubscribe(String eventType, EventListener eventListener){
        List<EventListener> users = listener.get(eventType);
        users.remove(eventListener);
    }

    public void notify(String eventType, File file){
        List<EventListener> users = listener.get(eventType);
        for (EventListener eventListener: users){
            eventListener.update(eventType,file);
        }
    }
}
