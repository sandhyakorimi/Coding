// package Arrays_And_Hashing/;
import java.util.Arrays;
public class ContainsDuplicates {
    public boolean ContainsDuplicates(int nums[]){
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                return true;    
            }   
        }
        return false;                
    }
}   

// Explanation:

// This method checks whether the array contains any duplicate elements.

// First, we sort the array using Arrays.sort(nums). After sorting, any duplicate values will be placed next to each other.

// Then we iterate through the array starting from index 1 and compare each element with the previous element.
// If two adjacent elements are equal, it means a duplicate exists, so we return true.

// If the loop finishes without finding duplicates, we return false.

// Time & Space Complexity:

// Time Complexity: O(n log n) (due to sorting)

// Space Complexity: O(1) or O(log n) (depends on Java’s sorting implementation)

// One-line interview answer:

// By sorting the array and checking adjacent elements, we can detect duplicates efficiently.