package lesson.Clients;
@FunctionalInterface
public interface Swimable {
    double pi = 3.1415;
    double swim();
    
    default void sound() {
        System.out.println("Я дефолтный метод");
    }
}
