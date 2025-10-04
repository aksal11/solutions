public class Solution {

    public static void main(String[] args) {
        int[] height = { 1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));

    }


    public static int maxArea(int[] height){
        int left = 0 ;
        int right = height.length-1;

        int result = 0 ;

        while ( left < right){
            int minH = Math.min(height[left], height[right]);
            int w = right - left;
            int area = minH * w;
            result = Math.max(result, area);

//            if smaller move inward
            if ( height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return result;
    }
}
