public class Solution {

    public static void main(String[] args) {

        int n = 7;
        System.out.print(canWinNim(n));

    }

    public static boolean canWinNim(int n){

//          if n = 1,2,3 player 1 wins
//          if n = 4 player 2 wins
//          if n = 5,6,7 player 1 wins
        return n% 4 != 0;
    }
}
