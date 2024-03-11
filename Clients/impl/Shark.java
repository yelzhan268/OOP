package lesson.Clients.impl;

import java.time.LocalDate;

import lesson.Clients.Animal;
import lesson.Clients.Owner;
import lesson.Clients.Swimable;

public class Shark extends Animal implements Swimable {
    public Shark(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public void eat() {
        System.out.println(getType()+ " eat");
    }
    @Override
    public double swim() {
        return 15;
    }
}
