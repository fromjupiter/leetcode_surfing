package twohd;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Kexiang on 2019/10/19.
 */
public class WordBreak_139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> dict = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length()+1];
        dp[s.length()]=true;
        for(int i=s.length()-1;i>=0;--i){
            for(int j=i+1;j<=s.length();++j) {
                if(dp[j] && dict.contains(s.substring(i,j))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[0];
    }
}
