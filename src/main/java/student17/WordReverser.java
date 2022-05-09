package student17;

import java.util.Arrays;
import java.util.regex.Pattern;

public class WordReverser {
    //
    //Data Members
    //
    private String word;
    //
    //Constructor
    //
    public WordReverser(String word) {
        this.word = word;
        reverseWords();
    }
    public String reverseWords() {
        String[] words = word.split("\\s");
        String result = "";
        for(int i = 0; i < words.length; i++){
            if(i == words.length -1)
                result = words[i] + result;
            else
                result = " " + words[i] + result;
        }
        return result;
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

