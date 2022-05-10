package student12;

import java.util.Stack;
import java.util.StringTokenizer;

public class WordReverser {
    //
    //Data Members
    //

    private String entry;
    private Stack entryStack = new Stack<StringTokenizer>();
    private int count;

    //
    //Constructors
    //
    WordReverser(){

    }

    WordReverser(String entry){
        this.entry = entry;
    }
    //
    //Accessors
    //
    public String getReversedWords(){
        String retval = "";
        this.count = entryStack.size();
        for (int i = 0; i < count; i++){
            retval += entryStack.pop() + " ";
        }
        return retval;
    }

    public Integer getWordCount(){
        return count;
    }

    //
    //Methods
    //
    public void reverseWords(){
        String[] reverser = entry.split(" ");
        for (int i = 0; i < reverser.length; i++) {
            this.entryStack.push(reverser[i]);
        }
    }


    //
    //Overrides
    //
}
