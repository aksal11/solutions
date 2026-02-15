public class Solution {

    static void main(String[] args) {

        String a = "1010";
        String b = "1011";
        System.out.println(addBinary(a,b));

    }

    public static String addBinary(String a, String b){

        StringBuilder sb = new StringBuilder();

        int aLast = a.length()-1;
        int bLast = b.length()-1;
        int carry = 0;

        while ( aLast >= 0 || bLast >=0 || carry > 0 ){

            int digitA = (aLast >= 0) ? a.charAt(aLast) - '0' : 0;

            int digitB = (bLast >= 0) ? b.charAt(bLast) - '0' : 0;

            int sum = digitA + digitB + carry;

            sb.append(sum % 2);

            carry = sum/2;

            aLast--;
            bLast--;
        }

        return sb.reverse().toString();
    }

}
