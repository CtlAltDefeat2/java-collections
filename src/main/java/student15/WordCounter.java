package student15;

import java.util.StringTokenizer;

public class WordCounter {
    StringTokenizer stringTokenizer;

    public WordCounter(String inputString) {
        stringTokenizer= new StringTokenizer(inputString);

    }
// inside a constructor - getting values that are being passed inside the class
    public void countWords() {

        System.out.println(stringTokenizer.countTokens());
    }

    public String getWordCount() {
        return stringTokenizer.toString();
    }
}
