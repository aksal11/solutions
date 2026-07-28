public class Solution {

    public static void main(String[] args) {

        int num = 22;
        System.out.println(maxProduct(num));

    }


    private static int maxProduct(int n){

        int largest = 0, secondLargest = 0;

        while ( n != 0){

            int digit = n %10;

            if (  digit >= largest){
                secondLargest = largest;
                largest = digit;
            }else if ( digit > secondLargest) {
                secondLargest = digit;

            }
            n /= 10;
        }
        return largest * secondLargest;
    }
}
