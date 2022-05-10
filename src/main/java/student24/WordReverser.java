package student24;

import java.util.Stack;

public class WordReverser {
    private String reverseWords;
    private String word= "";
    private int wordCount;
   private Stack<String> sentence= new Stack<>();


    public WordReverser(String reverseWords) {
        this.reverseWords = reverseWords;
    }

    public void reverseWords() {
        String[] reverse = reverseWords.split(" ");
        for(String s: reverse){
            sentence.push(s);
            wordCount++;
        }


    }

    public String getReversedWords() {
        var word = "";
        while(!sentence.isEmpty()) {
            word += sentence.pop() + " ";


        }
        return word;

    }

    public int getWordCount() {
        return wordCount;
    }
}
