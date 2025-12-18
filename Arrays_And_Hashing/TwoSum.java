package Arrays_And_Hashing;

import java.util.HashMap;

public class TwoSum {
    public int[] TwoSumTarget(int nums[], int target){
        HashMap<Integer, Integer> prevMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            int diff = target-num;
            if(prevMap.containsKey(diff)){
                return new int[]{prevMap.get(diff),i}
            }
            prevMap.put(num,i);
        }
        return new int[]{};
    }
}

// Brief interview explanation (LeetCode style):

// I use a HashMap to store each number and its index while iterating through the array.
// For every element, I calculate the required complement (target - nums[i]).
// If the complement already exists in the map, I return both indices.
// Otherwise, I store the current number and its index in the map and continue.

// Time Complexity: O(n)
// Space Complexity: O(n)