package lab5;

public class HouseHoldAppliance extends Appliance {
    public HouseHoldAppliance(String name, Integer power, Double electromagneticRadiation) {
        super(name, power, electromagneticRadiation);
    }

    @Override
    public String getType() {
        return "Побутовий прилад";
    }
}
