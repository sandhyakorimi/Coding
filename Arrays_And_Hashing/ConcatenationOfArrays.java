// package Arrays_And_Hashing;

public class ConcatenationOfArrays {
    public int[] getConcatinatedArray(int nums[]){
        int n = nums.length;
        int ans[] = new int[2*n];
        for(int i=0;i<n;i++){
            ans[i]=ans[i+n]=nums[i];    
        }
        return ans; 
    }
}


// This method takes an integer array nums and returns a new array where the original array is concatenated with itself.

// First, I store the length of the input array in n. Then I create a new array ans of size 2 * n.

// Using a single loop, I copy each element of nums into two positions in ans:

// at index i

// and at index i + n

// This way, the array is duplicated efficiently in one loop. Finally, I return the concatenated array.

// Time & Space Complexity (important for interview):

// Time Complexity: O(n) – single loop

// Space Complexity: O(2n) → simplified to O(n)


// One-line explanation (if interviewer asks very briefly):

// It duplicates the array by placing each element at index i and i + n in a new array of size 2n.
