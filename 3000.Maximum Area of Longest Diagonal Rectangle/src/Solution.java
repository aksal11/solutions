public class Solution {

    public static void main(String[] args) {

        int[][] dimensions = {{3,4},{4,3}};
        System.out.println(areaOfMaxDiagonal(dimensions));

    }

    public static int areaOfMaxDiagonal(int[][] dimensions){
        double maxDiagonal = 0;
        int maxArea = 0 ;

        for ( int i = 0 ; i< dimensions.length; i++){
            int length = dimensions[i][0];
            int width = dimensions[i][1];

            double diagonal = Math.sqrt( length * length + width*width);
            int area = length * width;

            if ( diagonal > maxDiagonal){
                maxDiagonal = diagonal;
                maxArea = area;
            }else if( diagonal == maxDiagonal && area > maxArea){
                maxArea = area;
            }
        }
        return maxArea;
    }
}
