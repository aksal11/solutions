public class Solution {

    public static void main(String[] args) {

        String s = "leetcoder";
        System.out.println(doesAliceWin(s));

    }

    public static boolean doesAliceWin( String s){

        for ( char c : s.toCharArray()){
            if ( isVowel(c)){
                return true;
            }

        }
        return false;

    }

    private static boolean isVowel( Character c){
        return "aeiou".indexOf(c) != -1;
    }
}
