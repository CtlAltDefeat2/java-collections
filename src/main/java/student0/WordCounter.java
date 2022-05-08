package student0;

import java.util.HashMap;
import java.util.Locale;
import java.util.StringTokenizer;

public class WordCounter {

    //
    // Data Members
    //

    private StringTokenizer stringTokenizer;
    private HashMap<String, Integer> wordMap;

    //
    // Constructors
    //

    public WordCounter() {}

    public WordCounter(String inputString) {
        this.stringTokenizer = new StringTokenizer(inputString);
        this.wordMap = new HashMap<String, Integer>();
    }

    //
    // Public methods
    //

    public void countWords() {
        while (stringTokenizer.hasMoreTokens()) {
            var word = stringTokenizer.nextToken().toLowerCase(Locale.ROOT);
            if (wordMap.containsKey(word)) {
                var count = wordMap.get(word);
                wordMap.put(word, ++count);
            } else {
                wordMap.put(word, 1);
            }
        }
    }

    public String getWordCount() {
        var retval = "";
        var keySet = wordMap.keySet();
        for (String s : keySet) {
            retval += (s + " " + wordMap.get(s) + "\n");
        }
        return retval;
    }
}
