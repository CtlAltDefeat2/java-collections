package student17;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    //
    //Data Members
    //
    Map<String, Integer> hashMap = new HashMap<>();
    //
    //Constructor
    //
    public WordCounter(String sent) {
        String[] words = sent.split(" ");
        for (String word : words) {
            hashMap.merge(word, 1, Integer::sum);
        }
        hashMap.forEach((key, value) -> System.out.println(key + " " + value));
    }
    public void countWords() {
    }
    public String getWordCount() {
        return " ";
    }
}
