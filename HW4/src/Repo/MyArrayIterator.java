package Repo;

import java.util.Iterator;

public class MyArrayIterator <T> implements Iterator {
    private int index;
    T[] list;

    public MyArrayIterator(T[] list) {
        this.index = 0;
        this.list = list;
    }

    @Override
    public boolean hasNext() {return index < list.length;}
    @Override
    public Object next() {return index++;}
}
