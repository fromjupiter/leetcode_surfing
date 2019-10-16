package twohd;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Kexiang on 2019/10/14.
 */
public class LongestConsecutiveSeq_128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num:nums) set.add(num);
        int maxCount = 0;
        for(int num:set){
            if(!set.contains(num-1)) {
                int count=1;
                while(set.contains(num+count)) ++count;
                if(maxCount<count) maxCount=count;
            }
        }
        return maxCount;
    }

}
