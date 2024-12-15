package lab6;

import lab5.Appliance;
import lab5.Device;
import lab5.HouseHoldAppliance;
import lab5.KitchenAppliance;

import java.util.Arrays;
import java.util.List;

/*
C2 = 1 - Set
C3 = 2 - Двозв’язний список
 */

/**
 * Demonstrates the functionality of the {@link ApplianceSet} class.
 * Showcases how to create, manipulate, and query custom sets of {@link lab5.Appliance} objects.
 */
public class Main {
    /**
     * The main entry point for demonstrating the functionality of {@link ApplianceSet}.
     * @param args the command-line arguments (not used).
     */
    public static void main(String[] args) {
        Appliance microwave = new KitchenAppliance("Мікрохвильовка", 1500, 2.5);
        Appliance laptop = new Device("Ноутбук", 95, 5.0);
        Appliance vacuum = new HouseHoldAppliance("Пилосос", 1500, 2.5);

        ApplianceSet emptyApplianceCollection = new ApplianceSet();
        System.out.println("Порожня колекція");
        System.out.println(emptyApplianceCollection);

        ApplianceSet oneObjectApplianceCollection = new ApplianceSet(microwave);
        System.out.println("\nКолекція з одним об'єктом:");
        System.out.println(oneObjectApplianceCollection);

        List<Appliance> appliances = Arrays.asList(laptop, vacuum);
        ApplianceSet standardApplianceCollection = new ApplianceSet(appliances);
        System.out.println("\nСтандартна колекція (вивід з використанням toArray() методу):");
        System.out.println(Arrays.toString(standardApplianceCollection.toArray()));


        emptyApplianceCollection.add(microwave);
        System.out.println("\nПорожня колекція після додавання 'Мікрохвильовки':");
        System.out.println(emptyApplianceCollection);

        standardApplianceCollection.remove(laptop);
        System.out.println("\nСтандартна колекція після видалення 'Ноутбука':");
        System.out.println(standardApplianceCollection);

        System.out.println("\nКолекція з одним об'єктом містить 'Мікрохвильовку': " + oneObjectApplianceCollection.contains(microwave));
        System.out.println("Колекція з одним об'єктом містить 'Ноутбук': " + oneObjectApplianceCollection.contains(laptop));

        System.out.println("\nРозмір стандартної колекції: " + standardApplianceCollection.size());

        oneObjectApplianceCollection.clear();
        System.out.println("\nКолекція з одним об'єктом після очищення: " + oneObjectApplianceCollection);

    }
}
