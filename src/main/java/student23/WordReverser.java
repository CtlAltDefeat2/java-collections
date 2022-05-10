package student23;

import java.util.Stack;
import java.util.StringTokenizer;

public class WordReverser {
    Stack<String> wordStack = new Stack<>();
    StringTokenizer stringTokenizer;
    String reverseWords = "";
    public WordReverser(String string) {
         stringTokenizer= new StringTokenizer(string);
         while(stringTokenizer.hasMoreTokens()){
             wordStack.push(stringTokenizer.nextToken());
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
}
