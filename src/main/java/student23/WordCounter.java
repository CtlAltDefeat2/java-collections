package student23;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class WordCounter {
    StringTokenizer stringTokenizer;
    HashMap<String, Integer> hashmap = new HashMap<>();
    Map.Entry<String, Integer> entry;

    public WordCounter(String inputString) {
        stringTokenizer = new StringTokenizer(inputString);
    }

    public void countWords() {
        int value = 0;

        while(stringTokenizer.hasMoreTokens()){
            String key = stringTokenizer.nextToken().toLowerCase();

            if(hashmap.containsKey(key)){
                value = hashmap.get(key);
                value++;
                hashmap.replace(key, value);
            }
            else{
                hashmap.put(key , 1);
            }
        }
    }

    public String getWordCount() {
        String output = "";
        for(Map.Entry<String, Integer> entry : hashmap.entrySet()){
            output += entry.getKey() + " " + entry.getValue() + "\n";
        }
        return output;
    }
}
