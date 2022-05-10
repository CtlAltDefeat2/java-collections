package student5;

import java.util.Stack;

public class WordReverser {
    // Variable Declarations
    private String input;
    private Stack<String> wordStack = new Stack<>();
    private StringBuilder restring = new StringBuilder();
    private int wordCount;
    // Constructors
    public WordReverser (String input) {
        this.input = input;
    }
    // Methods
    public void reverseWords() {
        var inputArray = input.split(" ");
        for (int i = 0; i < inputArray.length; i++) {
            this.wordStack.push(inputArray[i]);
        }
        wordCount = wordStack.size();
    }
    public String getReversedWords() {
        while (!wordStack.isEmpty()) {
            restring = restring.append(wordStack.peek() + " ");
            wordStack.pop();
        }
        return restring.toString();
    }
    public int getWordCount() {
        return wordCount;
    }
}