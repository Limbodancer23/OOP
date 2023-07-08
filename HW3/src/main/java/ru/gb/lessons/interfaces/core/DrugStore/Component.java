package ru.gb.lessons.interfaces.core.DrugStore;

import java.util.Objects;

public class Component extends ComponentIterator {
    private String name;
    private String weight;
    private  int power;



    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public String getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Component{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", power=" + power +
                ", componentCount=" + componentCount +
                '}';
    }

    public int getPower() {
        return this.power;
    }

    @Override
    public boolean equals(Object o) {
        Component c = (Component) o;
        return
//                c.id == this.id;
                c.power == this.power
                && c.name == this.name
                && c.weight == this.weight;
    }

    @Override
    public int hashCode() {
        int total = 63;
        total = total * 63 + name.hashCode();
        total = total * 63 + weight.hashCode();
        total = total * 63 + power;
        return total;
    }
}
