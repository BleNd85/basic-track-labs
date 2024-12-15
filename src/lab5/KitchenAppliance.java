package lab5;

public class KitchenAppliance extends Appliance {
    public KitchenAppliance(String name, Integer power, Double electromagneticRadiation) {
        super(name, power, electromagneticRadiation);
    }

    @Override
    public String getType() {
        return "Кухонний прилад";
    }
}
