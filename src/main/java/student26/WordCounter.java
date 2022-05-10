package student26;

import java.beans.IntrospectionException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class WordCounter {

    private String phrase;
    private HashMap<String, Integer> counter = new HashMap<String, Integer>();
//
    public WordCounter(String phrase) {
        this.phrase=phrase;

    }
    public String getPhrase() {
        return phrase;
    }


   public void  countWords () {

        String I = phrase;
        String [] count = I.split(" ");
        for (String words: count) {
            counter.merge(words.toLowerCase(), 1, Integer :: sum);
        }

   }
   public String getWordCount () {

        String value = "";

        for (Map.Entry<String, Integer> result : counter.entrySet()) {
            value = value + result.getKey() + " " + result.getValue() + '\n';
           }
            return value;
    }


}
