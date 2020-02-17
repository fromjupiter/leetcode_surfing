package fivehd;

public class MinGeneMutation_433 {
    int[] memo;
    int DEFAULT = Integer.MAX_VALUE - 1;
    //dfs
    public int minMutation(String start, String end, String[] bank) {
        memo = new int[bank.length];
        int min = Integer.MAX_VALUE-1;
        for(int i=0;i<bank.length;++i) {
            if(mutable(start, bank[i])) {
                boolean[] visited = new boolean[bank.length];
                visited[i] = true;
                min = Math.min(min, 1+dfs(i, end, bank, visited));
                visited[i] = false;
            }
        }
        if(min==DEFAULT) return -1;
        else return min;
    }

    private int dfs(int curr, String end, String[] bank, boolean[] visited) {
        if(memo[curr] != 0) return memo[curr];
        if(bank[curr].equals(end)) return 0;

        int min = Integer.MAX_VALUE-1;
        for(int i=0;i<bank.length;++i) {
            if(!visited[i] && mutable(bank[curr], bank[i])) {
                visited[i] = true;
                min = Math.min(min,1+dfs(i, end, bank, visited));
                visited[i] = false;
            }
        }
        return min;
    }

    private boolean mutable(String from, String to) {
        if(from.length()!=to.length()) return false;
        int count = 0;
        for(int i=0;i<from.length();++i) {
            if(from.charAt(i)!=to.charAt(i)) count++;
        }
        return count==1;
    }
}
