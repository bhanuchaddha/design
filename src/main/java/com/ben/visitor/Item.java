package com.ben.visitor;

/**
 * Created by BEN on 15-Mar-16.
 */
public interface Item {
    public int accept(Visitor v);
}
