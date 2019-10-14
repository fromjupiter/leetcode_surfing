package twohd;

import misc.TreeNode;


public class BinaryTreeMaxPathSum_124 {
    public int maxPathSum(TreeNode root) {
        int[] ans = new int[1];
        ans[0]=Integer.MIN_VALUE;
        postOrderVisit(ans, root);

        return ans[0];
    }

    public int postOrderVisit(int[] ans, TreeNode root) {
        if(root==null) return 0;
        int left = postOrderVisit(ans, root.left);
        int right = postOrderVisit(ans, root.right);

        if(left>0 && right>0)
            ans[0] = Math.max(ans[0], left+root.val+right);
        else if(left>0)
            ans[0] = Math.max(ans[0], left+root.val);
        else if(right>0)
            ans[0] = Math.max(ans[0], right+root.val);
        else
            ans[0] = Math.max(ans[0], root.val);

        return root.val + Math.max(0, Math.max(left, right));
    }
}
