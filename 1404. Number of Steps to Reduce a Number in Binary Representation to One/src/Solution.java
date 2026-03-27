public class Solution {

    public static void main(String[] args){

        String s = "1101";
        System.out.println(numSteps(s));



    }

    public static int numSteps(String s){

        int step = 0;

        int carry = 0;

        for ( int i = s.length()-1; i>0; i--){

            int bit = (s.charAt(i) -'a') + carry;

            if ( bit % 2 == 0){ //even
                step+= 1;
            }else{
                step += 2;
                carry = 1;
            }
        }

        return step+ carry;
    }


}
