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
