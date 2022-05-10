package student25;

import java.util.Stack;

public class WordReverser {
    private String reversedWords;
    private Stack<String> reverseString = new Stack<>();
    private int wordCount;

    public WordReverser(String reversedWords) {
        this.reversedWords = reversedWords;
    }

    public void reverseWords() {
        String a = reversedWords;
        String[] b = a.split(" "); // stored in array and split
        for (int i = 0; i < b.length; i++) { // Push words into the stack
            reverseString.push(b[i]);
        }
    }
    public String getReversedWords() {
        var retVal = "";
        while (!reverseString.empty()) {
            retVal += reverseString.pop() + " "; // popping it backwards automatically
            wordCount++;
        }
        return retVal;
    }

    public int getWordCount() {
        return wordCount;
    }
}

