package ru.gb.lessons.interfaces.core.DrugStore;

import java.util.*;

//Сделать так, чтобы после добавления нескольких одинаковых объектов Pharmacy, в сете result были только уникальные.
//
//        Set<Pharmacy> result = new HashSet<>();
//        System.out.println(result.size()); //
//        Переписать compareTo так, чтобы если power лекарств равны, сравнение шло еще и по названиям компонентов лекарства/
public class Main {
    public static void main(String[] args) {

        Pharmacy pharmacy = new Pharmacy();
        Component comp1 = new Component("Aspirin", "0,1", 5);
        Component comp2 = new Component("Spirit", "100", 100);
        pharmacy.addComponent(comp1).addComponent(comp2).addComponent(comp1);

        Pharmacy pharmacy2 = new Pharmacy();
        Component comp3 = new Component("Botox", "0,1", 5);
        Component comp4 = new Component("Gel", "100", 100);
        pharmacy2.addComponent(comp3).addComponent(comp4);

        Pharmacy pharmacy3 = new Pharmacy();
        Component comp5 = new Component("Immodium", "0,1",5);
        Component comp6 = new Component("Ferwex", "100", 100);
        pharmacy3.addComponent(comp5).addComponent(comp6);


        List<Pharmacy> list = new ArrayList<>();
        list.add(pharmacy3);
        list.add(pharmacy2);
        list.add(pharmacy);
        System.out.println(list);
        Collections.sort(list);
        System.out.println("______Задание второе_________");
        System.out.println(list);  // Список отсортировался по именам

        System.out.println("----Задание первое-------");

        Set <Pharmacy> mySet = new HashSet<>();
        mySet.add(pharmacy);
        mySet.add(pharmacy2);
        mySet.add(pharmacy3);
        mySet.add(pharmacy3); // Обьект не добавился
        System.out.println(mySet);


    }
}
