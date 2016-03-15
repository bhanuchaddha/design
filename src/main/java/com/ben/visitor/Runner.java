package com.ben.visitor;

import com.ben.visitor.Impl.Book;
import com.ben.visitor.Impl.Fruits;
import com.ben.visitor.Impl.VisitorImpl;

/**
 * Created by BEN on 15-Mar-16.
 */
public class Runner {
    public static void main(String [] args){
        Item f= new Fruits();
        Item b= new Book();
        Visitor v = new VisitorImpl();
        f.accept(v);
        b.accept(v);
    }
}
