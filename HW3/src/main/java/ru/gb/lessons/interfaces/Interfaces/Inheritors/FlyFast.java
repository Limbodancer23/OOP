package ru.gb.lessons.interfaces.Interfaces.Inheritors;
import ru.gb.lessons.interfaces.Interfaces.Flyable;

public interface FlyFast extends Flyable {
    String flySpeed = "30 km/h";
    void fly();
}