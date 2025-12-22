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

// For each word, I convert it to a character array and sort it.

// The sorted string acts as a key because all anagrams produce the same sorted form.

// I store all original words with the same key in a list in the map.

// Finally, I return all the grouped values from the map.