package TwoPointers;

public class ValidPalindrome {
    public boolean palindromeOrNot(String s){
        int l =0, r = s.length();
        while(l<r){
            while(l<r && !alphaNumeric(s.charAt(l))){ l++; }
            while(r>l && !alphaNumeric(s.charAt(r))){ r--;}
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++; r--;
        }
        return true;
    }
        public boolean alphaNumeric(char c){
             return (c>='A' && c<='Z' || 
                c>='a' && c<='z' ||       
                c>='0' && c<='9');   
        }
}
