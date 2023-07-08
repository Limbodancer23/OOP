package ru.gb.lessons.interfaces.Interfaces.Inheritors;
import ru.gb.lessons.interfaces.Interfaces.Flyable;

public interface FlySlow extends Flyable {
    String speed = "15 km/h";
    void fly();
}