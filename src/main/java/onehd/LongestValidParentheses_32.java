package onehd;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kexiang on 2019/9/19.
 */
public class LongestValidParentheses_32 {
    /**
     * The intuitive solution is to find all delimiters that split all valid substrings.
     * e.g. for string '())()(()', delimiters are [2,5].
     * For closing brace delimiter, we can easily find it by using a counter of remaining open brace.
     * But for the open brace delimiter, we won't know its position until we reach the end.
     * Obviously, it holds that an open delimiter cannot be followed by a close delimiter, or they will be paired.
     * Therefore, given a delimiter list [2,5,10], if 5 is an open delimiter, we know 10 is an open delimiter as well.
     * Knowing this, we can store the index of last close delimiter, use a stack to find all open delimiter,
     * then we can find the longest one.
     *
     * Leetcode Solution 4 explanation:
     * For the left-right scan, it only considers ")" as delimiter,
     * For the right-left scan, it only considers "(" as delimiter;
     * By doing this, it doesn't need a stack to store the open brace indexes.
     */
    public int longestValidParentheses(String s) {
        int ans = 0;
        int openRemain = 0;
        int lastCloseDelimiter = -1;
        List<Integer> openDelimiters = new ArrayList<>();
        for(int i=0;i<s.length();++i){
            if('('==s.charAt(i)){
                //we cannot handle extra opening brace until the end
                openDelimiters.add(i);
                ++openRemain;
            } else {
                //closing brace delimiter detected, it also means no current open brace delimiter
                if(0==openRemain) {
                    if(i-lastCloseDelimiter-1>ans) ans=i-lastCloseDelimiter-1;
                    lastCloseDelimiter = i;
                    continue;
                }
                --openRemain;
                //pop the paired open brace
                openDelimiters.remove(openDelimiters.size()-1);
            }
        }
        //add a dummy delimiter at the end
        openDelimiters.add(s.length());
        int cursor = lastCloseDelimiter;
        for(int i=0;i<openDelimiters.size();++i){
            if(openDelimiters.get(i)-cursor-1>ans) ans = openDelimiters.get(i) - cursor - 1;
            cursor = openDelimiters.get(i);
        }
        return ans;
    }
}
