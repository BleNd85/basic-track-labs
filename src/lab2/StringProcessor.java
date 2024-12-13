package lab2;

/**
 * The {@code StringProcessor} class provides functionality to process a given text and replace words of a specified length
 * with a provided replacement string. The class uses {@code StringBuffer} to perform string operations.
 */
public class StringProcessor {
    /**
     * The input text to be processed.
     */
    private final StringBuffer inputText;
    /**
     * The length of words to be replaced.
     */
    private final int wordLength;
    /**
     * The replacement string to use for substitution.
     */
    private final StringBuffer replacementString;

    /**
     * Constructs a {@code StringProcessor} with the specified input text, word length, and replacement string.
     *
     * @param inputText         the input text to be processed
     * @param wordLength        the length of words to be replaced
     * @param replacementString the replacement string to use for substitution
     */
    public StringProcessor(StringBuffer inputText, int wordLength, StringBuffer replacementString) {
        this.inputText = inputText;
        this.wordLength = wordLength;
        this.replacementString = replacementString;
    }

    /**
     * Processes the input text by replacing words of the specified length with the replacement string.
     *
     * @return the modified input text after processing
     */
    public StringBuffer processText() {
        int start = 0;

        while (start < inputText.length()) {
            int end = start;
            int actualLength = 0;
            // Determine the end of the current word and its actual length
            while (end < inputText.length() && !Character.isWhitespace(inputText.charAt(end))) {
                if (Character.isLetterOrDigit(inputText.charAt(end))) {
                    actualLength++;
                }
                end++;
            }
            // Replace the word if its length matches the specified length
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
