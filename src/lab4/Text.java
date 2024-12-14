package lab4;

/**
 * Represents a text composed of multiple sentences.
 *
 * <p>The {@code Text} class is responsible for:
 * <ul>
 *     <li>Splitting the original text into sentences.</li>
 *     <li>Replacing words of a specific length in each sentence.</li>
 * </ul>
 */
public class Text {
    private Sentence[] sentences;

    /**
     * Constructs a {@code Text} object by splitting the given text into sentences.
     *
     * @param text The original text.
     */
    public Text(String text) {
        String normalizedText = text.replaceAll("\\s+", " ").trim();
        String[] splitText = normalizedText.split("(?<=[?.!])");
        sentences = new Sentence[splitText.length];
        for (int i = 0; i < splitText.length; i++) {
            sentences[i] = new Sentence(splitText[i].trim());
        }
    }

    /**
     * Replaces all words of a specific length in the text with a given replacement string.
     *
     * @param length      The length of words to replace.
     * @param replacement The string to replace matching words with.
     */
    public void replaceWordsOfLength(int length, String replacement) {
        for (Sentence sentence : sentences) {
            sentence.replaceWordsOfLength(length, replacement);
        }
    }

    @Override
    public String toString() {
        String[] sentences = new String[this.sentences.length];
        for (int i = 0; i < this.sentences.length; i++) {
            sentences[i] = this.sentences[i].toString();
        }
        return String.join(" ", sentences);
    }
}
