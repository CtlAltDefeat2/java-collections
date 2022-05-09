package student14;

import java.util.HashMap;

public class WordCounter {

    HashMap<String, Integer> wordCounter = new HashMap<>();
    private String inputString = "";


    public WordCounter(String inputString) {
        this.inputString = inputString;
    }

    public void countWords() {
            String[] wordsList = inputString.toLowerCase().split(" ");

            for (String word: wordsList){
                Integer integer = wordCounter.get(word);
                if(integer == null){
                    wordCounter.put(word,1);
                }
                else{
                    wordCounter.put(word,integer+1);
                }
            }
            System.out.println(wordCounter);
        }
    public String getWordCount() {
    var string = " ";
        string = wordCounter.toString();

        return string;
    }
//
//    @Override
//    public String toString() {
//        return "WordCounter{" +
//                "wordCounter=" + wordCounter +
//                ", inputString='" + inputString + '\'' +
//                '}';
//    }
}
