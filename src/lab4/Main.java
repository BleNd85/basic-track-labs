package lab4;


//В заданому тексті замінити слова заданої довжини визначеним рядком.

import java.util.Scanner;

/**
 * The {@code Main} class serves as the entry point for the application.
 * It demonstrates functionality for replacing words of a specific length in a given text.
 *
 * <p>The operations include:
 * <ul>
 *     <li>Creating a {@code Text} object from the given input text.</li>
 *     <li>Replacing words of a specific length with a specified replacement string.</li>
 *     <li>Displaying the original and modified text.</li>
 * </ul>
 */
public class Main {
    /**
     * The entry point of the application.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String originalText = new String("  In a distant galaxy,   far away  from the Earth, there was a small planet named Exoterra. "
                + "This planet was unique because it was inhabited by creatures that thrived on creativity and innovation. "
                + "\nThe Exoterians spent   their days inventing gadgets, writing stories, and composing music that resonated "
                + "through the cosmos. \tHowever, Exoterra       had one peculiar rule: every invention or piece of art must serve a purpose. "
                + "This rule ensured that their creativity always    had practical applications. One day, an Exoterian named Zymon "
                + "decided to create a machine that could    harness the power of stars. He worked tirelessly, facing numerous challenges "
                + "and setbacks. But Zymon  never gave  up, and his persistence inspired the entire community. \n\tEventually, Zymon's "
                + "machine was completed, and it brought an era of unparalleled prosperity to Exoterra. \nThe energy harnessed from the stars ");
        Text text = new Text(originalText);
        System.out.println("Оригінальний текст:");
        System.out.println(originalText);

        System.out.println("\nВведіть довжину слів для заміни:");
        int wordLengthToReplace = scanner.nextInt();

        System.out.println("Введіть рядок, на який замінити слова заданої довжини:");
        String replacementWord = scanner.next();

        text.replaceWordsOfLength(wordLengthToReplace, replacementWord);

        System.out.println("Змінений текст:");
        System.out.println(text);
    }

}
