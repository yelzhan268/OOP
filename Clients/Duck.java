package lesson.Clients;

import java.time.LocalDate;

public class Duck extends Animal{
        public Duck(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    public void Going() {
        toGo();
    }
    public void Swimming() {
        swim();
    }
    public void Flying() {
        fly();
    }
}
