package student7;

import java.util.Stack;

public class WordReverser {
    private String inputString;
    private Stack<String> wordStack = new Stack<>();
    private int wordCount = 0;
    private String retVal = "";
    public WordReverser(String inputString) {
        this.inputString = inputString;
    }
    public void reverseWords(){
        String[] reverse = inputString.split(" ");
        for(String words : reverse){
            wordStack.push(words);
        }
        while(!wordStack.isEmpty()){
            retVal += wordStack.pop() + " ";
            wordCount++;
        }
    }
    public String getReversedWords(){
        return retVal;
    }
    public int getWordCount() {
        return wordCount;
    }
}
