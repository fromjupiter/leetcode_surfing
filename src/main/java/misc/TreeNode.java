package misc;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Kexiang on 2019/10/9.
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x) { val = x; }

    public static List<Integer> inorderTraversal(TreeNode root) {
        if(root==null) return new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode curr = stack.pop();
            if(null!=curr.right) {
                stack.push(curr.right);
            }
            if(null==curr.right && null==curr.left) {
                ans.add(curr.val);
            } else {
                stack.push(new TreeNode(curr.val));
            }
            if(null!=curr.left) {
                stack.push(curr.left);
            }
        }
        return ans;
    }
  }
