package LinkedList;

import java.util.Arrays;
import java.util.Iterator;

public class LList <E> implements MyList<E>{
    private E[] values;


    @SuppressWarnings("unchecked")
    public LList() {
        this.values = (E[]) new Object[0];
    }

    @SuppressWarnings("unchecked")
    @Override
    public Boolean add(E e) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = e;
            return true;
        }
        catch (ClassCastException exception){
            System.out.println(exception.getMessage());
        }
        return false;
    }

    @Override
    public boolean add(int index, E e) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, index);
            values[index] = e;
            int amountElementsAfterIndex = temp.length - index;
            System.arraycopy(temp, index , values, index + 1, amountElementsAfterIndex);
            return true;
        }
        catch (ClassCastException exception){
            System.out.println(exception.getMessage());
        }
        return false;
    }

    @Override
    public boolean addFirst(E e) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            values[0] = e;
            System.arraycopy(temp, 0, values, 1, temp.length);
            return true;
        }
        catch (ClassCastException exception){
            System.out.println(exception.getMessage());
        }
        return false;
    }

    @Override
    public boolean addLast(E e) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            values[values.length-1] = e;
            System.arraycopy(temp, 0, values, 0, temp.length);
            return true;
        }
        catch (ClassCastException exception){
            System.out.println(exception.getMessage());
        }
        return false;
    }

    @Override
    public E get(int index) {
        return values[index];

    }

    @Override
    public int size() {
        return values.length;

    }

    @Override
    public Iterator iterator() {
        return new ArrayIterator<E>(values);
    }

    @Override
    public String toString() {
        return "LList{" +
                "values=" + Arrays.toString(values) +
                '}';
    }
}
