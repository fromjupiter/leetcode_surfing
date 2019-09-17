package onehd;

/**
 * Created by Kexiang on 2019/9/16.
 */
public class ContainMostWater_11 {
    /*
        give (x,height[x]) and (y,height[y]), the area can be calculated as:
            (y-x)*min(height[x],height[y])
        Brute force comes with O(n^2), but it iterates too many unnecessary options;

        First thought:
            If two lines form a max area, all lines on the left of the left line should be shorter than the left line,
            all lines on the right of the right line should be shorter than the right line,
            otherwise we can choose the longer line to get a larger area.
            Thus we use this to reduce our search space.

        After checking the solution:
            All right that makes sense..

     */
    public int maxArea_v0(int[] height) {
        if(height.length<2) return 0;
        int ans=0;
        boolean[] leftPossible = new boolean[height.length];
        boolean[] rightPossible = new boolean[height.length];
        int maxLeftHeightSoFar=0;
        int maxRightHeightSoFar=0;
        for(int i=0,j=height.length-1;i<height.length;++i,--j) {
            if (height[i]>maxLeftHeightSoFar) {
                maxLeftHeightSoFar = height[i];
                leftPossible[i] = true;
            } else {
                leftPossible[i] = false;
            }
            if (height[j]>maxRightHeightSoFar) {
                maxRightHeightSoFar = height[j];
                rightPossible[j] = true;
            } else {
                rightPossible[j] = false;
            }
        }
        for (int i=0;i<height.length;++i) {
            if(!leftPossible[i]) continue;
            for (int j=i+1;j<height.length;++j) {
                if(!rightPossible[j]) continue;
                int area = (j-i) * Math.min(height[i],height[j]);
                if(ans < area) ans = area;
            }
        }
        return ans;
    }

    public int maxArea(int[] height) {
        int ans = 0;
        int i=0, j=height.length-1;
        while (i!=j) {
            ans = Math.max(ans, (j-i) * Math.min(height[i],height[j]));
            if(height[i]<height[j]) ++i;
            else --j;
        }
        return ans;
    }
}
