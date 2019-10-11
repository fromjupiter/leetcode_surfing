package twohd;

/**
 * Created by Kexiang on 2019/10/11.
 */
public class DistinctSubseq_115 {
    /**
     * f(i,j) is num of s[i:] and t[j:]
     * f(i,j) = f(i+1,j) + s[i]==t[j]?f(i+1,j+1):0;
     */
    public int numDistinct(String s, String t) {
        int[] dp = new int[t.length()+1];
        dp[t.length()] = 1;
        for(int i=s.length()-1;i>=0;--i){
            for(int j=0;j<t.length();++j){
                dp[j] += s.charAt(i)==t.charAt(j)?dp[j+1]:0;
            }
        }
        return dp[0];
    }
}
