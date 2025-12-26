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
