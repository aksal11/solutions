public class Solution {

    public static void main(String[] args) {

        int n = 43261596;
        System.out.println(reverseBits(n));

    }

    public static int reverseBits(int n){

        StringBuilder sb = new StringBuilder();

        for ( int i = 0 ; i < 32;i++){
            if ( (n &  (1<<i)) != 0){
                sb.append("1");
            }else{
                sb.append("0");
            }
        }

        String rev = sb.reverse().toString();
        int res = 0;

        for (int i = 0 ; i< 32; i++){
            if ( rev.charAt(i) == '1'){
                res = res | ( 1 << i);
            }
        }
        return res;
    }
}
