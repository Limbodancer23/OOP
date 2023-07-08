package ru.gb.lessons.interfaces.Interfaces.Inheritors;
import ru.gb.lessons.interfaces.Interfaces.Swimable;

public interface SwimSlow extends Swimable {
    String speed = "2 km/h";

    @Override
    void swim();
}