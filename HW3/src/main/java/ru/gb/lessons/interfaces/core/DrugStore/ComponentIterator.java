package ru.gb.lessons.interfaces.core.DrugStore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ComponentIterator implements Iterator<Component> {
    List <Component> components = new ArrayList<>();
    int componentCount = 0;
    public Component next() {

        return components.get(componentCount++);
    }

    public boolean hasNext() {
        return componentCount < components.size();
    }

    @Override
    public boolean equals(Object o) {
        Component c = (Component) o;
        return c.components == this.components;
    }

    //    @Override
//    public String toString() {
//        return "ComponentIterator{" +
//                "components=" + components +
//                ", componentCount=" + componentCount +
//                '}';
//    }
}
