public class Solution {

    public static void main(String[] args) {
        int n = 10;
        System.out.println(smallestNumber(n));
    }


    public static int smallestNumber(int n){

        int x  = 1;

        while ( x < n){
            x = ( x << 1) | 1;
        }
        return x;
    }
}
