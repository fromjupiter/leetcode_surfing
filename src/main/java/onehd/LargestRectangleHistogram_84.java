package onehd;

import java.util.Stack;

/**
 * Created by Kexiang on 2019/9/28.
 */
public class LargestRectangleHistogram_84 {
    public int largestRectangleArea(int[] heights) {
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

     /**
     * brute force
     */
    public int largestRectangleArea_v0(int[] heights) {
        int ans = 0;
        for(int i=0;i<heights.length;++i){
            int start=i, end=i;
            while (start>=0 && heights[start] >= heights[i]) --start;
            while (end<heights.length && heights[end] >= heights[i]) ++end;
            ans = Math.max(ans, (end-start-1)*heights[i]);
        }
        return ans;
    }
}
