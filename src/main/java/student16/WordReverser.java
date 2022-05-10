package student16;

import java.util.Stack;
import java.util.StringTokenizer;

public class WordReverser {
    private final Stack<String> stack = new Stack<String>( );
    StringTokenizer st;
    String word = new String( );
    private int wordCount = 0;

    public WordReverser(String sentence) {
        st = new StringTokenizer(sentence);
        while (st.hasMoreTokens( )) {
            stack.push(st.nextToken( ));
        }
    }

    public void reverseWords() {
        while (!stack.isEmpty( )) {
            word += stack.pop( ) + " ";
            wordCount++;
        }
    }

    public String getReversedWords() {
        return word;
    }

    public int getWordCount() {
        return wordCount;//ctrl a highlights everything; ctrl alt l fixes spacing
    }
}


