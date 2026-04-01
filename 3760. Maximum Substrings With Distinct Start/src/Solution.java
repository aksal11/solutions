import java.util.HashMap;

public class Solution {

    public static void main() {

        String s = "abab";
        System.out.println(maxDistinct(s));

    }

    public static int maxDistinct(String s){

        HashMap<Character, Integer> map = new HashMap<>();

        for ( int i = 0 ; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }

        return map.size();
    }
}
