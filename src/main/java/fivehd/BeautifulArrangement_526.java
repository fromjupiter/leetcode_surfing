package fivehd;

/**
 * Created by Kexiang on 2019/9/20.
 */
public class BeautifulArrangement_526 {
    public int countArrangement(int N) {
        int[] count = new int[]{0};
        dfs(count, 1, N, new boolean[N+1]);
        return count[0];
    }

    void dfs(int[] count, int pos, int N, boolean[] visited) {
        if(pos>N){
            ++count[0];
        }
        for(int i=1;i<=N;++i){
            if(!visited[i] && (pos%i==0||i%pos==0)) {
                visited[i]=true;
                dfs(count, pos+1, N, visited);
                visited[i]=false;
            }
        }
    }

}
