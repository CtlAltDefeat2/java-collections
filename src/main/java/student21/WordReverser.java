package student21;

import java.util.Stack;
import java.util.StringTokenizer;

public class WordReverser {
    
    private String inputString;

    private Stack<String> reverse = new Stack<String>();

    public WordReverser(String inputString) {
        this.inputString = inputString;
    }

    public void reverseWords() {
        StringTokenizer st = new StringTokenizer(inputString);
        while(st.hasMoreTokens()){
            reverse.push(st.nextToken());
        }

    }

    public String getReversedWords() {
        var retVal = "";
        while(!reverse.empty()){
            retVal += reverse.pop() + " ";
        }
        return retVal;
    }
}
