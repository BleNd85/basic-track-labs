package lab4;

/**
 * Represents a punctuation symbol in a sentence.
 *
 * <p>The {@code Punctuation} class is responsible for storing a punctuation symbol.
 */
public class Punctuation implements SentenceMember {
    private String symbol;

    /**
     * Constructs a {@code Punctuation} object.
     *
     * @param symbol The punctuation symbol.
     */
    public Punctuation(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
