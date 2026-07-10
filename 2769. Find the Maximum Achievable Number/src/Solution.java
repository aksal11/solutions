public class Solution {

    public static void main() {
        int num = 4, t = 1;
        System.out.println(theMaximumAchievableX(num,t));

    }

    private static int theMaximumAchievableX(int num, int t){

//        x =x -1
//        num = num + 1
        return num + 2 * t;
    }


}
