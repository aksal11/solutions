public class Solution {

    public static void main(String[] args) {
        int n = 11;
        System.out.println(hammingWeight(n



        ));

    }


//    Brian Kernighan’s Algorithm
    public static int hammingWeight( int n){
        int count = 0;
        while ( n != 0){
            n = n & ( n-1);
            count++;
        }
        return  count;
    }

}
