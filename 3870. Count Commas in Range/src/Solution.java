public class Solution {

    public static void main(String[] args) {

        int n = 1002;
        System.out.println(countCommas(n));

    }

    private static int countCommas(int n){

//        if ( n < 999){
//            return 0;
//        }
//
//        int result = 0;
//        for ( int i = 1000; i <= n ; i++){
//            result ++;
//        }
//        return result;

        if ( n < 999){
            return 0;
        }

        return n - 999;

    }
}
