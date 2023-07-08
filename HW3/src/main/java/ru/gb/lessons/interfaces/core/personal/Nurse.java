package ru.gb.lessons.interfaces.core.personal;

import ru.gb.lessons.interfaces.core.clients.Animals;
import ru.gb.lessons.interfaces.core.clients.Human;

public class Nurse extends Human {
    public void feed(Animals patient){
        System.out.println(CLASS_NAME + " gave food to " + patient.getCLASS_NAME());
    }

    public void prepare(Doctor doc){
        System.out.println(CLASS_NAME + " prepares tools for " + doc.getCLASS_NAME());
    }
}
