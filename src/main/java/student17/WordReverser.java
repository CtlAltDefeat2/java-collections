package student17;

import java.util.Arrays;
import java.util.Stack;
import java.util.regex.Pattern;

public class WordReverser {
    //
    //Data Members
    //
    private Stack<String> stack = new Stack();
    private String word;
    //
    //Constructor
    //
    public WordReverser(String word) {
        this.word = word;
        getReversedWords();
    }
    public String reverseWords() {
        String[] words = word.split("\\s");
        for(String reverse : words){
            stack.push(reverse);
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop()).append(" ");
        }
        if(!sb.isEmpty()){
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }
    public String getReversedWords() {

        return reverseWords();
    }
    public long getWordCount(){
        String[] words = word.split("\\s");
        var count = Arrays.stream(words).count();
        return count;
    }
    }

