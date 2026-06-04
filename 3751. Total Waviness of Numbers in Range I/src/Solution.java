public class Solution {

    public static void main() {

        int num1 = 198;
        int num2 = 202;
        System.out.println(totalWaviness(num1,num2));
    }

    private static int totalWaviness(int num1, int num2){

        int total = 0;
        for ( int i = num1; i <= num2 ; i++){
            total += waviness(i);
        }
        return total;

    }

    private static int waviness( int num){

        String s= String.valueOf(num);

        if ( s.length() < 3) return 0;

        int count = 0;

        for ( int i = 1; i < s.length()-1; i++){
            char left = s.charAt(i-1);
            char right = s.charAt(i +1);
            char current = s.charAt(i);

            if ( ( current > left && current > right) || ( current < left && current < right)){
                count++;
            }

        }
        return count;

    }
}
