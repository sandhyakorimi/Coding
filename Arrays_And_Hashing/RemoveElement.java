public class RemoveElement {
    public int RemoveElements(int[] nums, int val){
        int k=0;
        for(int i=0;i<nums.length; i++){
            if(nums[i]!=val){
                nums[k++]=nums[i];
            } 
        }
        return k;  
    }
}
// “This method removes a given value in-place using two pointers.
// I iterate through the array and copy only the elements not equal to the given value to the front.
// I return k, which represents the number of valid elements.
// Time complexity is O(n) and space complexity is O(1).    