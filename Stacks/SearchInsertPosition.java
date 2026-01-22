public class SearchInsertPosition {
    public int SearchInsertPositionNum(int[] nums, int target){
        int res=nums.length, l=0, r=nums.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                res=mid; 
                r=mid-1;
            }else{l=mid+1;} 
        }
        return res;  
    }
}

// “This code uses binary search to find the target in a sorted array. If the target is not found, it returns the index 
// where the target should be inserted. We update l and r based on comparisons, and res stores the correct insert position.
//  Time complexity is O(log n).”