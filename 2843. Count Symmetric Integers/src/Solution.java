public class Solution {

    public static void main() {

        int low = 1200;
        int high = 1230;

        System.out.println(countSymmetricIntegers(low,high));

    }

    private static int countSymmetricIntegers(int low, int high){

        int count = 0;

        for ( int num = low; num <= high; num++){


            String s = String.valueOf(num);

            if ( s.length() % 2 ==1){
                continue;
            }

            int mid = s.length() /2;

            int leftSum = 0;
            int rightSum = 0;

            for ( int i = 0; i < mid; i++){
                leftSum += s.charAt(i)-'0';
            }

            for ( int i = mid; i < s.length(); i++){
                rightSum += s.charAt(i) -'0';
            }

            if ( leftSum == rightSum){
                count++;
            }
        }
        return  count;
    }
}
