package ru.gb.lessons.interfaces.core.clients.home.impl;

import ru.gb.lessons.interfaces.Interfaces.Inheritors.RunFast;
import ru.gb.lessons.interfaces.Interfaces.Soundable;
import ru.gb.lessons.interfaces.core.clients.home.Pet;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;

import java.time.LocalDate;

/**
 Одна из реализаций домашнего животного
 */
public class Dog extends Pet implements Runnable, Soundable {
    public Dog() {
    }

    public Dog(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public void run() {
        System.out.println(CLASS_NAME + " can run with speed " + RunFast.speed);
    }

    @Override
    public void sound() {
        System.out.println("WOOF WOOF");
    }
}
