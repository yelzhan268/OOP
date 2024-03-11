package lesson.Clients.impl;

import java.time.LocalDate;

import lesson.Clients.Animal;
import lesson.Clients.Goable;
import lesson.Clients.Owner;

public class Snake extends Animal implements Goable{
    public Snake(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public void eat() {
        System.out.println(getType()+ " eat");
    }

    @Override
    public double run() {
        return 1;
    }
}
