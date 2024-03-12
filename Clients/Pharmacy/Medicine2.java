package lesson.Clients.Pharmacy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Medicine2 implements Iterable<MedicineComponent>, Comparable<Medicine2> {
    private List<MedicineComponent> components;
    private int index;
    public Medicine2() {
        this.components = new ArrayList<>();
        this.index = 0;
    }

    public Medicine2 addComponent(MedicineComponent component) {
        components.add(component);
        return this;
    }
    // @Override
    // public boolean hasNext() {
    //     // return components.iterator().hasNext();
    //     return index < components.size();
    // }
    // @Override
    // public MedicineComponent next() {
    //     // return components.iterator().next();
    //     return components.get(index++);
    // }
    @Override
    public String toString() {
        return "Medicine: " + components.toString();
    }
    @Override
    public Iterator<MedicineComponent> iterator() {
        return new Iterator<MedicineComponent>() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }
            @Override
            public MedicineComponent next() {
                return components.get(index++);
            }
        };
    }

    public String getComponentName() {
        String name = null;
        for (MedicineComponent component : components) {
            name = component.getName();
        }
        return name;
    }

    @Override
    public int compareTo(Medicine2 o) {
        return this.getComponentName.compareTo(o.this.getComponentName);
    }
}