package lab4;

/**
 * Represents a sentence, composed of words and punctuation symbols.
 *
 * <p>The {@code Sentence} class is responsible for:
 * <ul>
 *     <li>Splitting a sentence into words and punctuation symbols.</li>
 *     <li>Replacing words of a specific length with a specified string.</li>
 * </ul>
 */
public class Sentence {
    private SentenceMember[] sentenceMembers;
    private String PUNCTUATION_SYMBOLS = ",.?!";

    /**
     * Constructs a {@code Sentence} object by splitting the given string into words and punctuation symbols.
     *
     * @param sentence The original sentence.
     */
    public Sentence(String sentence) {
        String[] words = sentence.split("(?=[" + PUNCTUATION_SYMBOLS + "])|\\s");
        sentenceMembers = new SentenceMember[words.length];
        for (int i = 0; i < words.length; i++) {
            if (PUNCTUATION_SYMBOLS.contains(words[i])) {
                sentenceMembers[i] = new Punctuation(words[i]);
            } else {
                sentenceMembers[i] = new Word(words[i]);
            }
        }
    }

    /**
     * Replaces all words of a specific length in the sentence with a given replacement string.
     *
     * @param length      The length of words to replace.
     * @param replacement The string to replace matching words with.
     */
    public void replaceWordsOfLength(int length, String replacement) {
        for (int i = 0; i < sentenceMembers.length; i++) {
            if (sentenceMembers[i] instanceof Word word) {
                if (word.getLength() == length) {
                    sentenceMembers[i] = new Word(replacement);
                }
            }
        }
    }


    @Override
    public String toString() {
        StringBuilder sentence = new StringBuilder();
        for (SentenceMember sentenceMember : sentenceMembers) {
            if (sentenceMember instanceof Word) {
                sentence.append(" ").append(sentenceMember);
            }
            if (sentenceMember instanceof Punctuation) {
                sentence.append(sentenceMember);
            }
        }
        return sentence.toString().trim();
    }
}
