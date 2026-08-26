public class Solution {

    public static void main(String[] args) {
        int n = 15, t = 3;

        System.out.println(smallestNumber(n,t));
    }

    private static  int smallestNumber(int n, int t){

        for ( int i = n;  ; i++){

            int product = 1;

            int temp = i;

            while (temp > 0){
                int digit = temp % 10;
                product *=digit;
                temp /= 10;
            }

            if ( product % t == 0){
                return i;
            }
        }

    }
}
