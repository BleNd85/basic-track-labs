package lab4;


/**
 * Represents a word in a sentence.
 *
 * <p>The {@code Word} class is responsible for:
 * <ul>
 *     <li>Storing the characters of the word.</li>
 *     <li>Calculating the length of the word.</li>
 * </ul>
 */
public class Word implements SentenceMember {
    private Letter[] letters;

    /**
     * Constructs a {@code Word} object from a string.
     *
     * @param word The original word.
     */
    public Word(String word) {
        char[] charsArray = word.toCharArray();
        letters = new Letter[charsArray.length];
        for (int i = 0; i < charsArray.length; i++) {
            letters[i] = new Letter(charsArray[i]);
        }
    }

    /**
     * Gets the length of the word.
     *
     * @return The length of the word.
     */
    public int getLength() {
        return letters.length;
    }

    @Override
    public String toString() {
        StringBuilder word = new StringBuilder();
        for (Letter letter : letters) {
            word.append(letter.toString());
        }
        return word.toString();
    }
}
