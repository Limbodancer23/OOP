package ru.gb.lessons.interfaces;
//Создать класс Создайте интерфейсы Sound-able, Runnable, Flyable, Swim able. У интерфейсов должны быть
//методы получения скорости заданного действия.
//
//Добавьте наследников этим интерфейсам, но таким образом,
//чтобы у каждого интерфейса было минимум по два наследника (при необходимости, добавьте в приложение новые классы)
//
//Создать класс Doctor и подумать над его поведением. Создать класс Nurse(медсестра) и подумать над его поведением.
//
//У ветеринарной клиники добавьте методы получения всех бегающих, всех плавающих, всех говорящих и всех летающих.
import ru.gb.lessons.interfaces.core.clients.Animal;
import ru.gb.lessons.interfaces.core.clients.Animals;
import ru.gb.lessons.interfaces.core.clients.home.impl.Cat;
import ru.gb.lessons.interfaces.core.clients.home.impl.Dog;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;
import ru.gb.lessons.interfaces.core.clients.wild.impl.WildCat;

import java.time.LocalDate;

/**
 Небольшая шпаргалка по синтаксису java:

 1) Названия классов в java - существительные с большой буквы верблюжьей нотацией: CamelCase;
 2) названия методов - отглагольные, с маленькой буквы, верблюжьей нотацией: getUserById;
 3) Названия переменных - существительные с маленькой буквы, верблюжьей нотацией: maxCount;
 4) названия пакетов в java существительные, всегда с маленькой буквы и в одно слово;
 -! Если логика классов внутри пакета не позволяет назвать все в одно существительное, надо вложить один пакет в другой.
 */
public class Main {
    public static void main(String[] args) {
        Cat homeCat =
                new Cat(2, "Tom", 4, LocalDate.of(2022, 4,13), new Owner("Ivanov Ivan"));

        WildCat wildCat =
                new WildCat(
                        1, 4, LocalDate.of(2023, 1, 5), new Owner("incognito"));

        homeCat.hunt();
        wildCat.hunt();

        Dog dog = new Dog();
        dog.setName("LANSU");

        System.out.println(dog);
        System.out.println(homeCat);




    }
}
