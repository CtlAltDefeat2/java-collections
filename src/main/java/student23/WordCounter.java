package student23;

import java.util.StringTokenizer;

public class WordCounter {
    StringTokenizer stringTokenizer;
    int wordCount = 0;

    public WordCounter(String inputString) {
        stringTokenizer = new StringTokenizer(inputString);
    }

    public void countWords() {
      wordCount = stringTokenizer.countTokens();

    }

    public int getWordCount() {
        return wordCount;
    }
}
