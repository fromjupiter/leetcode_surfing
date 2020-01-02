package fourhd;


import java.util.ArrayList;
import java.util.List;

public class LexicoNumbers_386 {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>(n);

        for(int i=1;i<10;++i) {
            dfs(res, i, n);
        }
        return res;
    }

    private void dfs(List<Integer> ans, int curr, int max) {
        if(curr>max) {
            return;
        }
        ans.add(curr);
        for(int i=0;i<10;++i) {
            dfs(ans, curr*10+i, max);
        }
    }
}
