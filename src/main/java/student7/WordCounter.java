package student7;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class WordCounter {
    private String inputString;
    private int wordCount = 0;
    private HashMap<String, Integer> wordMap = new HashMap<String, Integer>();

    public WordCounter(String inputString) {
        this.inputString = inputString;
    }
    public void countWords(){//put all the words into a hashmap and increment base on the number of words
        String[] words = inputString.split(" ");
        for(String word : words){
            if(wordMap.containsKey(word.toLowerCase()))//check for instance of word
                wordMap.put(word.toLowerCase(), wordMap.get(word)+1);
            else //add first instance of word
                wordMap.put(word.toLowerCase(),1);//toLowerCase is used to so casing doesn't affect the word count
        }
    }
    public String getWordCount() {
        String retVal = "";
        for (Map.Entry<String, Integer> set : wordMap.entrySet()){//loop through all the entry
           retVal+= set.getKey() + " " + set.getValue() + "\n";
        }
        return retVal;
    }
}
