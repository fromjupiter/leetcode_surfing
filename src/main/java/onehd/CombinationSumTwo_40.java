package onehd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Kexiang on 2019/9/21.
 */
public class CombinationSumTwo_40 {
    /**
     * basic dfs solution
     */
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }
    void dfs(int[] candidates, int target, int start, List<Integer> path, List<List<Integer>> ans) {
        if(target==0){
            ans.add(new ArrayList<>(path));
        }

        for(int i=start;i<candidates.length;++i){
            if(candidates[i]>target) break;
            if(i>start && candidates[i]==candidates[i-1]) continue;

            path.add(candidates[i]);
            dfs(candidates, target-candidates[i], i+1, path, ans);
            path.remove(path.size()-1);
        }
    }
}
