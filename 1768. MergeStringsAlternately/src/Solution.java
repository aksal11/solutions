public class Solution {

    public static void main(String[] args) {
        String word1 = "pq";
        String word2 ="gthsd";
        System.out.println(mergeAlternately(word1,word2));


    }

    public static String mergeAlternately( String word1, String word2){

        StringBuilder sb = new StringBuilder();
        int n1 = word1.length();
        int n2 = word2.length();
        int n = Math.max(n1,n2);

        for ( int i = 0 ; i < n; i++){
            if( i < n1)sb.append(word1.charAt(i));
            if ( i< n2)sb.append(word2.charAt(i));
        }

        return sb.toString();

    }

}
