package lab5;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Apartment {
    private final String name;
    private final Appliance[] appliances;

    public Apartment(String name, Appliance[] appliances) {
        this.appliances = appliances;
        this.name = name;
    }

    public void sortByPower() {
        Arrays.sort(appliances, (a, b) -> Integer.compare(a.getPower(), b.getPower()));
    }

    public Integer calculateTotalPower() {
        return Arrays.stream(appliances)
                .filter(Appliance::getOn)
                .mapToInt(Appliance::getPower)
                .sum();
    }

    public String calculateTotalPowerToString() {
        return calculateTotalPower() + " Вт.";
    }

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

    private String printAppliances() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Appliance appliance : appliances) {
            stringBuilder.append(appliance.toString()).append("\n");
        }
        return stringBuilder.toString();
    }

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

    @Override
    public String toString() {
        return "Квартира: " + name +
                "\nПрилади:\n" + printAppliances() +
                "Споживана потужність: " + calculateTotalPowerToString();
    }
}
