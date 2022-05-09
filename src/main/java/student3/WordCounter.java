package student3;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class WordCounter {
    private HashMap<String, Integer> wordMap= new HashMap<String, Integer>();
    private String inputString;
    private int wordCount;
    private int countWords;


    public WordCounter(String inputString) {
        this.inputString = inputString;
    }

    public String getWordCount() {
        String retVal = "";
        for(Map.Entry<String,Integer> set : wordMap.entrySet()){
            retVal += set.getKey() + " " +set.getValue() + "\n";

        }
        return retVal;
    }




    public void countWords(){
       String[] words = inputString.split(" ");
       for(String word : words){
           if (wordMap.containsKey(word)){
               wordMap.put(word.toLowerCase(), wordMap.get(word)+1);
           }
           else{
               wordMap.put(word.toLowerCase(),1);
           }

       }



    }


}

