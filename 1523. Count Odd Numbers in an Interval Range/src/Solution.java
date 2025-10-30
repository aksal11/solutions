public class Solution {

    public static void main(String[] args) {

        int low =  3;
        int high = 7;

        System.out.println(countOdds(low,high));

    }

    public static int countOdds(int low , int high){
        int count = ( high - low )/2;
        if  ( low% 2 ==1 || high % 2 ==1){
            count++;
        }
        return count;
    }

}
