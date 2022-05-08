package student0;

import java.util.HashMap;
import java.util.Locale;
import java.util.StringTokenizer;

public class WordCounter {

    //
    // Data Members
    //

    private StringTokenizer stringTokenizer;
    private HashMap<String, Integer> wordDictionary;

    //
    // Constructors
    //

    public WordCounter() {}

    public WordCounter(String inputString) {
        this.stringTokenizer = new StringTokenizer(inputString);
        this.wordDictionary = new HashMap<String, Integer>();
    }

    //
    // Public methods
    //

    public void countWords() {
        while (stringTokenizer.hasMoreTokens()) {
            var word = stringTokenizer.nextToken().toLowerCase(Locale.ROOT);
            if (wordDictionary.containsKey(word)) {
                var count = wordDictionary.get(word);
                wordDictionary.put(word, ++count);
            } else {
                wordDictionary.put(word, 1);
            }
        }
    }

    public String getWordCount() {
        var retval = "";
        var keySet = wordDictionary.keySet();
        for (String s : keySet) {
            retval += (s + " " + wordDictionary.get(s) + "\n");
        }
        return retval;
    }
}
