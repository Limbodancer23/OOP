package ru.gb.lessons.interfaces.Interfaces.Inheritors;
import ru.gb.lessons.interfaces.Interfaces.Runnable;

public interface RunFast extends Runnable {
    String speed = "15 km/h";

    @Override
    void run();
}