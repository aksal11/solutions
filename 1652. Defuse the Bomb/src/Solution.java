import java.util.Arrays;

public class Solution {


    public static void main(String[] args) {

        int[] nums = { 2,4,9,3};
        int k = -2;
        System.out.println(Arrays.toString(decrypt(nums,k)));

    }


    public static int[] decrypt(int[] code, int k){

        int n = code.length;
        int[] result= new int[n];

        if ( k == 0){
            return  result;
        }



        for ( int i = 0 ; i < n ; i++){

            if ( k > 0){
//                sum the next k elements
                for ( int j = 1; j<= k ; j++){
                    int index = (i + j) % n;
                    result[i] += code[index];
                }
            }
            else{
//                sum previous k elements
                for ( int j = -1; j >= k ; j--){
                    int index = (i + j + n) % n;
                    result[i] += code[index];
                }
            }
        }
        return result;
    }
}
