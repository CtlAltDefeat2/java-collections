package student11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class WordCounter {
    private String inputString;
    HashMap<String, Integer> frequency = new HashMap<>( );
    public WordCounter(String inputString) {
        this.inputString = inputString;
    }
    public void countWords() {
        String[] words = inputString.split(" ");
        for (String word : words) {
            if (frequency.containsKey(word.toLowerCase( ))) {
                frequency.put(word.toLowerCase( ), frequency.get(word) + 1);
            } else {
                frequency.put(word.toLowerCase( ), 1);
            }
        }
    }
    public String getWordCount() {
        String value = " ";
        for (Map.Entry<String, Integer> number : frequency.entrySet( )) {
            value += number.getKey( ) + " " + number.getValue( ) + " \n";
        }
        return value;
    }
}
