package onehd;


import java.util.Stack;

public class MaxRectangle_85 {
    /**
     * If we have a heights[m][n] matrix, each cell of which stores the height
     * we can calculate every row's max largest rect histogram using 84 algorithm,
     * then we get the max rectangle.
     *
     * But it turns out that it's slower than brute force solution :(
     */
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length==0||matrix[0].length==0) return 0;
        int ans = 0;
        int[] heights = new int[matrix[0].length];
        for(int i=0;i<matrix.length;++i){
            for(int j=0;j<matrix[0].length;++j){
                if(matrix[i][j]=='0') heights[j]=0;
                else heights[j]++;
            }
            ans = Math.max(ans, getMaxArea(heights));
        }
        return ans;
    }

    // Copied
    public int getMaxArea(int[] heights){
        int ans = 0;
        int[] start = new int[heights.length];
        int[] end = new int[heights.length];
        for(int i=0;i<heights.length;++i){
            end[i] = heights.length;
            start[i] = -1;
        }
        Stack<Integer> stack = new Stack<>();
        //find all start
        for(int i=0;i<heights.length;++i){
            //remove all indices that are higher than current
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]) stack.pop();
            start[i] = stack.isEmpty()? -1 : stack.peek();
            stack.push(i);
        }
        //find all end
        stack = new Stack<>();
        for(int i=heights.length-1;i>=0;--i){
            //remove all indices that are higher than current
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]) stack.pop();
            end[i] = stack.isEmpty()? heights.length : stack.peek();
            stack.push(i);
        }

        for(int i=0;i<heights.length;++i){
            ans = Math.max(ans, (end[i]-start[i]-1)*heights[i]);
        }
        return ans;
    }
}
