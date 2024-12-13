package lab3;


public class SeaShip {
    private final Double height;
    private final Double length;
    private final Integer floors;
    private final Integer capacity;
    private final Double speed;

    public SeaShip(Double height, Double length, Integer floors, Integer capacity, Double speed) {
        this.height = height;
        this.length = length;
        this.floors = floors;
        this.capacity = capacity;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SeaShip{" +
                "height=" + height + " m." +
                ", length=" + length + " m." +
                ", floors=" + floors + " floors" +
                ", capacity=" + capacity + " people" +
                ", speed=" + speed + " knots" +
                '}';
    }
}
