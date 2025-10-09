import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {

        int[] num= {2,2,3};
        System.out.println(singleNumber(num));

    }

    public static int singleNumber(int[] num){

        HashMap<Integer, Integer> map = new HashMap<>();
        for ( int n :num){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        for ( int key : map.keySet()){
            if ( map.get(key) == 1){
                return key;
            }
        }
        return -1;


//        XOR METHOD
//        int result = 0;
//        for ( int n: num){
//            result ^= n;
//        }
//        return result;
    }
}
