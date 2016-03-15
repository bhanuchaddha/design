package com.ben.observer.impl;

import com.ben.observer.Observer;
import com.ben.observer.Topic;

/**
 * Created by BEN on 15-Mar-16.
 */
public class ObserverImpl implements Observer{
    private String name;

    public ObserverImpl(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void update(Topic t) {
        System.out.println(getName() +" observer received message: "+t.getMessage()+" from topic "+t.getName());
    }
}
