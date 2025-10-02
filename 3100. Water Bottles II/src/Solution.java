public class Solution {

    public static void main(String[] args) {

        int nb = 13;
        int ne = 6;

        System.out.println(maxBottlesDrunk(nb,ne));

    }

    public static int maxBottlesDrunk ( int numBottles, int numExchange){
        int full = numBottles;
        int empty = numBottles;

        while ( empty >= numExchange){
            empty -= numExchange;
            numExchange++;
            full++;
            empty++;

        }
        return full;
    }
}
