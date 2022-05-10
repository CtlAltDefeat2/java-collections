package student3;

import java.util.Map;
import java.util.Stack;

public class WordReverser {
    private String inputString;
    private Stack<String> wordStack = new Stack<>();
    private int wordCount = 0;

    public WordReverser(String inputString) {
        this.inputString = inputString;
    }
    public void reverseWords(){
        String[] reverse = inputString.split(" ");
        for (String words: reverse){
            wordStack.push(words);
        }


    }
    public String getReversedWords(){
        String retVal = "";
        while(!wordStack.isEmpty()){
            retVal += wordStack.pop() + " ";
            wordCount++;
        }
        return retVal;
    }
    public int getWordCount() {
        return wordCount;
    }

}
