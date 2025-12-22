import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;
public class GroupAnagrams {
    public List<List<String>> resultGroups(String[] strs){
        Map<String, List<String>> res = new HashMap<>();
        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String mystr = new String(chars);
            res.putIfAbsent(mystr, new ArrayList<>());
            res.get(mystr).add(s);
    }
    return new ArrayList<>(res.values());
}
}
