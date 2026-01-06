package TwoPointers;

public class ReverseString {
    public void Revstr(char[] s){
        int i=0, r=s.length-1;
        while(i<r){
            char temp = s[i];
            s[i] = s[r];
            s[r] = temp;
            i++;
            r--;
        }   
    }
}
