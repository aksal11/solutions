public class Solution {

    public static void main(String[] args) {
        String s = "LLRLRLLSLRLLSLSSSS";
        System.out.println(countCollisions(s));

    }


    public static int countCollisions(String directions){

        char[] array = directions.toCharArray();
        int length = array.length;

        int left  = 0;
        while ( left < length && array[left] =='L'){
            left++;
        }

        int right  = length-1;
        while ( right >= 0  && array[right] =='R'){
            right--;
        }

        int collsions = right  - left + 1 ;
        for ( int i = left ; i <= right ; i++){
            if ( array[i] == 'S'){
                collsions--;
            }
        }
        return collsions;

    }
}
