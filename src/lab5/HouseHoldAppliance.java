package lab5;

/**
 * The {@code HouseHoldAppliance} class represents an appliance used for household purposes.
 */
public class HouseHoldAppliance extends Appliance {
    /**
     * Constructs a new {@code HouseHoldAppliance} with the specified properties.
     *
     * @param name                     The name of the appliance.
     * @param power                    The power consumption in watts.
     * @param electromagneticRadiation The electromagnetic radiation in GHz.
     */
    public HouseHoldAppliance(String name, Integer power, Double electromagneticRadiation) {
        super(name, power, electromagneticRadiation);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getType() {
        return "Побутовий прилад";
    }
}
