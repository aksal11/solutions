import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

        int turnedOn = 1;
        System.out.println(readBinaryWatch(turnedOn));


    }

    public static List<String> readBinaryWatch(int turnedOn){

        List<String> result = new ArrayList<>();

//        iterate through hours
        for ( int i = 0 ; i < 12; i++){
//            iterate through minutes
            for ( int j = 0; j < 60; j++){

//                count the total setbits
                int setBits = Integer.bitCount(i) + Integer.bitCount(j);

                if ( setBits == turnedOn){
                    String time = String.format("%d:%02d", i, j);
                    result.add(time);
                }
            }
        }
        return result;
    }

}
