import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main() {

        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern,s));

    }

    private static boolean wordPattern(String pattern, String s){

//        split the string into words by spaces
        String[] words = s.split(" ");

//        pattern length == number of words
        if ( pattern.length() != words.length){
            return false;
        }

        HashMap<Character, String> patternToWord = new HashMap<>();
        HashMap<String, Character> wordToPattern = new HashMap<>();

        for ( int i = 0 ; i < words.length; i++){

            char patternChar = pattern.charAt(i);
            String word = words[i];

            // If patternChar exists in map, it should map to the current word
            // If word exists in map, it should map to the current patternChar
            if (!patternToWord.getOrDefault(patternChar, word).equals(word) ||
                    wordToPattern.getOrDefault(word, patternChar) != patternChar ){
                return false;
            }

            patternToWord.put(patternChar, word);
            wordToPattern.put(word, patternChar);

        }

        return true;
    }
}
