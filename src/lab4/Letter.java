package lab4;

/**
 * Represents a letter in a word.
 *
 * <p>The {@code Letter} class is responsible for storing a single character.
 */
public class Letter {
    private char letter;

    /**
     * Constructs a {@code Letter} object.
     *
     * @param letter The character representing the letter.
     */
    public Letter(char letter) {
        this.letter = letter;
    }

    @Override
    public String toString() {
        return "" + letter;
    }
}
