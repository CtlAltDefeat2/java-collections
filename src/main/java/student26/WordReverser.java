package student26;

import java.util.Stack;
import java.util.StringTokenizer;

public class WordReverser {

    private String phrase;
    private Stack <String> sentence = new Stack<>();


    public WordReverser(String phrase) {
        this.phrase=phrase;

    }

    public void reverseWords () {

        String [] reverse = phrase.split("");
        for (String i : reverse){
            sentence.push(i);
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

        StringTokenizer token = new StringTokenizer(phrase);

        return token.countTokens();
    }
}
