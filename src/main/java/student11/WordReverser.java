
package student11;
import java.util.Stack;

public class WordReverser {
    //data members
    private String inputString;
    //StringBuilder reverseString = new StringBuilder();
    Stack<String> reverseStack = new Stack<>(); //wordStack or reverseStack

    private int wordCount;

    //constructor
    public WordReverser(String inputString) {
        this.inputString = inputString;
    }
    public String getInputString() {//pop the last item added into the stack
        var retVal = "";
        while (!reverseStack.isEmpty()) {
            retVal += reverseStack.pop() + " ";
            wordCount++;
        }
        return retVal;
    }

    public int getWordCount() {
        return wordCount;
    }
    public void reverseWords() { //convert the string into an array of string then add each word into the stack
        String[] reverseWords = inputString.split(" ");
        for (String word : reverseWords) {
            reverseStack.add(word);

        }
    }

}
