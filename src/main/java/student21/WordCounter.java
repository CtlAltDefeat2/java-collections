package student21;

import java.util.HashMap;

public class WordCounter {

    HashMap<String,Integer> wordCounter = new HashMap<String,Integer>();


    public WordCounter(String inputString) {
        //Splitting words and storing them in array
        String[] words = inputString.split(" ");

        for (String word: words){
            //asking if the hashmap contains the key or not. will return null if not
            Integer integer = wordCounter.get(word);
            if(integer == null){
                wordCounter.put(word,1);
            }else{
                wordCounter.put(word,integer+1);
            }
        }
        System.out.println(wordCounter);
    }
}
