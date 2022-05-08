package student0;

import java.util.Stack;
import java.util.StringTokenizer;

public class WordReverser {

    //
    // Data members
    //

    private StringTokenizer stringTokenizer;
    private Stack<String> stringStack;

    //
    // Constructors
    //

    public WordReverser() {}

    public WordReverser(String inputString) {
        this.stringTokenizer = new StringTokenizer(inputString);
        stringStack = new Stack<String>();
    }

    //
    // Methods
    //

    public void reverseWords() {
        while (stringTokenizer.hasMoreTokens()) {
            var word = stringTokenizer.nextToken();
            stringStack.push(word);
        }
    }

    public String getReversedWords() {
        var sb = new StringBuilder();
        while (!stringStack.empty()){
            sb.append(stringStack.pop());
            sb.append(" ");
        }
        return sb.toString();
    }
}
