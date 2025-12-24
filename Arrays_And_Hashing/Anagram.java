// package Arrays_And_Hashing;
import java.util.Arrays;
public class Anagram {
    public boolean AnagramOrNot(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        char[] sSort = s.toCharArray(); 
        char[] tSort = t.toCharArray();
        Arrays.sort(sSort);
        Arrays.sort(tSort);
        return Arrays.equals(sSort, tSort);  
    }
}


// Brief interview explanation (LeetCode style):

// First, I check if both strings have the same length. If not, they can’t be anagrams.
// Then I convert both strings into character arrays, sort them, and compare the sorted arrays.
// If they are equal, the strings are anagrams.

// Time Complexity: O(n log n)
// Space Complexity: O(n)