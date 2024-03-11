package lesson;


import java.time.LocalDate;
import java.util.*;

import lesson.Clients.Animal;
import lesson.Clients.Flyable;
import lesson.Clients.Owner;
import lesson.Clients.Swimable;
import lesson.Clients.VeterinaryClinic;
import lesson.Clients.Personal.Doctor;
import lesson.Clients.Personal.Nurse;
import lesson.Clients.impl.Dog;
import lesson.Clients.impl.Duck;
import lesson.Clients.impl.Lion;
import lesson.Clients.impl.Shark;
import lesson.Clients.impl.Snake;

public class Main {
    public static void main(String[] args) {
        // Lion leva = new Lion("Лёва", 200, LocalDate.now(), new Owner());
        // Lion puzo = new Lion("Пуза", 40, LocalDate.of
        //         (2007, 2, 3), new Owner());
        // Dog spike = new Dog("Спайк", 12, LocalDate.now(), new Owner());
        // System.out.println(leva.getWeight());
        // Lion test = new Lion();
        // System.out.println(test);
        // // System.out.println(puza);
        // // System.out.println(spike);
        // // System.out.println(leva.getType());

        // List<Animal> animals = new ArrayList<>();
        // animals.add(puzo);
        // animals.add(leva);
        // animals.add(spike);
        // System.out.println(animals);
        // spike.Going();
        // Animal dog = new Dog("Вася", 7, LocalDate.now(), new Owner());
        // Swimable duck = new Duck("Вася", 2, LocalDate.now(), new Owner());
        // duck.sound();
        // List<Animal> flyables = new ArrayList<>();
        // flyables.add(new Duck("duck", 3, LocalDate.now(), new Owner()));
        // for (Animal animal : flyables) {
        //     if (animal instanceof Flyable) {
        //         ((Flyable)animal).fly();
        //     }
        // }
        Doctor doctor = new Doctor("Matt Carriker", LocalDate.of(1986, 10, 21), LocalDate.of(2012, 11, 28), 800000);
        Nurse nurse = new Nurse("Beth", LocalDate.of(1990, 12, 3), LocalDate.of(2019, 05, 18), 400000);
        Animal dog = new Dog("Belka", 10, LocalDate.now(), new Owner());
        Animal duck = new Duck("Cherniyplash", 3, LocalDate.now(), new Owner());
        Animal lion = new Lion("Alex", 50,LocalDate.now(), new Owner());
        Animal shark = new Shark("Babyshark", 200, LocalDate.now(), new Owner());
        Animal snake = new Snake("Ka", 5, LocalDate.now(), new Owner());
        VeterinaryClinic clinic = new VeterinaryClinic("Kitomoika");
        clinic.addPersonal(doctor);
        clinic.addPersonal(nurse);
        clinic.addAnimal(dog);
        clinic.addAnimal(duck);
        clinic.addAnimal(lion);
        clinic.addAnimal(shark);
        clinic.addAnimal(snake);
        nurse.Vacinate(snake);
        System.out.println(clinic.getIllSwimable());
        System.out.println(clinic.getSalary(nurse));
        clinic.setSalary(nurse, 500000);
        System.out.println(clinic.getSalary(nurse));
    }
}
