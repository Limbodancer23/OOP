package ru.gb.lessons.interfaces.Interfaces.Inheritors;

import ru.gb.lessons.interfaces.Interfaces.Swimable;

public interface SwimFast extends Swimable {
    String speed = "5 km/h";

    @Override
    void swim();
}