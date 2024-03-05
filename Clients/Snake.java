package lesson.Clients;

import java.time.LocalDate;

public class Snake extends Animal{
    public Snake(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public void Going() {
        toGo();
    }
    public void Swimming() {
        System.out.println(getType() + " can't swim");
    }
    public void Flying() {
        System.out.println(getType() + " can't fly");
    }
}
