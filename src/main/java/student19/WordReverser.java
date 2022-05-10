package student19;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;
public class WordReverser {
    private final Stack<String> s = new Stack<String>();
    private String str = new String();
    public WordReverser(String str) {
        var st = new StringTokenizer(str);
        while (st.hasMoreTokens())
        {
            s.push(st.nextToken());
        }
    }
        public void reverseWords()
    {
            while (!s.isEmpty())
            {str += s.pop()+ " ";
            }
    }
        public String getReversedWords () {
            return str;
        }
    }
