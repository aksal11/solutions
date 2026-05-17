import java.util.Arrays;

public class Solution {

    public static void main() {

        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
        System.out.println(Arrays.toString(sortPeople(names,heights)));

    }

    private static String[] sortPeople(String[] names, int[] heights){

        int n = names.length;

        Integer[] index = new Integer[n];

        for ( int i = 0 ; i < n; i++){
            index[i] = i;
        }

//        sort
        Arrays.sort(index, ( a, b) -> heights[b] - heights[a]);

        String[] ans = new String[n];

        for ( int i = 0 ; i < n; i++){
            ans[i] = names[index[i]];
        }
        return ans;
    }
}
