package com.ben.observer;

/**
 * Created by BEN on 15-Mar-16.
 */
public interface Topic {
    public void registerObserver(Observer ob);
    public void unregisterObserver(Observer ob);
    public void updateObservers();
    public String getMessage();
    public String getName();
    public void postMessage(String message);
}
