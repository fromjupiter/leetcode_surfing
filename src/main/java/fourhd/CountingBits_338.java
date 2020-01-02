package fourhd;

/**
 * Created by Kexiang on 2019/12/27.
 */
public class CountingBits_338 {
    public int[] countBits(int num) {
        if(num==0) return new int[]{0};
        else if(num==1) return new int[]{0, 1};

        int[] res = new int[num+1];
        res[0] = 0;
        res[1] = 1;
        int first = 1;
        for(int i=2;i<=num;++i) {
            if(i == first*2) {
                first = i;
            }
            res[i] = 1 + res[i-first];
        }
        return res;
    }
}
