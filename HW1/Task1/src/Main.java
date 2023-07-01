import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal fish = new Fish("Fish",false,true,false);
        Animal dolphin = new Dolphin("Dolphin",false, true,false);
        Animal bird = new Bird("Bird",true, false,true);
        Animal bee = new Bee("Bee",true,false,true);
        Animal horse = new Horse("Horse",true,false,false);
        Animal dog = new Dog("Dog",true, false,false);

        fish.toSwim();
        dolphin.toSwim();
        bird.toSwim();
        bee.toFly();
        bee.toWalk();
        horse.toSwim();
        horse.toWalk();
        dog.toWalk();

    }
}