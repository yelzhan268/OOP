package lesson.Clients.impl;

import java.time.LocalDate;

import lesson.Clients.Animal;
import lesson.Clients.Goable;
import lesson.Clients.Owner;
import lesson.Clients.Swimable;

public class Dog extends Animal implements Swimable, Goable{
    public Dog(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
   
    public void eat() {
        System.out.println(getType()+ " eat");
    }
    @Override
    public double swim() {
        return 3;
    }
    @Override
    public double run() {
        return 1;
    }
}
