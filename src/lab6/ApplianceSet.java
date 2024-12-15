package lab6;

import lab5.Appliance;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/**
 * A custom implementation of a Set backed by a doubly-linked list.
 * This set stores unique {@link lab5.Appliance} objects and preserves the insertion order.
 */
public class ApplianceSet implements Set<Appliance> {
    /**
     * The internal storage for the set, implemented as a doubly-linked list.
     */
    private final LinkedList<Appliance> appliances;

    /**
     * Default constructor creating an empty ApplianceSet.
     */
    public ApplianceSet() {
        this.appliances = new LinkedList<>();
    }

    /**
     * Constructor that initializes the set with a single Appliance object.
     *
     * @param appliance the {@link lab5.Appliance} to add to the set.
     */
    public ApplianceSet(Appliance appliance) {
        this();
        this.appliances.add(appliance);
    }

    /**
     * Constructor that initializes the set with a collection of Appliances.
     *
     * @param collection a collection of {@link lab5.Appliance} objects to add to the set.
     */
    public ApplianceSet(Collection<? extends Appliance> collection) {
        this();
        this.appliances.addAll(collection);
    }

    /**
     * Returns the number of elements in the set.
     *
     * @return the size of the set.
     */
    @Override
    public int size() {
        return appliances.size();
    }

    /**
     * Checks if the set is empty.
     *
     * @return {@code true} if the set contains no elements, otherwise {@code false}.
     */
    @Override
    public boolean isEmpty() {
        return appliances.isEmpty();
    }

    /**
     * Checks if the set contains the specified object.
     *
     * @param o the object to check for.
     * @return {@code true} if the set contains the object, otherwise {@code false}.
     */
    @Override
    public boolean contains(Object o) {
        return appliances.contains(o);
    }

    /**
     * Returns an iterator over the elements in the set.
     *
     * @return an {@link Iterator} of {@link lab5.Appliance} objects.
     */
    @Override
    public Iterator<Appliance> iterator() {
        return appliances.iterator();
    }

    /**
     * Returns an array containing all elements in the set.
     *
     * @return an array of {@link lab5.Appliance} objects.
     */
    @Override
    public Object[] toArray() {
        return appliances.toArray();
    }

    /**
     * Returns an array containing all elements in the set.
     *
     * @param a the array into which the elements will be stored, if it is big enough.
     * @param <T> the runtime type of the array.
     * @return an array containing the elements of the set.
     */
    @Override
    public <T> T[] toArray(T[] a) {
        return appliances.toArray(a);
    }

    /**
     * Adds an Appliance to the set if it is not already present.
     *
     * @param appliance the {@link lab5.Appliance} to add.
     * @return {@code true} if the appliance was added, {@code false} if it was already present.
     */
    @Override
    public boolean add(Appliance appliance) {
        if (!appliances.contains(appliance)) {
            return appliances.add(appliance);
        }
        return false;
    }

    /**
     * Removes the specified object from the set if it is present.
     *
     * @param o the object to remove.
     * @return {@code true} if the object was removed, {@code false} otherwise.
     */
    @Override
    public boolean remove(Object o) {
        return appliances.remove(o);
    }

    /**
     * Checks if the set contains all elements of the specified collection.
     *
     * @param c the collection to check.
     * @return {@code true} if the set contains all elements of the collection, otherwise {@code false}.
     */
    @Override
    public boolean containsAll(Collection<?> c) {
        return appliances.containsAll(c);
    }

    /**
     * Adds all elements from the specified collection to the set.
     *
     * @param c the collection of elements to add.
     * @return {@code true} if the set was modified, otherwise {@code false}.
     */
    @Override
    public boolean addAll(Collection<? extends Appliance> c) {
        boolean result = false;
        for (Appliance appliance : c) {
            result |= appliances.add(appliance);
        }
        return result;
    }

    /**
     * Retains only the elements in the set that are contained in the specified collection.
     *
     * @param c the collection of elements to retain.
     * @return {@code true} if the set was modified, otherwise {@code false}.
     */
    @Override
    public boolean retainAll(Collection<?> c) {
        return appliances.retainAll(c);
    }

    /**
     * Removes all elements in the specified collection from the set.
     *
     * @param c the collection of elements to remove.
     * @return {@code true} if the set was modified, otherwise {@code false}.
     */
    @Override
    public boolean removeAll(Collection<?> c) {
        return appliances.removeAll(c);
    }

    /**
     * Removes all elements from the set.
     */
    @Override
    public void clear() {
        appliances.clear();
    }

    /**
     * Returns a string representation of the set.
     *
     * @return a string representation of the elements in the set.
     */
    @Override
    public String toString() {
        return appliances.toString();
    }
}
