package fourhd;


public class LongestStringKRepeat_395 {
    /**
     * The idea is, we start with the whole string, and shrink it
     */
    public int longestSubstring(String s, int k) {
        return find(s, k, 0, s.length());
    }

    private int find(String s, int k, int start, int end) {
        if(end-start < k) return 0;

        int[] count = new int[26];
        for(int i=start;i<end;++i) {
            count[s.charAt(i)-'a'] += 1;
        }
        int left = start;
        int res = -1;
        for(int i=start;i<end;++i) {
            if(count[s.charAt(i)-'a']>0 && count[s.charAt(i)-'a']<k) {
                res = Math.max(res, find(s, k, left, i));
                left = i+1;
            }
        }
        if(res==-1) return end - start;
        return Math.max(res, find(s, k, left, end));
    }
}
