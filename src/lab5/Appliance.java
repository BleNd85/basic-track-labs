package lab5;

/**
 * The {@code Appliance} abstract class represents a general electrical appliance.
 *
 * <p>Each appliance has the following properties:
 * <ul>
 *     <li>Name</li>
 *     <li>Power consumption (in watts)</li>
 *     <li>Electromagnetic radiation (in GHz)</li>
 *     <li>State (on/off)</li>
 * </ul>
 */
public abstract class Appliance {
    /**
     * The name of the appliance.
     */
    protected String name;
    /**
     * The state of the appliance, where {@code true} means on and {@code false} means off.
     */
    protected Boolean isOn;
    /**
     * The power consumption of the appliance in watts.
     */
    protected Integer power;
    /**
     * The electromagnetic radiation of the appliance in GHz.
     */
    protected Double electromagneticRadiation;

    /**
     * Constructs a new {@code Appliance} with the specified properties.
     *
     * @param name                     The name of the appliance.
     * @param power                    The power consumption in watts.
     * @param electromagneticRadiation The electromagnetic radiation in GHz.
     */
    public Appliance(String name, Integer power, Double electromagneticRadiation) {
        this.name = name;
        this.isOn = false;
        this.power = power;
        this.electromagneticRadiation = electromagneticRadiation;
    }

    /**
     * Turns the appliance on.
     */
    public void turnOn() {
        this.isOn = true;
    }

    /**
     * Turns the appliance off.
     */
    public void turnOff() {
        this.isOn = false;
    }

    /**
     * Retrieves the name of the appliance.
     *
     * @return The name of the appliance.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the appliance.
     *
     * @param name The new name of the appliance.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Checks if the appliance is turned on.
     *
     * @return {@code true} if the appliance is on, otherwise {@code false}.
     */
    public Boolean getOn() {
        return isOn;
    }

    /**
     * Retrieves the power consumption of the appliance.
     *
     * @return The power consumption in watts.
     */
    public Integer getPower() {
        return power;
    }

    /**
     * Sets the power consumption of the appliance.
     *
     * @param power The new power consumption in watts.
     */
    public void setPower(Integer power) {
        this.power = power;
    }

    /**
     * Retrieves the electromagnetic radiation of the appliance.
     *
     * @return The electromagnetic radiation in GHz.
     */
    public Double getElectromagneticRadiation() {
        return electromagneticRadiation;
    }

    /**
     * Sets the electromagnetic radiation of the appliance.
     *
     * @param electromagneticRadiation The new electromagnetic radiation in GHz.
     */
    public void setElectromagneticRadiation(Double electromagneticRadiation) {
        this.electromagneticRadiation = electromagneticRadiation;
    }

    /**
     * Converts the current state to a string representation.
     *
     * @return {@code "On"} if the appliance is on, otherwise {@code "Off"}.
     */
    protected String isOnToString() {
        return isOn
                ? "Увімкнений"
                : "Вимкнений";
    }

    /**
     * Provides a string representation of the appliance.
     *
     * @return A string describing the appliance.
     */
    @Override
    public String toString() {
        return "Прилад: " + name +
                ", Тип: " + getType() +
                ", Стан: " + isOnToString() +
                ", Потужність: " + power + " Вт." +
                ", Електромагнітне випромінювання: " + electromagneticRadiation + " Ггц.";
    }

    /**
     * Returns the type of the appliance.
     *
     * @return A string representing the type of the appliance.
     */
    public abstract String getType();
}
