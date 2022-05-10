package student26;

import java.util.Stack;

public class WordReverser {

    private String phrase;
    private Stack <String> sentence = new Stack<>();
    private int wordCount;

    public WordReverser(String phrase) {
        this.phrase=phrase;

    }

    public void reverseWords () {

        String [] reverse = phrase.split("");
        for (String i : reverse){
            sentence.push(i);
            wordCount++;
        }

    }

    public String getReversedWords() {

        String retval = "";
        while (!sentence.isEmpty()) {

            retval = retval +  sentence.pop() + "";
        }
            return retval;
    }

    public int getWordCount() {
        return wordCount;
    }
}
