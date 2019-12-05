package threehd;


public class ShortestPalindrome_214 {
    /**
     *
     * We first try to find the longest palindrome P which begins at 0.
     * If it exists, we only need to append (len(s)-len(P)) chars at the beginning.
     * Else it's len(s)
     */
    public String shortestPalindrome(String s) {
        if(s.length()<2) return s;

        char[] str = s.toCharArray();
        int end = 1;
        for(int i=str.length;i>0;--i){
            if(str[i-1]==str[0] && isPalindrome(str, 0, i)) {
                end = i;
                break;
            }
        }
        StringBuilder sb = new StringBuilder(s.substring(end)).reverse();
        sb.append(s);
        return sb.toString();
    }

    public boolean isPalindrome(char[] s, int start, int end) {
        for(int i=start,j=end-1;i<end;++i,--j) {
            if(s[i]!=s[j]) return false;
        }
        return true;
    }
}
