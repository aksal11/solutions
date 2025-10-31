public class Solution {
    public static void main(String[] args) {

        long n = 1020030004;
        System.out.println(removeZeros(n));

    }

    public static long removeZeros( long n){

        StringBuilder sb = new StringBuilder();
        String str = Long.toString(n);
        for ( char c : str.toCharArray()){
            if ( c != '0'){
                sb.append(c);
            }
        }

        return Long.valueOf(sb.toString());
    }
}
