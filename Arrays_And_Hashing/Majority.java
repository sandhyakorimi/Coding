import java.util.Arrays;

public class Majority{
    public int majority(int[] nums){
        Arrays.sort(nums); 
        return nums[nums.length/2];          
    }       
}  