package fivehd;

public class LongestRepeatCharReplace_424 {
    // Sliding window:
    //
    public int characterReplacement(String s, int k) {
        int max = 0;
        int maxCount = 0;
        int start = 0, end = 0;
        int[] count = new int[26];
        while(end < s.length()) {
            count[s.charAt(end)-'A'] ++;
            int charCount = count[s.charAt(end)-'A'];
            maxCount = Math.max(maxCount, charCount);
            while(end-start+1-k > maxCount) {
                count[s.charAt(start)-'A']--;
                start++;
            }
            max = Math.max(max, end-start+1);
            ++end;
        }
        return max;
    }
}
