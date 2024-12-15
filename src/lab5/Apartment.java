package lab5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * The {@code Apartment} class manages a collection of appliances.
 *
 * <p>It provides functionality for:
 * <ul>
 *     <li>Sorting appliances by power consumption.</li>
 *     <li>Calculating the total power consumption of turned-on appliances.</li>
 *     <li>Finding appliances within a specified range of electromagnetic radiation.</li>
 * </ul>
 */
public class Apartment {
    private final String name;
    private final Appliance[] appliances;

    /**
     * Constructs a new {@code Apartment} with the specified name and appliances.
     *
     * @param name       The name of the apartment.
     * @param appliances An array of appliances in the apartment.
     */
    public Apartment(String name, Appliance[] appliances) {
        this.appliances = appliances;
        this.name = name;
    }

    /**
     * Sorts the appliances by their power consumption in ascending order.
     */
    public void sortByPower() {
        Arrays.sort(appliances, Comparator.comparingInt(Appliance::getPower));
    }

    public Integer calculateTotalPower() {
        return Arrays.stream(appliances)
                .filter(Appliance::getOn)
                .mapToInt(Appliance::getPower)
                .sum();
    }

    /**
     * Calculates the total power consumption of turned-on appliances.
     *
     * @return The total power consumption in watts.
     */
    public String calculateTotalPowerToString() {
        return calculateTotalPower() + " Вт.";
    }

    /**
     * Finds appliances within a specified range of electromagnetic radiation.
     *
     * @param minRadiation The minimum radiation value (inclusive).
     * @param maxRadiation The maximum radiation value (inclusive).
     * @return A list of appliances within the specified range.
     */
    public List<Appliance> findByRadiationRange(double minRadiation, double maxRadiation) {
        List<Appliance> filteredAppliances = Arrays.stream(appliances)
                .filter(appliance -> appliance.getElectromagneticRadiation() > minRadiation &&
                        appliance.getElectromagneticRadiation() < maxRadiation)
                .collect(Collectors.toList());

        if (filteredAppliances.isEmpty()) {
            throw new IllegalArgumentException("Не знайдено приладів в заданому діапазоні.");
        }
        System.out.println("Знайдені прилади:");
        filteredAppliances.forEach(System.out::println);

        return filteredAppliances;
    }

    /**
     * Generates a string representation of all appliances in the apartment.
     *
     * @return A string listing all appliances.
     */
    private String printAppliances() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Appliance appliance : appliances) {
            stringBuilder.append(appliance.toString()).append("\n");
        }
        return stringBuilder.toString();
    }

    /**
     * Randomizes the on/off state of each appliance in the apartment.
     */
    public void randomizeStates() {
        Random random = new Random();
        for (Appliance appliance : appliances) {
            if (random.nextBoolean()) {
                appliance.turnOn();
            }
            if (!random.nextBoolean()) {
                appliance.turnOff();
            }
        }
    }

    /**
     * Provides a string representation of the apartment.
     *
     * @return A string describing the apartment.
     */
    @Override
    public String toString() {
        return "Квартира: " + name +
                "\nПрилади:\n" + printAppliances() +
                "Споживана потужність: " + calculateTotalPowerToString();
    }
}
