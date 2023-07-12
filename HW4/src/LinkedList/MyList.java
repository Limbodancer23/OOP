package LinkedList;

public interface MyList <T> extends Iterable{

    Boolean add(T t);

    boolean add(int index, T t);

    boolean addFirst(T t);

    boolean addLast(T t);

    T get(int index);


    int size();


}
