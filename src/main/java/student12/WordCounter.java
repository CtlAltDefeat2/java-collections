package student12;

import java.util.*;

public class WordCounter {
    //
    //Data Members
    //
    private String inputString;
    private HashMap wordMap = new HashMap<String, Integer>();
    private String[] words;
    //
    //Constructors
    //

    WordCounter() {
    }

    WordCounter(String inputString) {
        this.inputString = inputString;
    }

    //
    //Accessors
    //


    public String getWordCount() {
        String retval = "";
        // Convert the wordMap to a string \n
        Iterator list = wordMap.entrySet().iterator();
        while (list.hasNext()){
            var pair = (Map.Entry)list.next();

            retval += "\n" + pair.getKey() + " " + pair.getValue();
        }

        return retval;
    }

    //
    //Methods
    //
    public HashMap countWords() {
        String lowString = inputString.toLowerCase(Locale.ROOT);
        String[] words = lowString.split(" ");
        this.words = words;
        for (String word : words) {
            Integer integer = (Integer) wordMap.get(word);
            if (wordMap.containsKey(word)){
                wordMap.put(word, integer + 1);
            }
            else {
                wordMap.put(word, 1);
            }
        }
        return wordMap;
    }

    //
    //Override
    //

}
