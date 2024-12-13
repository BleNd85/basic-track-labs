package lab3;


import java.util.Objects;

public class SeaShip {
    private final Long id;
    private final String name;
    private final Integer floors;
    private final Integer capacity;
    private final Double speed;

    public SeaShip(Long id, String name, Integer floors, Integer capacity, Double speed) {
        this.id = id;
        this.name = name;
        this.floors = floors;
        this.capacity = capacity;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Id: " + id +
                ", Name: " + name +
                ", Floors: " + floors + " floors" +
                ", Capacity: " + capacity + " people" +
                ", Speed: " + speed + " knots";
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getFloors() {
        return floors;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public Double getSpeed() {
        return speed;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SeaShip seaShip = (SeaShip) o;
        return Objects.equals(name, seaShip.name) && Objects.equals(floors, seaShip.floors) && Objects.equals(capacity, seaShip.capacity) && Objects.equals(speed, seaShip.speed);
    }
}
