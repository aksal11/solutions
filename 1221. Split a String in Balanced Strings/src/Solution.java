public class Solution {

    public static void main() {

        String s ="RLRRLLRLRL";
        System.out.println(balancedStringSplit(s));

    }

    private static int balancedStringSplit(String s){

        int balanced = 0;
        int count =0 ;

        for ( int i = 0 ; i < s.length(); i++){
            if ( s.charAt(i) == 'L'){
                count++;
            }else {
                count--;
            }

            if ( count == 0 ){
                balanced++;
            }
        }
        return balanced;
    }
}
