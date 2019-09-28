package onehd;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Kexiang on 2019/9/27.
 */
public class MinWindowSubstr_76 {
    public String minWindow(String s, String t) {
        Map<Character, Integer> target = new HashMap<>();
        for(Character ch : t.toCharArray()){
            target.put(ch, target.getOrDefault(ch, 0)+1);
        }
        int required = target.keySet().size();
        //save temp solution
        int lp=0, rp=0;
        String ans = null;
        Map<Character, Integer> map = new HashMap<>();
        int formed = 0;
        while(rp<s.length()){
            Character ch = s.charAt(rp);
            if(target.containsKey(ch)){
                map.put(ch, map.getOrDefault(ch,0)+1);
                if(map.get(ch).equals(target.get(ch))){
                    formed++;
                }
            }
            ++rp;
            if(formed==required){
                while(formed==required){
                    Character cc = s.charAt(lp++);
                    if(!target.containsKey(cc)) continue;
                    if(target.get(cc).equals(map.get(cc))) formed--;
                    map.put(cc, map.get(cc)-1);
                }
                String temp = s.substring(lp-1, rp);
                if(ans==null) ans = temp;
                else ans = ans.length() > temp.length() ? temp : ans;
            }
        }
        return ans==null?"":ans;
    }

}
