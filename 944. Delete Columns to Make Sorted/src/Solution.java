public class Solution {

    public static void main(String[] args) {
        String[] strs = {"cba","daf","ghi"};
        System.out.println(minDeletionSize(strs));

    }

    public static int minDeletionSize(String[] strs){
        int ans = 0;

        for ( int i = 0 ; i< strs[0].length();i++){
            for ( int j =1; j < strs.length;j++){
                if ( strs[j-1].charAt(i) > strs[j].charAt(i) ){
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
}
