package lab4;

public class Sentence {
    private SentenceMember[] sentenceMembers;
    private String PUNCTUATION_SYMBOLS = ",.?!";

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
