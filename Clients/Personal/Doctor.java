package lesson.Clients.Personal;

import java.time.LocalDate;

import lesson.Clients.Animal;

public class Doctor extends Personal {
    public Doctor(String name, LocalDate age, LocalDate EmplDate, double salary) {
        super(name, age, EmplDate, salary);
    }
    @Override
    public void toWork() {
    }
    public void heal(Animal animal){
        System.out.println("Doctor healed " + animal.getType() + " " + animal.getName());
    }
    public void doOperation(){
        System.out.println("Doctor did an operation");
    }
}
