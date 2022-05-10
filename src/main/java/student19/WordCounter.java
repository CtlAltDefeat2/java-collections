package student19;
import java.util.HashMap;
import java.util.Map;
public class WordCounter {
    private String str = new String();
    private Map<String, Integer> m = new HashMap<String, Integer>();
    public WordCounter(String str){
       this.str = str;
    }
    public void countWords () {
        String[] tokens = str.split(" ");
        for (String token: tokens) {
            if(m.containsKey(token))
                m.put(token, (m.get(token) + 1));
            else
                m.put(token, 1);
        }
    }
        public String getWordCount(){
        String s1 = new String( );
        for(Map.Entry<String, Integer> entry : m.entrySet()) {
            s1 += entry.getKey() + " = " + entry.getValue() + '\n';
        }
      return s1;
        }
}