package lab2;

//TODO add doc
public class StringProcessor {
    private final StringBuffer inputText;
    private final int wordLength;
    private final StringBuffer replacementString;

    public StringProcessor(StringBuffer inputText, int wordLength, StringBuffer replacementString) {
        this.inputText = inputText;
        this.wordLength = wordLength;
        this.replacementString = replacementString;
    }

    public StringBuffer processText() {
        int start = 0;

        while (start < inputText.length()) {
            int end = start;
            int actualLength = 0;

            while (end < inputText.length() && !Character.isWhitespace(inputText.charAt(end))) {
                if (Character.isLetterOrDigit(inputText.charAt(end))) {
                    actualLength++;
                }
                end++;
            }

            if (actualLength == wordLength) {
                int replacementIndex = 0;

                for (int i = start; i < end; i++) {
                    if (Character.isLetterOrDigit(inputText.charAt(i))) {
                        if (replacementIndex < replacementString.length()) {
                            inputText.setCharAt(i, replacementString.charAt(replacementIndex++));
                        } else {
                            inputText.deleteCharAt(i);
                            end--;
                            i--;
                        }
                    }
                }

                while (replacementIndex < replacementString.length()) {
                    inputText.insert(end, replacementString.charAt(replacementIndex++));
                    end++;
                }
            }

            start = end + 1;
        }

        return inputText;
    }

}
