package fourhd;


import java.util.TreeSet;

public class MaxSumOfRectangle_363 {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        if(matrix.length==0||matrix[0].length==0) return 0;
        int ROWS=matrix.length, COLS=matrix[0].length;
        int max = Integer.MIN_VALUE;

        //construct a rectangle by first setting left bound and right bound
        for(int l=0;l<COLS;++l) {
            int[] sum = new int[ROWS];
            for(int r=l;r<COLS;++r) {
                for(int i=0;i<ROWS;++i) sum[i] += matrix[i][r];
                TreeSet<Integer> set = new TreeSet<>();
                set.add(0);
                int currSum = 0;
                for(int i=0;i<ROWS;++i) {
                    currSum+=sum[i];
                    //find a num that satisfies currSum-num <= k
                    //i.e. num >= currSum-k
                    Integer num = set.ceiling(currSum-k);
                    if(num != null) max = Math.max(max, currSum-num);
                    set.add(currSum);
                }
            }
        }
        return max;
    }
}
