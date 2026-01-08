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
