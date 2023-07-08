package ru.gb.lessons.interfaces.core.personal;
import ru.gb.lessons.interfaces.core.clients.Animals;
import ru.gb.lessons.interfaces.core.clients.Human;
import ru.gb.lessons.interfaces.core.clients.home.Pet;

public class Doctor extends Human {

    public void cure(Animals patient) {
      if(patient instanceof Pet){
          System.out.println(CLASS_NAME + " checked health of " + patient.getCLASS_NAME());
       }
      else System.out.println(CLASS_NAME + " can`t cure "  + patient.getCLASS_NAME());
    }
}
