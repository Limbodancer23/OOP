package LinkedList;

public class Main {
    public static void main(String[] args) {
        LList<Number> list = new LList<>();
        System.out.println(list);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.addFirst(32);
        System.out.println(list);
        list.addLast(23);
        System.out.println(list);
        System.out.println(list.get(0));
        list.add(3,421);
        System.out.println(list.size());
    }
}
