package student5;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    // Variable Declarations
    private String input;
    private Integer wordCount = 1;
    private String word;
    private Integer integer;
    private Map<String, Integer> countMap = new HashMap<>();
    // Constructors
    public WordCounter (String input) {
        this.input = input;

    }
    // Accessors
    public String getWordCount() {
        countMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
        return "";
    }
    // Methods
    public void countWords() {
        input = input.toLowerCase();
        var inputArray = input.split(" ");
        for (String word : inputArray) {
            wordCount = 1;
            integer = countMap.get(word);
            if (integer == null) {
                countMap.put(word, wordCount);
            } else {
                countMap.put(word, (wordCount + 1));
            }
        }
    }
    // Overrides
}
