package lesson.Clients;

import java.time.LocalDate;

public class Lion extends Animal{
    public Lion(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Lion() {
        super();
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
