package student16;
import java.util.HashMap;
import java.util.Map;
//"The water main broke on water street on the day before my birthday"
public class WordCounter {//need to count the words in the given sentence
    //Objects
    private final String inputString;//remember private so this object is only available in this class
    //can't use HashMap unless I call it
    HashMap<String, Integer> frequency = new HashMap<>( );// HashMap - Uses a key/value system for fast lookups
   //constructors
    public WordCounter(String inputString) {// need to call what you're doing publicly
        this.inputString = inputString;// this is you're constructor, constructing the object
    }
    //methods
    public void countWords() {//for loop runs the code a
        String[] words = inputString.split(" ");
        for (String word : words) {//computers are stupid they don't realize what word you want to use
            if (frequency.containsKey(word.toLowerCase( ))) {
                frequency.put(word.toLowerCase( ), frequency.get(word) + 1);
            } else {
                frequency.put(word.toLowerCase( ), 1);
            }
        }
    }
    public String getWordCount() {
        String value = " ";
        for (Map.Entry<String, Integer> number : frequency.entrySet( )) {
            value += number.getKey( ) + " " + number.getValue( ) + " \n";
        }
        return value;
    }
}

