package twohd;

import java.util.*;

/**
 * Created by Kexiang on 2019/10/19.
 */
public class LargestNum_179 {
    public String largestNumber(int[] nums) {
        StringBuilder sb = new StringBuilder();
        List<String> strings = new ArrayList<>();
        for(int i=0;i<nums.length;++i) strings.add(Integer.toString(nums[i]));
        dostuff(strings, 0, sb);
        String res = sb.toString();
        if(res.charAt(0)=='0') return "0";
        else return res;
    }

    public void dostuff(List<String> nums, int depth, StringBuilder sb) {
        if(nums.size()==0) return;
        else if(nums.size()==1) {
            sb.append(nums.get(0));
            return;
        }
        List<List<String>> buckets = new ArrayList<>(10);
        for(int i=0;i<10;++i) buckets.add(new ArrayList<>());
        int maxLen = 0;
        for (int i = 0; i < nums.size(); ++i) {
            maxLen = Math.max(maxLen, nums.get(i).length());
            buckets.get(nums.get(i).charAt(depth>nums.get(i).length()-1?0:depth)-'0')
                    .add(nums.get(i));
        }
        if(maxLen<depth){
            nums.sort((a,b)->(b+a).compareTo(a+b));
            for(int i=0;i<nums.size();++i) sb.append(nums.get(i));
            return;
        }
        for(int i=buckets.size()-1;i>=0;--i) {
            if(i==8){
                int a = 0;
            }
            dostuff(buckets.get(i), depth+1, sb);
        }
    }
}
