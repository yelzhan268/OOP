package lesson.Clients.impl;

import java.time.LocalDate;

import lesson.Clients.Animal;
import lesson.Clients.Goable;
import lesson.Clients.Owner;
import lesson.Clients.Swimable;

public class Lion extends Animal implements Goable, Swimable{
    public Lion(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Lion() {
        super();
    }

    public void eat() {
        System.out.println(getType()+ " eat");
    }
    @Override
    public double run() {
        return 10;
    }
    @Override
    public double swim() {
        return 1;
    }
}
