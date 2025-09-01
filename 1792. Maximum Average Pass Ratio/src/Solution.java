import java.util.PriorityQueue;

public class Solution {


    public static void main(String[] args) {

        int[][] classes = {{1,2},{3,5},{2,2}};
        int extraStudents = 2;
        System.out.printf("%.5f\n",maxAverageRatio(classes,extraStudents));



    }

    public static double maxAverageRatio(int[][] classes, int extraStudents) {

        PriorityQueue<double[]> maxHeap = new PriorityQueue<>((a, b) -> Double.compare(b[0],a[0]));

        // to get the averages and push the possible inc to maxHeap
        for (int i = 0 ; i < classes.length; i++){
            double currAvg = (double) classes[i][0] / classes[i][1];
            double newAvg = (double) (classes[i][0] +1) / (classes[i][1]+1);
            double possibleIncrement = newAvg - currAvg;
            maxHeap.offer(new double[]{possibleIncrement,i});
        }

        // extra students calculation and taking the top of the heap which the best

        while ( extraStudents-- >0){
            double[] top = maxHeap.poll();
            int idx = (int) top[1];
            classes[idx][0]++;
            classes[idx][1]++;

            double currAvg = (double) classes[idx][0] / classes[idx][1];
            double newAvg = (double) (classes[idx][0] +1)/ (classes[idx][1]+1);
            double possibleIncrement = newAvg - currAvg;
            maxHeap.offer(new double[]{possibleIncrement, idx});

        }
        double finalAvg = 0.0;
        for ( int[] clss: classes){
            finalAvg += (double) clss[0] / clss[1];
        }

        // average
        return finalAvg/ classes.length;


    }
}
