package lesson.Clients.Personal;

import java.time.LocalDate;

public abstract class Personal {
    protected String name;
    protected LocalDate age;
    protected LocalDate EmplDate;
    public double salary;
    public Personal(String name, LocalDate age, LocalDate EmplDate, double salary){
        this.name = name;
        this.age = age;
        this.EmplDate = EmplDate;
        this.salary = salary;
    }
    public abstract void toWork();
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
}
