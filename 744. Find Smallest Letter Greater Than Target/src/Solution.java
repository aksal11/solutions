public class Solution {

    public static void main(String[] args) {

        char[] letters = {'x','x','y','y'};
        char target = 'z';
        System.out.println(nextGreatestLetter(letters,target));

    }

    public static char nextGreatestLetter(char[] letters, char target){
        int ans = -1;
        int left = 0;
        int right = letters.length-1;

        while ( left <= right){
            int mid = left + ( right - left )/2;

            if ( letters[mid] > target){
                ans = mid;
                right =  mid - 1;
            }else{
                left = mid +1;
            }

        }

        if ( ans == -1){
            return letters[0];
        }
        return letters[ans];
    }
}
