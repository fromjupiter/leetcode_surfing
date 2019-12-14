package threehd;

import misc.TreeNode;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.stream.Collectors;

/**
 * Created by Kexiang on 2019/12/6.
 */
public class SerializeBinaryTree_297 {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<String> arr = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if(node!=null) {
                arr.add(Integer.toString(node.val));
                queue.add(node.left);
                queue.add(node.right);
            } else {
                arr.add("null");
            }
        }
        //pop all ending nulls
        while(!arr.isEmpty() && arr.get(arr.size()-1).equals("null")) arr.remove(arr.size()-1);

        return arr.isEmpty() ? "[]" : String.format("[%s]", String.join(",", arr));
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals("[]")) return null;
        List<Integer> arr = Arrays.stream(data.substring(1, data.length()-1).split(","))
                .map(x-> x.equals("null")? null : Integer.parseInt(x))
                .collect(Collectors.toList());
        if(arr.isEmpty()) return null;

        TreeNode root = new TreeNode(arr.get(0));

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode curr;
        for(int i=1;i<arr.size();i+=2){
            curr = queue.poll();
            if(arr.get(i)!=null) {
                curr.left = new TreeNode(arr.get(i));
                queue.offer(curr.left);
            }
            if(i<arr.size()-1 && arr.get(i+1)!=null) {
                curr.right = new TreeNode(arr.get(i+1));
                queue.offer(curr.right);
            }
        }
        return root;
    }
}
