public class SortColors {
    public void sortColors(int[] nums){
        int zero=0, one=0;
        for(int two=0; two<nums.length; two++){
            int temp=nums[two];
            nums[two]=2;
            if(temp<1){
                nums[one++]=1;
            }
            if(temp<0){
                nums[zero++]=0;
            }
        }
    }
}
// I go through the array once and first assume every number is 2. If I see 1 or 0,
//  I place them in the correct position using two pointers. This works in O(n) time and O(1) extra space.