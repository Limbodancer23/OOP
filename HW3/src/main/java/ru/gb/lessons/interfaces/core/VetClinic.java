package ru.gb.lessons.interfaces.core;
import ru.gb.lessons.interfaces.Interfaces.Flyable;
import ru.gb.lessons.interfaces.Interfaces.Soundable;
import ru.gb.lessons.interfaces.Interfaces.Swimable;
import ru.gb.lessons.interfaces.core.clients.Animals;
import ru.gb.lessons.interfaces.core.clients.home.impl.Cat;
import ru.gb.lessons.interfaces.core.clients.home.impl.Dog;
import ru.gb.lessons.interfaces.core.clients.wild.impl.Dolphin;
import ru.gb.lessons.interfaces.core.clients.wild.impl.Duck;
import ru.gb.lessons.interfaces.core.clients.wild.impl.Eagle;
import ru.gb.lessons.interfaces.core.clients.wild.impl.WildCat;
import ru.gb.lessons.interfaces.core.personal.Doctor;
import ru.gb.lessons.interfaces.core.personal.Nurse;
import java.util.ArrayList;
import java.util.List;

public class VetClinic {
    private static List<Animals> animals = new ArrayList<>();

    public static void main(String[] args) {
        List <Animals> flying = new ArrayList<>();
        List <Animals> runnable = new ArrayList<>();
        List <Animals> soundeble = new ArrayList<>();
        List <Animals> swimabable = new ArrayList<>();
        Nurse nurse = new Nurse();
        Doctor doc = new Doctor();
        Eagle eagle = new Eagle();
        Duck duck = new Duck();
        Dog dog = new Dog();
        Cat cat = new Cat();
        WildCat wCat = new WildCat();
        Dolphin dolphin = new Dolphin();
        animals.add(duck);
        animals.add(wCat);
        animals.add(dog);
        animals.add(eagle);
        animals.add(dolphin);
        animals.add(cat);
        for (Animals el : animals){
            check(el, nurse, doc);
            if (el instanceof Flyable){
                flying.add(el);
            }
            if (el instanceof Runnable){
                runnable.add(el);
            }
            if (el instanceof Soundable){
                soundeble.add(el);
            }
            if (el instanceof Swimable){
                swimabable.add(el);
            }
        }
        getAnimalList(flying);
        getAnimalList(runnable);
        getAnimalList(soundeble);
        getAnimalList(swimabable);
    }

    public static void check(Animals patient, Nurse nurse, Doctor doc){
        nurse.prepare(doc);
        doc.cure(patient);
        nurse.feed(patient);
    }

    public static void getAnimalList(List<Animals> list){
        for (Animals el: list) {
            System.out.printf(el.getCLASS_NAME() + " ");
        }
        System.out.println("\n");
    }

}
