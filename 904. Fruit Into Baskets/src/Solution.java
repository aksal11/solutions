import java.util.HashMap;

public class Solution {

    public static void main() {

        int[] fruits = {1,2,3,2,2};
        System.out.println(totalFruit(fruits));

    }

    private static int totalFruit(int[] fruits){

//        expand right
//        add current element
//        while invalid
//        remove left element
//        move right
//        update ans

        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int ans = 0;

        for ( int right = 0 ; right < fruits.length; right++){

            map.put(fruits[right], map.getOrDefault(fruits[right],0)+1);

            while ( map.size() > 2){

                map.put(fruits[left], map.get(fruits[left])-1);

                if ( map.get(fruits[left]) == 0){
                    map.remove(fruits[left]);
                }
                left++;
            }

            ans = Math.max(ans, right - left +1);
        }
        return  ans;
    }
}
