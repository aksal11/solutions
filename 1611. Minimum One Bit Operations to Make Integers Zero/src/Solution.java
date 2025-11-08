public class Solution {

    public static void main(String[] args) {
        int num  = 6;
        System.out.println(minimumOneBitOperations(num));
    }

//    gray code
    public static int minimumOneBitOperations(int num){
        int res  = 0;

        while ( num != 0){
            res ^= num;
            num >>=1;
        }
        return res;
    }
}
