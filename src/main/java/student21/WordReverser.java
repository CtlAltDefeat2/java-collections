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
//       String tokenizer separates words from the string
        StringTokenizer st = new StringTokenizer(inputString);

//        While the tokenizer has more tokens, add them to the "reverse" stack.
        while(st.hasMoreTokens()){
            reverse.push(st.nextToken());
        }

    }

    public String getReversedWords() {
//       Initialize return string
        var retVal = "";

//        this says while the "reverse" stack is not empty, add the top of the stack to the return string along with
//        a space in between each word
        while(!reverse.empty()){
            retVal += reverse.pop() + " ";
        }
        return retVal;
    }
}
