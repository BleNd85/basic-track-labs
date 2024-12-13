package lab2;

import java.util.Scanner;

/*
C3 - 2 - StringBuffer
C17 - 15 - В заданому тексті замінити слова заданої довжини визначеним рядком.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введіть текст: ");
            String inputText = scanner.nextLine();

            StringBuffer inputTextBuffer = new StringBuffer(inputText);
            System.out.println("Введіть довжину слів для заміни: ");
            int wordLength = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Введіть рядок для заміни: ");
            String replacementString = scanner.nextLine();
            StringBuffer replacementStringBuffer = new StringBuffer(replacementString);

            StringProcessor stringProcessor = new StringProcessor(inputTextBuffer, wordLength, replacementStringBuffer);
            StringBuffer result = stringProcessor.processText();

            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Виникла помилка: введіть цілу й додотню довжину слів для заміни.");
        }
    }
}
