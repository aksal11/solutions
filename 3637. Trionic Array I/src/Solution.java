public class Solution {

    public static void main(String[] args) {

        int[] nums = {1,3,5,4,2,6};
        System.out.println(isTrionic(nums));
    }



    public static boolean isTrionic(int[] nums){
        int n = nums.length;

        int currentIndex = 0;

//        first increasing segment
        while ( currentIndex < n-2 && nums[currentIndex] < nums[currentIndex +1]){
            currentIndex++;
        }

//        no increasing segment found at the beginning
        if (currentIndex == 0) {
            return false;

        }

//        decreasing segment
//        save the peak position where the decrement starts
        int peakIndex = currentIndex;

        while(currentIndex < n-1 && nums[currentIndex] > nums[currentIndex +1]){
            currentIndex++;
        }

//        check if it is valid
        if ( currentIndex == peakIndex || currentIndex == n-1){
            return false;
        }

//        final increasing segment
        while (currentIndex < n-1 &&  nums[currentIndex] < nums[currentIndex+1]){
            currentIndex++;
        }

//        only valid if reached the end
        return currentIndex == n-1;
    }

}
