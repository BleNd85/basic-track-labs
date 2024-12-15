package lab5;

public class Device extends Appliance {
    public Device(String name, Integer power, Double electromagneticRadiation) {
        super(name, power, electromagneticRadiation);
    }

    @Override
    public String getType() {
        return "Девайс";
    }
}
