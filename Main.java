package lesson;


import java.time.LocalDate;
import java.util.*;

import lesson.Clients.Animal;
import lesson.Clients.Dog;
import lesson.Clients.Lion;
import lesson.Clients.Owner;

public class Main {
    public static void main(String[] args) {
        Lion leva = new Lion("Лёва", 200, LocalDate.now(), new Owner());
        Lion puzo = new Lion("Пуза", 40, LocalDate.of
                (2007, 2, 3), new Owner());
        Dog spike = new Dog("Спайк", 12, LocalDate.now(), new Owner());
        System.out.println(leva.getWeight());
        Lion test = new Lion();
        System.out.println(test);
        // System.out.println(puza);
        // System.out.println(spike);
        // System.out.println(leva.getType());
        spike.lifeCycle();

        List<Animal> animals = new ArrayList<>();
        animals.add(puzo);
        animals.add(leva);
        animals.add(spike);
        System.out.println(animals);
        spike.Going();
    }
}
