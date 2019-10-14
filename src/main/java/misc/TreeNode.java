package misc;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

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

    public static TreeNode make(Integer[] array){
        if(array.length==0) return null;

        TreeNode root = new TreeNode(array[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        TreeNode curr;
        for(int i=1;i<array.length;i+=2) {
            curr = queue.poll();
            if(array[i]!=null) {
                curr.left = new TreeNode(array[i]);
                queue.offer(curr.left);
            }
            if(i<array.length-1 && array[i+1]!=null) {
                curr.right = new TreeNode(array[i+1]);
                queue.offer(curr.right);
            }
        }
        return root;
    }
}
