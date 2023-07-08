package ru.gb.lessons.interfaces.Interfaces.Inheritors;
import ru.gb.lessons.interfaces.Interfaces.Soundable;

public interface SpeakSound extends Soundable {
    String sound = "with words";

    @Override
    void sound();

}