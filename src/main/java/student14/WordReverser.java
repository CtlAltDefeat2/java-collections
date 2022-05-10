package student14;

import java.util.Stack;

public class WordReverser {
    //data members
    private String reversedWords;
    Stack<String> reverseString = new Stack<>();
    StringBuilder string = new StringBuilder();
    private int wordCount;

    //constructor
    public WordReverser(String reversedWords) {
        this.reversedWords = reversedWords;
    }
    public String getReversedWords() {
        var retVal = "";
        while (!reverseString.isEmpty()) {
            retVal += reverseString.pop() + " ";
            wordCount++;
        }
        return retVal;
    }
    public int getWordCount() {
        return wordCount;
    }

    //methods
    public void reverseWords() {
        String[] words = reversedWords.split(" ");
        for (String word : words) {
            reverseString.push(word);
        }
    }
}