public class Solution {

    public static void main(String[] args) {
        String word = "xycdefghij";

        System.out.println(minimumPushes(word));
    }


    private static  int minimumPushes(String word){


        int n = word.length();

        int cost = 0;

        for (int i = 0; i < n; i++) {
            cost += (i / 8) + 1;
        }

        return cost;


    }
}
