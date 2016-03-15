package com.ben.visitor;

import com.ben.visitor.Impl.Book;
import com.ben.visitor.Impl.Fruits;

/**
 * Created by BEN on 15-Mar-16.
 */
public interface Visitor {

    public int visit(Book b);
    public int visit(Fruits f);
}
