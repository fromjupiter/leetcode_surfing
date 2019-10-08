package kickstart.nighteen;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Flatting {
    public static void main(String[] args){
        Flatting dip = new Flatting();
        Scanner input = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int T = input.nextInt();

        for(int i=1;i<=T;i++){
            input.nextLine();
            int N = input.nextInt();
            int K = input.nextInt();
            input.nextLine();
            int[] heights = new int[N];
            for(int j=0;j<N;++j){
                heights[j] = input.nextInt();
            }
            int res = dip.solve(heights, K);
            System.out.println(String.format("Case #%d: %d", i, res));
        }
    }

    /**
     * R(a,b) = the most frequent height between a and b
     * F(x,k) = min(F(i,k-1), R(i+1,x))
     */
    int[][] dp;
    public int solve(int[] heights, int K){
        dp = new int[heights.length][K+1];
        int[][] R = new int[heights.length][heights.length];
        for(int i=0;i<heights.length;++i){
            Map<Integer, Integer> counter = new HashMap<>();
            counter.put(heights[i], 1);
            R[i][i] = 0;
            for(int j=i+1;j<heights.length;++j){
                counter.put(heights[j], counter.getOrDefault(heights[j],0)+1);
                R[i][j] = j-i+1- Collections.max(counter.values());
            }
        }
        for(int i=0;i<=K;++i)
            dp[0][i] = 0;
        for(int i=0;i<heights.length;++i)
            dp[i][0] = R[0][i];
        for (int j=1;j<=K;++j) {
            for(int i=1;i<heights.length;++i) {
                if(i==4 && j == 2) {
                    int a= 0;
                }
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = 0; k < i; ++k) {
                    dp[i][j] = Math.min(dp[i][j], dp[k][j-1]+R[k+1][i]);
                }
            }
        }
        return dp[heights.length-1][K];
    }
}
