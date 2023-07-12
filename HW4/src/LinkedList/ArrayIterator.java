package LinkedList;

import java.util.Iterator;

public class ArrayIterator <T> implements Iterator<T> {
    int index;
    T[] values;

    public ArrayIterator(T[] values) {
        this.index = 0;
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public T next() {
        return values[index++];
    }
}
