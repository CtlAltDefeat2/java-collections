package student8;

import java.util.HashMap;
import java.util.Map.Entry;

public class WordCounter {

    String inputString;
    HashMap<String, Integer> frequency = new HashMap<String, Integer>();

        WordCounter (String inputString) {
            this.inputString = inputString;
        }

        public void countWords() {
            int counter = 0;
            String[] s = inputString.split(" ");
            for (int i = 0; i < s.length; i++) {
                String key = s[i].toLowerCase();
                int freq = frequency.getOrDefault(key, 0);
                frequency.put(key, ++freq);
            }
        }


        public String getWordCount() {

            for (Entry<String, Integer> result : frequency.entrySet()) {
                System.out.println(result.getKey() + " " + result.getValue());
            }
            return "";
        }

}
