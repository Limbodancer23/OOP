package ru.gb.lessons.interfaces.core.clients.wild.impl;

import ru.gb.lessons.interfaces.Interfaces.Flyable;
import ru.gb.lessons.interfaces.Interfaces.Inheritors.FlyFast;
import ru.gb.lessons.interfaces.Interfaces.Inheritors.FlySlow;
import ru.gb.lessons.interfaces.Interfaces.Soundable;
import ru.gb.lessons.interfaces.core.clients.wild.WildAnimal;

public class Eagle extends WildAnimal implements Flyable, Soundable {

    @Override
    public void fly() {
        System.out.println(CLASS_NAME + " can fly with speed " + FlyFast.flySpeed);
    }


    @Override
    public void sound() {
        System.out.println("Eagle sounds...");
    }
}