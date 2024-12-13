package lab3;


import java.util.Comparator;
import java.util.stream.Stream;

//C11 = 3 - Визначити клас морський човен, який складається як мінімум з 5-и полів.
public class Main {
    public static void main(String[] args) {
        SeaShip[] shipsArray = {
                new SeaShip(1L, "Titanic", 9, 2400, 23.0),
                new SeaShip(2L, "Queen Mary 2", 13, 2060, 30.0),
                new SeaShip(3L, "Allure of the Seas", 16, 5400, 22.0),
                new SeaShip(4L, "USS Enterprise", 20, 5000, 33.6),
                new SeaShip(5L, "Black Pearl", 3, 500, 15.0)
        };
        System.out.println("Масив кораблів:");
        printArray(shipsArray);
        SeaShip[] sortedBySpeedShips = Stream.of(shipsArray)
                .sorted(Comparator.comparing(SeaShip::getSpeed))
                .toArray(SeaShip[]::new);
        System.out.println("\nВідсортовані за швидкістю: ");
        printArray(sortedBySpeedShips);

        SeaShip[] sortedByCapacityReverseShips = Stream.of(shipsArray)
                .sorted(Comparator.comparing(SeaShip::getCapacity).reversed())
                .toArray(SeaShip[]::new);
        System.out.println("\nВідсортовані за місткістю в зворотньому напрямку:");
        printArray(sortedByCapacityReverseShips);

        SeaShip shipToFind = new SeaShip(6L, "Titanic", 9, 2400, 23.0);
        System.out.println("\nОб'єкт для пошуку:\n" + shipToFind);
        for (SeaShip ship : shipsArray) {
            if (ship.equals(shipToFind)) {
                System.out.println("\nІдентичний об'єкт:\n" + ship);
            }
        }
    }

    private static void printArray(SeaShip[] ships) {
        for (SeaShip ship : ships) {
            System.out.println(ship);
        }
    }
}
