import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
public class MajorityElement2 {
    public List<Integer> MajorityElement(int[] nums){
        Set<Integer> arr = new HashSet<>();
        for(int i : nums){
            int count =1;
            for(int n : nums){
                if(i==n) count++;
            }
            if(count>nums.length/3) arr.add(i);
        }
        return new ArrayList<>(arr); 
    }

}
// “I iterate through the array and count how many times each number appears. If a number’s count is greater 
// than n/3, I add it to a HashSet to avoid duplicates. Finally, I convert the set into a list and return it.”