package Arrays_And_Hashing;
import java.util.Arrays;
public class ContainsDuplicates {
    public boolean ContainsDuplicates(int nums[]){
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i++]){
                return true;    
            }   
        }
        return false;               
    }
}
