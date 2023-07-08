package ru.gb.lessons.interfaces.core.clients.wild.impl;

import ru.gb.lessons.interfaces.Interfaces.Inheritors.FlyFast;
import ru.gb.lessons.interfaces.Interfaces.Inheritors.RunFast;
import ru.gb.lessons.interfaces.Interfaces.Soundable;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;
import ru.gb.lessons.interfaces.core.clients.wild.WildAnimal;

import java.time.LocalDate;

/**
 Одна из реализаций дикого животного
 */
public class WildCat extends WildAnimal implements Runnable, Soundable {
    public WildCat() {
    }

    public WildCat(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public void run() {
        System.out.println(CLASS_NAME + " can run with speed " + RunFast.speed);
    }

    @Override
    public void sound() {
        System.out.println("Grrr...");
    }
}
