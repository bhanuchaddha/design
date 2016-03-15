package com.ben.visitor.Impl;

import com.ben.visitor.Item;
import com.ben.visitor.Visitor;

/**
 * Created by BEN on 15-Mar-16.
 */
public class Fruits implements Item {
    public int accept(Visitor v) {
        return v.visit(this);
    }
}
