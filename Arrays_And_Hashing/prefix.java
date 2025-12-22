public class prefix {
    public String largestcommonPrefix(String strs[]){
        for(int i=0; i<strs[0].length(); i++){
            for(String s:strs){
                if(s.length()==i || s.charAt(i)!=strs[0].charAt(i)){
                    return s.substring(0,i);
                }
            }
        }
        return strs[0];
    }
}
// In this problem, I compare all the strings column by column by taking the first string as the reference.
// At each index, I check whether the character is common across all strings.
// If a mismatch occurs or any string ends, I return the prefix up to the previous index.
// If no mismatch occurs, I return the reference string as the longest common prefix.