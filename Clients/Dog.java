package lesson.Clients;

import java.time.LocalDate;

public class Dog extends Animal{
    public Dog(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    public void Going() {
        toGo();
    }
    public void Swimming() {
        swim();
    }
    public void Flying() {
        System.out.println(getType() + " can't fly");
    }
}
