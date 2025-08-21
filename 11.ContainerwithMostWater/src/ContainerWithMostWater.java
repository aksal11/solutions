public class ContainerWithMostWater {
    public static void main(String[] args) {

        int[] height= {1,8,6,2,5,4,8,3,7};
        System.out.println(mostWater(height));

    }


    public static int mostWater(int[] height){

        int left = 0;
        int right = height.length -1 ;
        int result = 0 ;

        while ( left < right){
//            area = l x b;
            int area = Math.min(height[left], height[right])*(right-left);
            result = Math.max(result, area);

            if ( height[left] <= height[right]) {
                left++;
            }else{
                right--;
            }
        }
        return result;
    }
}
