package Repo;

import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
//2) **Создать класс FileRepository (аналог кастомной БД) который
//        будет уметь создавать базу данных в виде файла с расширением .txt и именем по имени
//        ЛЮБОГО сохраняемого класса. Должны быть методы получения объекта по id,удаления объекта по id,
//        обновления по id, сохранения нового объекта в БД.

public class Main {
    public static void main(String[] args) {
        FileRepository<Integer, String> list = new FileRepository<>();
        list.addToFile(1, "value1");
        list.addToFile(2, "value2");
        list.addToFile(3, "value3");

        System.out.println(list);
        list.getValue(2);
        list.removeValue(2);
        list.addToFile(4, "value12141");
        list.updateValue(1,"value4");


    }
}
