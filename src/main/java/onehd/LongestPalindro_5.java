package onehd;

/**
 * Created by Kexiang on 2019/9/15.
 * It's even faster than the standard solution!!! (4ms vs 6ms)
 */
public class LongestPalindro_5 {
    public boolean isPalindrome(char[] s, int start, int end) {
        for(int i=start,j=end-1;i<end;++i,--j) {
            if(s[i]!=s[j]) return false;
        }
        return true;
    }

    /**
     * Scan the string from left to right,
     * Each time we try to find the longest palindrome substring ending at the scan point(LPSE),
     * and we record its start index.
     * Every time we try to find a new LPSE, we only need to search in the previous LPSE and its previous character.
     * By finding all the LPSEs, we can find the LPS.
     */
    public String longestPalindrome(String s) {
        if(0 == s.length() || 1 == s.length()) return s;

        //use char array to speed up
        char[] str = s.toCharArray();

        //find a recurrence equation
        int ansStart=0, ansEnd=0;
        int tempStart=0;
        for (int i=0;i<s.length();++i) {

            if(tempStart>0 && str[i] == str[tempStart-1]) {
                //best case is we can append two chars to the temp-stored palindrome
                tempStart = tempStart - 1;
            } else {
                //else we find a new tempStart
                while(tempStart < i) {
                    if(str[tempStart]==str[i]){
                        if(isPalindrome(str,tempStart,i+1)) break;
                    }
                    ++tempStart;
                }
            }

            //update answer if find a longer palindrome
            if(i-tempStart+1 > ansEnd - ansStart) {
                ansStart = tempStart;
                ansEnd = i+1;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int x=ansStart;x<ansEnd;++x) {
            sb.append(str[x]);
        }
        return sb.toString();
    }

}
