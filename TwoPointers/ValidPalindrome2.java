package TwoPointers;

public class ValidPalindrome2 {
    public boolean ValidPalindrome(String s){
        int l=0, r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return (isPalindrome(s,l+1,r) || isPalindrome(s,l,r-1));
            }
            l++;r--;
        }
        return true;
    }
    private boolean isPalindrome(String s, int l, int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }else{
                l++; r--;
            }
        }
        return true;
    }
}
// This algorithm checks whether the string can be a palindrome after deleting at most one character.
// It uses the two-pointer technique to compare characters from both ends.
// On the first mismatch, it tries skipping either the left or right character and checks if the remaining substring is a palindrome.
// This approach runs in O(n) time and O(1) space, making it efficient for large strings.