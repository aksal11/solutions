public class Solution {

    public static void main(String[] args) {

        String s = "leet**cod*e";
        System.out.println(removeStars(s));

    }

    public static String removeStars(String s){
        StringBuilder sb = new StringBuilder();

        int pointer = -1;


        for ( int i = 0 ; i< s.length();i++){

            if ( s.charAt(i) != '*'){
                sb.append(s.charAt(i));
                pointer++;
            }else{
                sb.deleteCharAt(pointer);
                pointer--;
            }
        }

        return sb.toString();
    }
}
