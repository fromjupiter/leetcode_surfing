package twohd;

/**
 * Created by Kexiang on 2019/10/18.
 */
public class PalindromePartitionTwo_132 {
    int[] dp;
    public int minCut(String s) {
        dp = new int[s.length()+1];
        dp[s.length()] = -1;
        dp[s.length()-1] = 0;
        char[] chars = s.toCharArray();
        for(int i=s.length()-2;i>=0;--i){
            dp[i]=Integer.MAX_VALUE;
            for(int j=i+1;j<=s.length();++j) {
                if(dp[i]<=1+dp[j]) continue;
                if(isPalindrome(chars, i, j)){
                    dp[i] = 1+dp[j];
                }
            }
        }
        return dp[0];
    }

    public boolean isPalindrome(char[] s, int start, int end) {
        for(int i=start,j=end-1;i<end;++i,--j) {
            if(s[i]!=s[j]) return false;
        }
        return true;
    }
}
