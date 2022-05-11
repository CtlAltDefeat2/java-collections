package student13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class WordReverser {
    private ArrayList<String> arrString;
    private Stack<String> reverseOrder;
    private String inputString;
    private int wordCount;

    WordReverser(String inputString) {
        this.inputString = inputString;
        this.arrString = new ArrayList<>();
        this.reverseOrder = new Stack<>();
        this.wordCount = wordCount;
    }

    public void reverseWords() {
        String[] strSplit = inputString.split(" ");

        for (String s : Arrays.asList(strSplit)) {
            arrString.add(s);
        }
        for (int i = 0; i < arrString.size(); i++){
            reverseOrder.push(arrString.get(i));

        }
    }

    public String getReversedWords() {
        String reverseArr = "";

        while(!reverseOrder.isEmpty()) {
            reverseArr += reverseOrder.pop() + " ";
            wordCount = wordCount + 1;
        }
        return reverseArr;
    }

    public int getWordCount() {

        return wordCount;
    }


}
