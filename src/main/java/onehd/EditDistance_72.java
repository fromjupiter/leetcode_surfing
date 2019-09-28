package onehd;

/**
 * Created by Kexiang on 2019/9/26.
 */
public class EditDistance_72 {
    /**
     * dis(w1[a:],w2[b:]) = 1+dis(w1[a+1:]+w2[b+1:] if(w1[a]==w2[b])
     *  = 1+min(dis(w1[a+1:],w2[b+1:]),dis(w1[a+1:],w2[b:]),dis(w1[a:],w2[b+1:])), if(w1[a]!=w2[b])
     */
    public int minDistance(String word1, String word2) {
        if(word2.length()==0) return word1.length();
        else if(word1.length()==0) return word2.length();
        //let's try one dimension non-recursive dp
        int[] dp = new int[word2.length()+1];
        //init
        for(int i=word2.length();i>=0;--i){
            dp[i] = word2.length()-i;
        }
        //real stuff
        int temp;
        for(int i=word1.length()-1;i>=0;--i){
            //prev stores the diagonal cell
            int prev = word1.length()-i-1;
            dp[word2.length()] = word1.length()-i;
            for(int j=word2.length()-1;j>=0;--j){
                temp = dp[j];
                if(word1.charAt(i)==word2.charAt(j)){
                    dp[j] = prev;
                } else {
                    dp[j] = 1+Math.min(dp[j],Math.min(prev,dp[j+1]));
                }
                prev = temp;
            }
        }
        return dp[0];
    }
}
