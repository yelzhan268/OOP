package lesson;


import java.time.LocalDate;
import java.util.*;

import lesson.Clients.Animal;
import lesson.Clients.Flyable;
import lesson.Clients.Owner;
import lesson.Clients.Swimable;
import lesson.Clients.impl.Dog;
import lesson.Clients.impl.Duck;
import lesson.Clients.impl.Lion;

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
        Animal dog = new Dog("Вася", 7, LocalDate.now(), new Owner());
        Swimable duck = new Duck("Вася", 2, LocalDate.now(), new Owner());
        duck.sound();
        List<Animal> flyables = new ArrayList<>();
        flyables.add(new Duck("duck", 3, LocalDate.now(), new Owner()));
        for (Animal animal : flyables) {
            if (animal instanceof Flyable) {
                ((Flyable)animal).fly();
            }
        }
    }
}
