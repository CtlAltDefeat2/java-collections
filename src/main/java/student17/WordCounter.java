package student17;

import java.util.HashMap;
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
        String[] words = sent.split(" ");
        for(String word : words){
            hashMap.merge(word, 1, Integer::sum);
        }
        System.out.println(hashMap);
    }

    public void countWords() {
    }

    public boolean getWordCount() {
        return false;
    }
}
