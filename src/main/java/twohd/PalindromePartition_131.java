package twohd;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Kexiang on 2019/10/15.
 */
public class PalindromePartition_131 {
    public List<List<String>> partition(String s) {
        if(s.length()==0) return new LinkedList<>();
        char[] chars = s.toCharArray();
        return partition(chars, 0);
    }

    public List<List<String>> partition(char[] chars, int start) {
        List<List<String>> result = new ArrayList<>();
        if(start==chars.length) {
            result.add(new ArrayList<>());
            return result;
        }
        for(int i=start+1;i<=chars.length;++i) {
            if(isPalindrome(chars, start, i)) {
                List<List<String>> parts = partition(chars, i);
                for(List<String> part: parts) {
                    part.add(0, getStr(chars, start, i));
                    result.add(part);
                }
            }
        }
        return result;
    }

    public String getStr(char[] s, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for(int i=start;i<end;++i) sb.append(s[i]);
        return sb.toString();
    }

    public boolean isPalindrome(char[] s, int start, int end) {
        for(int i=start,j=end-1;i<end;++i,--j) {
            if(s[i]!=s[j]) return false;
        }
        return true;
    }
}
