package student13;

import java.util.*;

public class WordCounter {

    // Data Members

    private String inputString;
    private int wordCount;
    private ArrayList<String> arrayWords;
    private HashMap<String, Integer> wordMap;
    private List<String> listWords;

    // Constructors

    WordCounter(String inputString) {
        this.inputString = inputString;
        this.arrayWords = new ArrayList<>();
        this.wordCount = wordCount;
        this.wordMap = new HashMap<>();
    }

    // Methods

    public void countWords() {
        String[] strSplit = inputString.split(" ");
        for(String s : Arrays.asList(strSplit)) {
            arrayWords.add(s);
        }
        for (int i = 0; i < arrayWords.size(); i++) {
            Integer wordCount = wordMap.get(i);
            if (wordCount == null) {
                wordMap.put(arrayWords.get(i).toLowerCase(), 1);
            } else
            wordMap.put(arrayWords.get(i).toLowerCase(), wordCount+1);
        }
    }

    public String getWordCount() {
        for (Map.Entry<String, Integer> retVal : wordMap.entrySet()) {
            System.out.println(retVal.getKey() + " " + retVal.getValue());
        }
        return " ";
    }
}
