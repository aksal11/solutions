public class Solution {

    public static void main(String[] args) {

        long n = 1004590;
        System.out.println(countCommas(n));

    }

    private  static long countCommas(long n){

//        math
//        0 - 999 = 0 comma
//        1000 - n = atleast one comma
//        n - 1000 + 1
//        1,000,000 - n =  additional one comma
//        n - 1,000,000 + 1;

        long ans = 0;

        for ( long i = 1000; i <= n; i *=1000){
            ans += n - i + 1;
        }

        return ans;
    }
}
