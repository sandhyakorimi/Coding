import java.util.HashSet;
import java.util.Set;
public class LongestConsecutiveSequence {
    public int LongestSequenceLength(int[] nums){
        Set<Integer> numset = new HashSet<>();
        for(int num:nums){
            numset.add(num);
        }
        int longest = 0;
        for(int num: numset){
            if(!numset.contains(num-1)){
                int length =1;
                while(numset.contains(num+length)){
                    length++;
                }
                longest = Math.max(longest,length);
            }
        }
        return longest;
    }
}
// “First, I store all the numbers in a HashSet to remove duplicates and allow fast lookup. Then, I iterate 
// through each number. If a number does not have its previous value, I treat it as the start of a sequence.
//  Using a while loop, I check for the next consecutive numbers until the sequence breaks. Finally, I return
//   the length of the longest sequence.”