package student4;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class WordCounter {
    //Data Members//
    StringTokenizer count;
    HashMap<String, Integer> sentence = new HashMap<>();


    public WordCounter(String inputString) {
        count = new StringTokenizer(inputString);
    }




    public void countWords() {
        int numberoftime = 0;

        while (count.hasMoreTokens()) {
            String key = count.nextToken().toLowerCase();

            if (sentence.containsKey(key)) {
                numberoftime= sentence.get(key);
                numberoftime++;
                sentence.replace(key,numberoftime);

            } else {
                sentence.put(key, 1);
            }
        }


    }


    public String getWordCount() {
        String output = "";
        for (Map.Entry<String, Integer> entry : sentence.entrySet()) {
            output += entry.getKey() + "" + entry.getValue() + "\n";
        }
        return output;

    }
}
