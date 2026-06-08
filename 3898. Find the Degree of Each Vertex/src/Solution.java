import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {

    static void main() {

        int[][] matrix = {{0,1,1},{1,0,1},{1,1,0}};
        System.out.println(Arrays.toString(findDegrees(matrix)));

    }

    private static int[] findDegrees(int[][] matrix){

        int[] result = new int[matrix.length];

        for ( int i =0 ; i < matrix.length; i++){
            for ( int j = 0 ; j < matrix.length; j++){
                result[i] += matrix[i][j];
            }
        }
        return result;
    }
}
