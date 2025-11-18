public class Solution {

    public static void main(String[] args) {

        int[] bits = { 1,1,0};
        System.out.println(isOneBitCharacter(bits));

    }

    public static boolean isOneBitCharacter(int[] bits){

        int  i = bits.length - 2;
        int count  = 0 ;

        while ( i >= 0 && bits[i] == 1){
            count++;
            i--;
        }
        return count % 2 == 0;
    }
}
