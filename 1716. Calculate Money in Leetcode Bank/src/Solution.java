public class Solution {

    public static void main(String[] args) {

        int n  = 20;
        System.out.print(totalMoney(n));

    }

    public static int totalMoney(int n ){


        int sum = 0;

        int fullDays = n /7;
        int remainingDays = n % 7;

        for ( int i  = 0 ; i < fullDays; i++){
            int start =  1 + i;

            for ( int j  = 0 ; j < 7 ; j++){
                sum += start + j;
            }
        }

//        remaining days
        int start = 1 + fullDays;
        for ( int  days  = 0 ; days < remainingDays; days++){
            sum += start + days;
        }

        return sum;
    }
}
