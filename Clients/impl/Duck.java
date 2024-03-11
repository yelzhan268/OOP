package lesson.Clients.impl;

import java.time.LocalDate;

import lesson.Clients.Animal;
import lesson.Clients.Flyable;
import lesson.Clients.Goable;
import lesson.Clients.Owner;
import lesson.Clients.Swimable;
import java.io.Serializable;

public class Duck extends Animal implements Swimable, Goable, Flyable {
        public Duck(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    
    public void eat() {
        System.out.println(getType()+ " eat");
    }

    @Override
    public double fly() {
        return 2;
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
