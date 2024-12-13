package lab3;


import java.util.Comparator;
import java.util.stream.Stream;

//C11 = 3 - Визначити клас морський човен, який складається як мінімум з 5-и полів.

/**
 * The {@code Main} class is the entry point for the application.
 * It demonstrates operations on an array of {@code SeaShip} objects,
 * including sorting and searching functionality.
 *
 * <p>The operations include:
 * <ul>
 *     <li>Creating an array of {@code SeaShip} objects with predefined attributes.</li>
 *     <li>Sorting the ships by speed in ascending order.</li>
 *     <li>Sorting the ships by passenger capacity in descending order.</li>
 *     <li>Searching for a ship in the array that matches specific attributes.</li>
 *     <li>Printing the array of ships before and after sorting.</li>
 * </ul>
 */
public class Main {
    /**
     * The main method of the application. It creates an array of ships,
     * performs sorting by various attributes, and searches for a specific ship.
     *
     * @param args command-line arguments (not used)
     */
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

        System.out.println("\nІдентичний об'єкт:\n" + findEqualSeaShip(shipsArray, shipToFind));

    }

    /**
     * Prints the array of {@code SeaShip} objects to the console.
     *
     * @param ships the array of {@code SeaShip} objects to be printed
     */
    private static void printArray(SeaShip[] ships) {
        for (SeaShip ship : ships) {
            System.out.println(ship);
        }
    }

    /**
     * Searches for a {@code SeaShip} in the given array that matches the specified ship.
     * The search is based on the {@code equals} method of the {@code SeaShip} class.
     *
     * @param seaShips   the array of {@code SeaShip} objects to search in
     * @param shipToFind the {@code SeaShip} object to search for
     * @return a string representation of the matching {@code SeaShip} if found,
     * otherwise a message indicating the ship was not found
     */
    private static String findEqualSeaShip(SeaShip[] seaShips, SeaShip shipToFind) {
        for (SeaShip ship : seaShips) {
            if (ship.equals(shipToFind)) {
                return ship.toString();
            }
        }
        return "Ship with these parameters wasn't found!";
    }
}
