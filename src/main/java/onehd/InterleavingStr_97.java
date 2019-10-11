package onehd;

/**
 * Created by Kexiang on 2019/10/11.
 */
public class InterleavingStr_97 {
    /**
     * naive recursion would cause TLE so we consider DP,
     * f(a,b) means "Do s1[a:] and s2[b:] interleaves s3[a+b:]?
     * f(a,b) = (s1[a]==s3[a+b] && f(a+1,b) || s2[b]==s3[a+b] && f(a,b+1))
     */
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s3.length()!=s1.length()+s2.length()) return false;
        if(s1.length()==0) return s2.equals(s3);

        boolean[] dp = new boolean[s1.length()+1];
        dp[s1.length()]=true;
        for(int j=s1.length()-1;j>=0;--j) dp[j] = s1.charAt(j)==s3.charAt(s2.length()+j) && dp[j+1];
        for(int i=s2.length()-1;i>=0;--i){
            dp[s1.length()] = s2.charAt(i)==s3.charAt(s1.length()+i) && dp[s1.length()];
            for(int j=s1.length()-1;j>=0;--j){
                dp[j] = (s2.charAt(i)==s3.charAt(i+j) && dp[j])
                        || (s1.charAt(j)==s3.charAt(i+j) && dp[j+1]);
            }
        }
        return dp[0];
    }

    public boolean isInterleave_recursive(String s1, String s2, String s3) {
        if(s1.length()==0) return s2.equals(s3);
        else if(s2.length()==0) return s1.equals(s3);

        boolean res = false;
        if(s1.charAt(0)==s3.charAt(0)) res = res || isInterleave_recursive(s1.substring(1), s2, s3.substring(1));
        if(s2.charAt(0)==s3.charAt(0)) res = res || isInterleave_recursive(s1,s2.substring(1),s3.substring(1));
        return res;
    }
}
