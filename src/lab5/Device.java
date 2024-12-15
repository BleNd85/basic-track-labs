package lab5;

/**
 * The {@code Device} class represents an electronic device.
 */
public class Device extends Appliance {
    /**
     * Constructs a new {@code Device} with the specified properties.
     *
     * @param name                     The name of the device.
     * @param power                    The power consumption in watts.
     * @param electromagneticRadiation The electromagnetic radiation in GHz.
     */
    public Device(String name, Integer power, Double electromagneticRadiation) {
        super(name, power, electromagneticRadiation);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getType() {
        return "Девайс";
    }
}
