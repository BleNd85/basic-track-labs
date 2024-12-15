package lab5;

/**
 * The {@code KitchenAppliance} class represents an appliance used in the kitchen.
 */
public class KitchenAppliance extends Appliance {
    /**
     * Constructs a new {@code KitchenAppliance} with the specified properties.
     *
     * @param name                     The name of the appliance.
     * @param power                    The power consumption in watts.
     * @param electromagneticRadiation The electromagnetic radiation in GHz.
     */
    public KitchenAppliance(String name, Integer power, Double electromagneticRadiation) {
        super(name, power, electromagneticRadiation);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getType() {
        return "Кухонний прилад";
    }
}
