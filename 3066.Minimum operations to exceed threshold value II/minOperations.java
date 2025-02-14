package solutions;

import java.util.PriorityQueue;

public class minOperations {
	
	public static void main(String[] args) {
		int[] nums = {1,1,2,4,9};
		int k = 20;
		System.out.println(minimumOperations(nums, k));
		
	}
	
	public static int minimumOperations(int[] nums, int k ) {
		
		
//		priority queue
		PriorityQueue<Long> minHeap = new PriorityQueue<Long>();
		
		for ( int num : nums) {
			minHeap.offer((long)num);
		}
		
		int operations = 0;
		while ( !minHeap.isEmpty() && minHeap.peek() < k) {
			if ( minHeap.size() < 2) {
				break; //no elements stop
			}
			long x = minHeap.poll();
			long y = minHeap.poll();
			long newElement = Math.min(x, y) * 2 + Math.max(x, y);
			minHeap.offer(newElement);
			operations++;
		}
		return operations;
	}

}
