package lesson.Clients.Personal;

import java.time.LocalDate;

import lesson.Clients.Animal;

public class Nurse  extends Personal {
    public Nurse(String name, LocalDate age, LocalDate EmplDate, double salary) {
        super(name, age, EmplDate, salary);
    }
    @Override
    public void toWork() {
    }
    public void Vacinate(Animal animal){
        System.out.println(animal.getType() + " " + animal.getName() + " Vacinated by " + name);
    }
    public void help(){
        System.out.println(name + " helped doctor.");
    }
}
