package student9;

import java.util.Stack;

public class WordReverser {
    // Create data members.
    private String inputString;
    // StringBuilder reverseString = new StringBuilder();
    Stack<String> reverseStack = new Stack<>(); // wordStack or reverseStack.
    private int wordCount;

    // Generate constructor.
    public WordReverser(String inputString) {
        this.inputString = inputString;
    }

    public String getInputString() { // Pop the last item added onto the stack.
        var retVal = "";
        while (!reverseStack.isEmpty()) {
            retVal += reverseStack.pop() + " ";
            wordCount++;
        }
        return retVal;
    }

    public int getWordCount() {
        return wordCount;
    }

    public void reverseWords() { // Convert the String into an array of string. Add each word onto the stack.
        String[] reverseWords = inputString.split(" ");
        for (String word : reverseWords) {
            reverseStack.add(word);
        }

    }

    }

