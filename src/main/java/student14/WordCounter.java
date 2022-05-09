package student14;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    HashMap<String, Integer> wordCounter = new HashMap<>();
    private String inputString = "";


    public WordCounter(String inputString) {
        this.inputString = inputString;
    }

    public void countWords() {
        String[] wordsList = inputString.toLowerCase().split(" ");
        for (String word : wordsList) {
            Integer integer = wordCounter.get(word);
            if (integer == null) {
                wordCounter.put(word, 1);
            } else {
                wordCounter.put(word, integer + 1);
            }
        }
//        System.out.println(wordCounter);
    }
    public String getWordCount() {
        String retVal = "";
        for (Map.Entry<String, Integer> result : wordCounter.entrySet()) {
            retVal += result.getKey() + " " + result.getValue() + '\n';
        }
        return retVal;
    }
}