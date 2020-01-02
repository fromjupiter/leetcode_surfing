package fourhd;


public class KthSmallestInSortedMatrix_378 {
    public int kthSmallest(int[][] matrix, int k) {
        if(matrix.length==0 || matrix[0].length==0) return -1;
        int n = matrix.length;

        int low = matrix[0][0];
        int high = matrix[n-1][n-1];
        int mid;
        while(low<high) {
            mid = (low+high)/2;
            int count = 0;
            for(int i=0;i<n;++i) {
                count += smallerOrEqual(matrix[i], mid);
            }
            //
            if(count<k) {
                low = mid+1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    private int smallerOrEqual(int[] array, int target) {
        if(array[0] > target) {
            return 0;
        }
        int start = 0, end = array.length-1;
        int mid;
        while(start<end) {
            mid = start + (end-start+1)/2;
            if(array[mid]<=target) {
                start = mid;
            } else {
                end = mid-1;
            }
        }
        return start+1;
    }
}
