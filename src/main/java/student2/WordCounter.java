package student2;

import java.util.HashMap;

import java.util.Map;

public class WordCounter {
    String inputString;

    HashMap<String, Integer> wordHashMap = new HashMap<>();

    public WordCounter(String inputString) {

        this.inputString = inputString;
    }
    public void countWords() {
        String[] words = inputString.split("\\s+");
        for (String word : words) {
            if (wordHashMap.containsKey(word.toLowerCase())) {
                wordHashMap.put(word.toLowerCase(), wordHashMap.get(word) + 1);
            } else {
                wordHashMap.put(word.toLowerCase(), 1);
            }
        }
    }

    public String getWordCount() {
        StringBuilder value = new StringBuilder();

        for (Map.Entry<String, Integer> freq : wordHashMap.entrySet()) {
            value.append(freq.getKey()).append(" ").append(freq.getValue()).append("\n");
        }

        return value.toString();
    }

}