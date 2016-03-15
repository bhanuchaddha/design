package com.ben.visitor.Impl;

import com.ben.visitor.Visitor;

/**
 * Created by BEN on 15-Mar-16.
 */
public class VisitorImpl implements Visitor{

    public int visit(Book b) {
        System.out.println("calculation from book");
        return 5;
    }

    public int visit(Fruits f) {
        System.out.println("calculation from Fruit");
        return 10;
    }
}
