package com.ben.observer.impl;

import com.ben.observer.Observer;
import com.ben.observer.Topic;

import java.util.ArrayList;

/**
 * Created by BEN on 15-Mar-16.
 */
public class TopicImpl implements Topic {
    private String name;
    private String message;
    private ArrayList<Observer> observers=null;
    private boolean changed=false;

    public TopicImpl(String name) {
        this.name = name;
        observers=new ArrayList<Observer>();
    }

    private void setMessage(String message) {
        this.message = message;
        this.changed=true;
    }

    public void registerObserver(Observer ob) {
            observers.add(ob);
    }

    public void unregisterObserver(Observer ob) {
            observers.remove(ob);
    }

    public void postMessage(String message) {
        setMessage(message);
        updateObservers();
    }

    public void updateObservers() {
        if(changed){
            for(Observer o : observers){
                o.update(this);
            }
         this.changed=false;
        }else
            System.out.println("nothing have been changed in  "+getName());

    }

    public String getMessage() {
        return message;
    }

    public String getName() {
        return name;
    }
}
