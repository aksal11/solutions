public class Solution {

    public static void main() {

        int n = 10;
        int m = 3;
        System.out.println(differenceOfSums(n,m));

    }

    private static int differenceOfSums(int n, int m){

        int num1 = 0;
        int num2 = 0;

        for ( int i = 1; i <=n; i++){
            if ( i % m == 0){
                num2 += i;
            }else{
                num1 += i;
            }
        }

        return num1 -  num2;


    }
}
