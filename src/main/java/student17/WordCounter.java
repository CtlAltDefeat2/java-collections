package student17;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class WordCounter {
    //
    //Data Members
    //
    private String sent;
    Map<String, Integer> hashMap = new HashMap<>();
    //
    //Constructor
    //
    public WordCounter(String sent) {
       this.sent = sent;
    }
    public void countWords() {
        String[] words = sent.toLowerCase(Locale.ROOT).split(" ");
        for (String word : words) {
            hashMap.merge(word, 1, Integer::sum);
        }
        hashMap.forEach((key, value) -> System.out.println(key + " " + value));
    }
    public String getWordCount() {
        return " ";
    }
}
