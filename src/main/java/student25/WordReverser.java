package student25;

public class WordReverser {
    private String reversedWords;
    StringBuilder reverseString = new StringBuilder();

    public WordReverser(String reversedWords) {
        this.reversedWords = reversedWords;
    }

    public StringBuilder getReversedWords() {
        return reverseString;
    }

    public void reverseWords() {
        String a = reversedWords;
        String[] b = a.split(" "); // stored in array and split
        for (int i = b.length - 1; i >= 0; i--) { //
            reverseString.append(b[i]).append(" ");
        }
    }
}

