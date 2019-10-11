package twohd;

import java.util.List;

/**
 * Created by Kexiang on 2019/10/11.
 */
public class Triangle_120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size()==0) return -1;
        if(triangle.size()==1) return triangle.get(0).get(0);
        int ans = Integer.MAX_VALUE;
        int[] mem = new int[triangle.size()];
        mem[0] = triangle.get(0).get(0);
        for(int i=1;i<triangle.size();++i){
            ans = Integer.MAX_VALUE;
            for(int j=i;j>=0;--j){
                mem[j] = triangle.get(i).get(j)
                        + Math.min(j<i?mem[j]:Integer.MAX_VALUE, j>0?mem[j-1]:Integer.MAX_VALUE);
                ans = Math.min(ans, mem[j]);
            }
        }
        return ans;
    }
}
