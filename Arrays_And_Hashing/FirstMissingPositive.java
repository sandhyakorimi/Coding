public class FirstMissingPositive {
    public int FirstMissingPositiveNumber(int nums[]){
        int n= nums.length;
        int i=0;
        while (i<n) {
            if(nums[i]<0 || nums[i]>n){
                i++;
                continue;
            }
            int index = nums[i]-1;
            if(nums[i]!=nums[index]){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index]=temp;
            }else i++;
        }
        for(i=0; i<n; i++){
            if(nums[i] != i+1){
                return i+1;
            }
        }
        return n+1;
    }
}
// “In this problem, we find the first missing positive number using cyclic sort. We try to place each positive
//  number x at its correct position x - 1. If a number is negative, greater than the array length, or already 
//  in the correct position, we skip it. Otherwise, we swap it to its correct index. After rearranging, we scan
//   the array again. If at any index i the value is not i + 1, then i + 1 is the missing positive number. If all
//    positions are correct, the answer is n + 1. This solution works in O(n) time and O(1) extra space.”