package lab3;


import java.util.Objects;

/**
 * The {@code SeaShip} class represents a sea ship with its unique identifier, name, number of floors,
 * capacity, and speed.
 */
public class SeaShip {
    /**
     * Identifier of the ship.
     */
    private final Long id;
    /**
     * Name of the ship.
     */
    private final String name;
    /**
     * Number of floors on the ship.
     */
    private final Integer floors;
    /**
     * Passenger capacity of the ship.
     */
    private final Integer capacity;
    /**
     * Speed of the ship in knots.
     */
    private final Double speed;

    /**
     * Constructs a new {@code SeaShip} object with the given parameters.
     *
     * @param id       the unique identifier of the ship
     * @param name     the name of the ship
     * @param floors   the number of floors on the ship
     * @param capacity the passenger capacity of the ship
     * @param speed    the speed of the ship in knots
     */
    public SeaShip(Long id, String name, Integer floors, Integer capacity, Double speed) {
        this.id = id;
        this.name = name;
        this.floors = floors;
        this.capacity = capacity;
        this.speed = speed;
    }

    /**
     * Returns a string representation of the ship.
     *
     * @return a string containing the ship's details
     */
    @Override
    public String toString() {
        return "Id: " + id + ", Name: " + name + ", Floors: " + floors + " floors" + ", Capacity: " + capacity + " people" + ", Speed: " + speed + " knots";
    }

    /**
     * Gets the unique identifier of the ship.
     *
     * @return the ship's ID
     */
    public Long getId() {
        return id;
    }

    /**
     * Gets the name of the ship.
     *
     * @return the ship's name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the number of floors on the ship.
     *
     * @return the number of floors
     */
    public Integer getFloors() {
        return floors;
    }

    /**
     * Gets the passenger capacity of the ship.
     *
     * @return the ship's capacity
     */
    public Integer getCapacity() {
        return capacity;
    }

    /**
     * Gets the speed of the ship in knots.
     *
     * @return the ship's speed
     */
    public Double getSpeed() {
        return speed;
    }

    /**
     * Compares this ship to another object for equality based on its fields.
     *
     * @param o the object to compare to
     * @return {@code true} if the objects are equal, {@code false} otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SeaShip seaShip = (SeaShip) o;
        return Objects.equals(name, seaShip.name) && Objects.equals(floors, seaShip.floors) && Objects.equals(capacity, seaShip.capacity) && Objects.equals(speed, seaShip.speed);
    }
}
