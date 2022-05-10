package student23;

import java.util.Stack;
import java.util.StringTokenizer;

public class WordReverser {
    private Stack<String> wordStack = new Stack<>();
    private StringTokenizer stringTokenizer;
    private String reverseWords = "";
    private int wordCount;

    public WordReverser(String string) {
         stringTokenizer= new StringTokenizer(string);
         wordCount = 0;
         while(stringTokenizer.hasMoreTokens()){
             wordStack.push(stringTokenizer.nextToken());
             wordCount++;
         }
    }

    public void reverseWords() {
        while(!wordStack.isEmpty()){
            reverseWords += wordStack.pop() + " ";
        }
    }

    public String getReversedWords() {
        return reverseWords;
    }

    public int getWordCount() {
        return wordCount;
    }
}
