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
