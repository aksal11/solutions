public class Solution {

    public static void main(String[] args) {

        int[] target = {1,2,3,2,1};
        System.out.println(minNumberOperations(target));

    }

    public static int minNumberOperations(int[] target){
        int start  = target[0];

        for( int i  = 1;  i < target.length; i++){
            if ( target[i] > target[i-1]){
                start = start + ( target[i] - target[i-1]);
            }
        }
        return start;
    }
}


