package onehd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Kexiang on 2019/9/23.
 */
public class GroupAnagrams_49 {
    /**
     * brute force
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> ansMap = new HashMap<>();
        for(String str: strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if(ansMap.containsKey(key)) ansMap.get(key).add(str);
            else {
                List<String> temp = new ArrayList<>();
                temp.add(str);
                ansMap.put(key, temp);
            }
        }
        return ansMap.values().stream().collect(Collectors.toList());
    }
}
