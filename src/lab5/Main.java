package lab5;

import java.util.Scanner;
/*
C13 = 2 - Визначити ієрархію електроприладів. Увімкнути деякі електроприлади в розетку.
Підрахувати споживану потужність. Провести сортування приладів у квартирі на основі потужності.
Знайти прилад у квартирі, що відповідає заданому діапазону електромагнітного випромінювання.
 */
/**
 * The {@code Main} class serves as the entry point for the application.
 * It demonstrates the functionality of managing appliances in an apartment.
 *
 * <p>The operations include:
 * <ul>
 *     <li>Creating an {@code Apartment} with a set of appliances.</li>
 *     <li>Sorting appliances by power consumption.</li>
 *     <li>Calculating total power consumption of turned-on appliances.</li>
 *     <li>Finding appliances based on a specified range of electromagnetic radiation.</li>
 * </ul>
 */
public class Main {
    /**
     * The entry point of the application.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            Appliance[] appliances = {
                    new KitchenAppliance("Мікрохвильова піч", 1200, 2.5),
                    new KitchenAppliance("Холодильник", 150, 0.1),
                    new HouseHoldAppliance("Пилосос", 750, 0.02),
                    new HouseHoldAppliance("Пральна машина", 1000, 0.01),
                    new Device("Ноутбук", 95, 5.0),
                    new Device("Смартфон", 20, 2.4)
            };
            Apartment apartment1 = new Apartment("Квартира 1", appliances);
            System.out.println(apartment1);
            System.out.println("\nВмикаємо та сортуємо прилади за потужністю\n");
            apartment1.randomizeStates();
            apartment1.sortByPower();
            System.out.println(apartment1);
            System.out.println("\nВведіть діапазон електромагнітного випромінювання");
            System.out.println("Мінімальне: ");
            double minRadiation = scanner.nextDouble();
            System.out.println("Максимальне: ");
            double maxRadiation = scanner.nextDouble();
            apartment1.findByRadiationRange(minRadiation, maxRadiation);
        } catch (Exception e) {
            System.out.println("Введіть коректний діапазон електромагнітного випромінювання");
        }
    }
}
