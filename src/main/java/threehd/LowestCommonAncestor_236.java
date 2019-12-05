package threehd;

import misc.TreeNode;


/**
 * Created by Kexiang on 2019/12/3.
 */
public class LowestCommonAncestor_236 {
    private TreeNode ans;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        count(root, p, q);
        return ans;
    }
    //post order traverse
    private int count(TreeNode root, TreeNode t1, TreeNode t2) {
        if(root == null) return 0;
        int left = count(root.left, t1, t2);
        if(left == 2) return 2;
        int right = count(root.right, t1, t2);
        if(right == 2) return 2;
        if(left+right==2) {
            ans = root;
            return 2;
        }
        if(root.val==t1.val || root.val==t2.val) {
            if(left+right==1) {
                ans = root;
            }
            return left+right+1;
        } else return left+right;
    }
}
