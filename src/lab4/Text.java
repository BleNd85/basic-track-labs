package lab4;

public class Text {
    private Sentence[] sentences;

    public Text(String text) {
        String normalizedText = text.replaceAll("\\s+", " ").trim();
        String[] splitText = normalizedText.split("(?<=[?.!])");
        sentences = new Sentence[splitText.length];
        for (int i = 0; i < splitText.length; i++) {
            sentences[i] = new Sentence(splitText[i].trim());
        }
    }

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
