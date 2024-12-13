package lab4;

import java.util.Arrays;

public class Word implements SentenceMember {
    private Letter[] letters;

    public Word(String word) {
        char[] charsArray = word.toCharArray();
        letters = new Letter[charsArray.length];
        for (int i = 0; i < charsArray.length; i++) {
            letters[i] = new Letter(charsArray[i]);
        }
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
