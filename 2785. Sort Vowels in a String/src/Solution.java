import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

        String s = "lEetcOde";
        System.out.println(sortVowels(s));

    }

    public static String sortVowels(String s){

//        collect the vowels
        List<Character> vowels = new ArrayList<>();
        for ( char c : s.toCharArray()){
            if ( isVowel(c)){
                vowels.add(c);
            }
        }

//        sort
        Collections.sort(vowels);

//        string builder
        StringBuilder sb = new StringBuilder();
        int indexVowel = 0 ;
        for ( char c : s.toCharArray()){
            if ( isVowel(c)){
                sb.append(vowels.get(indexVowel));
                indexVowel++;
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) != -1;
    }

}
