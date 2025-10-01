public class Solution {

    public static void main(String[] args) {

        int numBottles = 15;
        int numExchange = 4;
        System.out.println(numWaterBottles(numBottles,numExchange));

    }

    public static int  numWaterBottles(int numBottles, int numExchange){

        int total = numBottles;
        int empty = numBottles;

        while (empty >= numExchange){
            int newFull = empty / numExchange;
            total += newFull;
            empty = empty % numExchange + newFull;
        }
        return total;
    }
}
