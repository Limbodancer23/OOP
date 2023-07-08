package ru.gb.lessons.interfaces.core.clients;

import ru.gb.lessons.interfaces.Interfaces.Inheritors.SpeakSound;

/**
 Абстракция человека
 */
public class Human extends Animal implements SpeakSound {
    private final String fullName;

    public Human(String fullName) {
        this.fullName = fullName;
    }

    public Human(){
        this.fullName = null;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public void sound() {

    }
}
