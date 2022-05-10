package student2;

import java.util.Stack;

public class WordReverser {
    private String str;
    private Integer count=0;
    private String reverseStack="";
    Stack<String> stack=new Stack<>();
    public WordReverser(String str) {
        this.str=str;
    }

    public void reverseWords() {
        String[] token=str.split(" ");
        for (int i=0; i< token.length;i++){
            this.stack.push(token[i]);
        }
        while (!stack.empty()) {
            reverseStack+=stack.pop()+" ";
            count++;
        }
    }

    public String getReversedWords() {

        return reverseStack;
    }
    public Integer getWordCount(){
        return count;
    }
}
