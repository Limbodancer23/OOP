package ru.gb.lessons.interfaces.core.DrugStore;

import java.util.*;

public class Pharmacy implements Iterable<Component>, Comparable<Pharmacy> {
    private List<Component> components;
    private int componentCount;
    private int id;
    static int counter = 0;


    public Pharmacy() {
        this.components = new ArrayList<>();

        this.id = counter++;
        this.componentCount++;
    }

    public Pharmacy addComponent(Component component) {
            if (!(components.contains(component))){
                this.components.add(component);
            }
//        this.componentCount++;
        return this;
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "components=" + components + ", id=" + id +
                ", componentCount=" + componentCount +
                '}'+"Total power = " + getPower(this) + "\n";
    }

    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() { //Анонимный класс
            public Component next() {
                return components.get(componentCount++);
            }

            public boolean hasNext() {
                return componentCount < components.size();
            }
        };

    }

    @Override
    public int compareTo(Pharmacy o) {
        int power1 = getPower(this); String str1 = getName(this);
        int power2 = getPower(o); String str2 = getName(o);

        if (power1 == power2){
            int res = str1.compareTo(str2);;
            if (res < 0) return -1;
            else if (res > 0) return 1;
            else return 0;
        }
        return Integer.compare(power1, power2);
    }

    private int getPower(Pharmacy pharm){
        int count = 0;
        for (Component el: pharm.getComponents()) {
            count += el.getPower();
        }
        return count;
    }

    private String getName(Pharmacy o){
        String sb = new String();
        for (Component el: o.getComponents()) {
            sb += (el.getName().length());
        }
        return sb;
    }

    @Override
    public int hashCode() {
        return Objects.hash(components, componentCount, id);
    }
        @Override
    public boolean equals(Object o) {
        Pharmacy temp = (Pharmacy) o;
        return temp.id == this.id;

    }


}




