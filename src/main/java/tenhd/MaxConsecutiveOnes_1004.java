package tenhd;

/**
 * Created by Kexiang on 2019/9/20.
 */
public class MaxConsecutiveOnes_1004 {
    public int longestOnes(int[] A, int K) {
        int maxAns=0;

        int j=0;
        int window = K;
        for(int i=0;i<A.length;++i){
            if(A[i]==0) {
                if(window>0){
                    window--;
                } else {
                    maxAns = Math.max(maxAns, i-j);
                    //move j to the first 0 to make room for the window
                    while (j<i && A[j]!=0) ++j;
                    ++j;
                }
            } else {
                //do nothing
            }
        }
        maxAns = Math.max(maxAns, A.length-j);

        //calculate last possible answer
        return maxAns;
    }
}
