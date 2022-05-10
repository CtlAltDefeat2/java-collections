package student14;

public class WordReverser {
    //data members
    private String reversedWords;
    StringBuilder reverseString = new StringBuilder();

    //constructor
    public WordReverser(String reversedWords) {
        this.reversedWords = reversedWords;
    }

    public StringBuilder getReversedWords() {
        return reverseString;
    }

    //methods
    public void reverseWords() {
        String[] words = reversedWords.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            this.reverseString.append(words[i]).append(" ");
        }
    }
}

