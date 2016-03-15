package com.ben.observer;

import com.ben.observer.impl.ObserverImpl;
import com.ben.observer.impl.TopicImpl;

/**
 * Created by BEN on 15-Mar-16.
 */
public class Runner {

    public static void main(String [] args){

        Observer  o1= new ObserverImpl("o1");
        Observer  o2= new ObserverImpl("o2");
        Observer  o3= new ObserverImpl("o3");
        Observer  o4= new ObserverImpl("o4");

        Topic t1 = new TopicImpl("t1");
        Topic t2 = new TopicImpl("t2");
        t1.registerObserver(o1);
        t1.registerObserver(o2);
        t1.registerObserver(o3);
        t2.registerObserver(o3);
        t2.registerObserver(o4);

        t1.updateObservers();
        t1.postMessage("message 1");
        t1.updateObservers();
        t2.postMessage("message 2");

    }
}
