package TwoPointers;
public class RotateArray {
    public void Rotate_an_Array(int nums[], int k){
        int n=nums.length;
        k%=n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    public void reverse(int nums[], int l, int r){
        int temp = nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
        l++;
        r--;
    }

}
// “We can rotate the array in O(n) time and O(1) space using the reverse method.
// First normalize k using k %= n.         
// Then reverse the whole array, reverse the first k elements, and reverse the remaining n–k elements.
// This rearranges the array into the rotated order without using extra space.”
 