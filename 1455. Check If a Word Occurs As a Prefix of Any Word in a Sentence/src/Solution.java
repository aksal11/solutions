public class Solution {


    public static void main() {

        String s = "i love eating burger";
        String word = "burg";
        System.out.println(isPrefixOfWord(s,word));


    }

    private static int isPrefixOfWord(String sentence, String searchWord){

        String[] words = sentence.split(" ");

        for ( int i = 0 ; i < words.length; i++){

            if ( words[i].startsWith(searchWord)){
                return i+1;
            }
        }

        return -1;
    }
}
