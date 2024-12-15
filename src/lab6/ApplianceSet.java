package lab6;

import lab5.Appliance;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class ApplianceSet implements Set<Appliance> {
    private final LinkedList<Appliance> appliances;

    public ApplianceSet() {
        this.appliances = new LinkedList<>();
    }

    public ApplianceSet(Appliance appliance) {
        this();
        this.appliances.add(appliance);
    }

    public ApplianceSet(Collection<? extends Appliance> collection) {
        this();
        this.appliances.addAll(collection);
    }

    @Override
    public int size() {
        return appliances.size();
    }

    @Override
    public boolean isEmpty() {
        return appliances.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return appliances.contains(o);
    }

    @Override
    public Iterator<Appliance> iterator() {
        return appliances.iterator();
    }

    @Override
    public Object[] toArray() {
        return appliances.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return appliances.toArray(a);
    }

    @Override
    public boolean add(Appliance appliance) {
        if (!appliances.contains(appliance)) {
            return appliances.add(appliance);
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return appliances.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return appliances.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends Appliance> c) {
        boolean result = false;
        for (Appliance appliance : c) {
            result |= appliances.add(appliance);
        }
        return result;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return appliances.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return appliances.removeAll(c);
    }

    @Override
    public void clear() {
        appliances.clear();
    }

    @Override
    public String toString() {
        return appliances.toString();
    }
}
