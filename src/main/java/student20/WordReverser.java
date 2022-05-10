package student20;

import java.util.Stack;

public class WordReverser {

    Stack<String> wordStack = new Stack<String>();
    int wordCount = 0;
    String reversedWords = "";

    WordReverser(String words) {
        String[] allWords = words.split(" ");
        for (String i: allWords) {
            wordStack.push(i);
        }
    }


    public Integer getWordCount() {
        return wordCount;
    }

    public void reverseWords() {
        for (int i = wordStack.size()-1; i >= 0; i--) {
            reversedWords += wordStack.pop() + " ";
            wordCount++;
        }
    }

    public String getReversedWords() {
        return reversedWords;
    }



}