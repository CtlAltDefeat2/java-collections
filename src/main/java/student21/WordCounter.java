package student21;

import java.util.HashMap;

public class WordCounter {

    HashMap<String,Integer> wordCounter = new HashMap<String,Integer>();


    //This method takes the given string, which is the input string from the main class and counts the number
    //of words and how many times they occur
    public WordCounter(String stringFromMain) {
        //Splitting words and storing them in array
        String[] words = stringFromMain.split(" ");

        for (String word: words){
            //asking if the hashmap contains the key or not. will return null if not
            Integer integer = wordCounter.get(word);
            if(integer == null){
                wordCounter.put(word,1);
            }else{  //else statement increments the word count for the word if the count is not null
                wordCounter.put(word,integer+1);
            }
        }
        System.out.println(wordCounter);
    }
}
