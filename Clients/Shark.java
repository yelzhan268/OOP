package lesson.Clients;

import java.time.LocalDate;

public class Shark extends Animal{
    public Shark(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public void Going() {
        System.out.println(getType() + " can't to go");
    }
    public void Swimming() {
        swim();
    }
    public void Flying() {
        System.out.println(getType() + " can't fly");
    }
}
