package solutions;

import java.util.HashMap;

public class TupleSameProduct {
    
    public static void main(String[] args) {
        int[] nums = {2,3,4,6};
        System.out.println(tuplesameProduct(nums));
    }
    
    public static int tuplesameProduct(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int product = nums[i] * nums[j];
                map.put(product, map.getOrDefault(product, 0) + 1);
            }
        }
        
        int result = 0;
        for (int count : map.values()) {
            if (count >= 2) {
                result += count * (count - 1) * 4; 
            }
        }
        return result;
    }
}
