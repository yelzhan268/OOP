package lesson.Clients;

import java.util.ArrayList;
import java.util.List;

import lesson.Clients.Personal.Personal;

public class VeterinaryClinic {
    protected String clinicName;
    private List<Personal> Personal = new ArrayList<>();
    private List<Animal> Illanimals = new ArrayList<>();

    public VeterinaryClinic(String clinicName) {
        this.clinicName = clinicName;
        this.Illanimals = new ArrayList<>();
        this.Personal = new ArrayList<>();
    }
    public void addAnimal(Animal animal) {
        Illanimals.add(animal);
    }
    public void addPersonal(Personal personal) {
        Personal.add(personal);
    }
    public void removeAnimal(Animal animal) {
        Illanimals.remove(animal);
    }
    public void removePersonal(Personal personal) {
        Personal.remove(personal);
    }
    public List<Animal> getIllFlyable(){
        List<Animal> flyable = new ArrayList<>();
        for (Animal animal : Illanimals){
            if (animal instanceof Flyable){
                flyable.add(animal);
            }
        }
        return flyable;
    }
    public List<Animal> getIllSwimable(){
        List<Animal> swimable = new ArrayList<>();
        for (Animal animal : Illanimals){
            if (animal instanceof Swimable){
                swimable.add(animal);
            }
        }
        return swimable;
    }
    public List<Animal> getIllGoable(){
        List<Animal> goable = new ArrayList<>();
        for (Animal animal : Illanimals){
            if (animal instanceof Goable){
                goable.add(animal);
            }
        }
        return goable;
    }
    public List<Personal> getPersonals(){
        return Personal;
    }
    public double getSalary(Personal personal){
        return personal.getSalary();
    }
    public void setSalary(Personal personal, double salary){
        personal.setSalary(salary);
    }
}
