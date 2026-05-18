public class Solution {

    static void main() {

        String n = "27346209830709182346";
        System.out.println(minPartitions(n));

    }

    private static int minPartitions(String n){

        int max = 0;

        for ( int i = 0 ; i< n.length(); i++){

            int currentValue = n.charAt(i) - '0';
            max = Math.max(currentValue, max);
        }
        return max;
    }
}
