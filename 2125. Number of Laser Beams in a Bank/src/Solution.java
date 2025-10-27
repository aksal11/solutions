public class Solution {

    public static void main(String[] args) {
        String[] bank = {"011001","000000","010100","001000"};
        System.out.println(numberOfBeams(bank));

    }


    public static int numberOfBeams(String[] bank){

        int prev = 0;
        int res = 0;

        for ( String row : bank){
            int curr = 0;
            for ( char c : row.toCharArray()){
                if ( c == '1') curr++;
            }

            if (curr > 0){
                res  += (prev * curr);
                prev = curr;
            }
        }
        return res;



    }
}
