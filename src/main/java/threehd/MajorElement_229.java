package threehd;

import java.util.ArrayList;
import java.util.List;

/**
 * Using the online post solution.
 * https://en.wikipedia.org/wiki/Boyer%E2%80%93Moore_majority_vote_algorithm
 */
public class MajorElement_229 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int a1 = Integer.MIN_VALUE, a2 = Integer.MAX_VALUE, n1 = 0, n2 = 0;

        for (int i : nums){
            if(i==a1) {
                ++n1;
            } else if(i==a2) {
                ++n2;
            } else if(n1==0) {
                a1 = i; ++n1;
            } else if(n2==0) {
                a2 = i; ++n2;
            } else {
                --n1; --n2;
            }
        }
        n1 = 0;
        n2 = 0;
        for(int i : nums){
            if(i==a1) n1++;
            else if(i==a2) n2++;
        }
        if(n1>nums.length/3) res.add(a1);
        if(n2>nums.length/3) res.add(a2);
        return res;
    }
}
