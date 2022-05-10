package student1;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    //
    //Data Members
    //

    private String inputString;

    HashMap<String, Integer> frequency = new HashMap<String, Integer>();

    //
    // Constructor
    //

    public WordCounter (String inputString) {
        this.inputString = inputString;
    }

    //
    // Methods
    //

    public void countWords() {
        String[] words = inputString.split(" ");
        for (String word : words) {
            if (frequency.containsKey(word.toLowerCase())) {
                frequency.put(word.toLowerCase(), frequency.get(word) + 1);
            } else frequency.put(word.toLowerCase(), 1);
        }
    }

    public String getWordCount() {
        String retVal = "";
        for (Map.Entry<String, Integer> freq : frequency.entrySet()) {
            retVal += freq.getKey() + " " + freq.getValue() + "\n";
        }
        return retVal;
    }
}
