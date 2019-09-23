package onehd;

/**
 * Created by Kexiang on 2019/9/23.
 */
public class WildCard_44 {
    private Boolean[][] dp;

    public boolean isMatch_v0(String s, String p) {
        //if(p.length()==0) return s.length()==0;
        //if(s.length()==0) return p.length()==1 && p.charAt(0)=='*';
        char[] sc = s.toCharArray();
        char[] pc = p.toCharArray();
        dp = new Boolean[s.length()+1][p.length()+1];
        return isMatch_v0(sc,pc,0,0);
    }
    /**
     * Recursive DP, which gives 5%-34%
     */
    private boolean isMatch_v0(char[] s, char[] p, int sInd, int pInd) {
        if(p.length==pInd) return s.length==sInd;
        if(s.length==sInd) return p[pInd]=='*' && isMatch_v0(s, p, sInd, pInd+1);
        if(dp[sInd][pInd]!=null)
            return dp[sInd][pInd];
        if(p[pInd]=='?') {
            dp[sInd][pInd] = isMatch_v0(s,p,sInd+1, pInd+1);
        } else if(p[pInd]=='*'){
            dp[sInd][pInd] = false;
            for(int i=s.length;i>=sInd;--i){
                if(isMatch_v0(s,p,i,pInd+1)){
                    dp[sInd][pInd] = true;
                    break;
                }
            }
        } else {
            dp[sInd][pInd] = p[pInd] == s[sInd] && isMatch_v0(s, p, sInd + 1, pInd + 1);
        }
        return dp[sInd][pInd];
    }

    /**
     * Non-recursive DP, which gives 19%-39%
     */
    private boolean isMatch(char[] s, char[] p, int sInd, int pInd) {
        for(int i=0;i<=s.length;++i)
            dp[i][p.length] = s.length==i;
        for(int i=p.length-1;i>=0;--i)
            dp[s.length][i] = p[i]=='*' && dp[s.length][i+1];

        for(int j=p.length-1;j>=0;--j){
            boolean flag = dp[s.length][j+1];
            for(int i=s.length-1;i>=0;--i){
                flag = flag || dp[i][j+1];
                if(p[j]=='?') dp[i][j] = dp[i+1][j+1];
                else if(p[j]!='*') dp[i][j] = s[i]==p[j] && dp[i+1][j+1];
                else {
                    dp[i][j] = flag;
                }
            }
        }
        return dp[sInd][pInd];
    }

    /**
     * Two-pointer solution inspired by online post, the idea is that:
     * We always try to let '*' match less chars, if it fails we roll back to try more chars.
     */
    public boolean isMatch(String s, String p) {
        if(s.length()==0 && p.length()==0) return true;
        int i=0, j=0;
        int star = -1;
        int match = 0;
        while(i<s.length()){
            if(j<p.length() && (p.charAt(j)=='?' || p.charAt(j)==s.charAt(i))) {
                ++i;++j;
            } else if(j<p.length() && p.charAt(j)=='*') {
                star = j;
                //match equals i means that this star matches no chars
                match = i;
                j++;
            } else if(star!=-1) {
                //roll back to star
                j = star+1;
                //let the star match one more char
                match++;
                i = match;
            } else return false;
        }
        while(j < p.length() && p.charAt(j) == '*') ++j;
        return j==p.length();
    }
}
