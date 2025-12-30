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
