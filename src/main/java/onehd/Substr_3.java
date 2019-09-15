package onehd;

import java.util.*;

public class Substr_3 {
    /*
        Very slow
     */
    public int lengthOfLongestSubstring_v0(String s) {
        int p1=0, p2=0;
        Set<Character> chars = new HashSet<>();
        List<Integer> candidates = new LinkedList<>();

        while(p2 < s.length()) {
            if(chars.contains(s.charAt(p2))) {
                candidates.add(p2-p1);
                //move p1
                while (s.charAt(p1) != s.charAt(p2)) {
                    chars.remove(s.charAt(p1));
                    ++p1;
                }
                ++p1;
            } else {
                chars.add(s.charAt(p2));
            }
            ++p2;
        }
        candidates.add(p2-p1);

        int max = 0;
        for(int i=0;i<candidates.size();++i){
            if(candidates.get(i) > max ) max = candidates.get(i);
        }
        return max;
    }

    public int lengthOfLongestSubstring(String s) {
        int p1=0, p2=0;
        Map<Character, Integer> chars = new HashMap<>();
        List<Integer> candidates = new LinkedList<>();

        int result = 0;

        while(p2 < s.length()) {
            if(chars.containsKey(s.charAt(p2))) {
                p1 = Math.max(p1, chars.get(s.charAt(p2)));
            }
            result = Math.max(result, p2-p1+1);
            chars.put(s.charAt(p2), p2+1);
            p2++;
        }
        return result;
    }
}
