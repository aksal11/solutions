public class Solution {

    static final int  MAX = 2147483647; //2^31-1
    static final int MIN =-2147483648; // -2^31


    public static void main(String[] args) {

        int x = -123;
        System.out.println(reverse(x));

    }

    public static int reverse ( int x){

        int res  = 0;
        while ( x != 0){
            int digit = x % 10;
            x = x /10;

            if ( res > MAX /10 || ( res == MAX && digit > MAX % 10)){
                return 0;
            }
            if ( res < MIN/10 || ( res == MIN && digit < MIN % 10)){
                return 0;
            }

            res = ( res * 10) + digit;

        }
        return res;


    }

}
