package student25;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class WordCounter {
    private String words;
   private HashMap<String, Integer> freqCounter = new HashMap<String, Integer>();
    public WordCounter(String words) {
        this.words = words;
    }

    // The WordCounter contains a HashMap which contains the number of occurrences for each word in the sentence.

    public void countWords() {
        String a = words;
       String[] b = a.split(" "); // stored in array and split
        for (String word : b){
            freqCounter.merge(word.toLowerCase(Locale.ROOT) , 1, Integer::sum);
        }
    }


    public String getWordCount() {
        String retVal = " ";

        for(Map.Entry<String, Integer> result : freqCounter.entrySet()) {
            retVal += result.getKey() + " = " + result.getValue() + '\n';
        }
        return retVal;
    }
}


