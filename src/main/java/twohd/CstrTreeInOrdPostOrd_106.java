package twohd;

import misc.TreeNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by Kexiang on 2019/10/11.
 */
public class CstrTreeInOrdPostOrd_106 {
    Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length==0) return null;
        for(int i=0;i<inorder.length;++i)
            map.put(inorder[i], i);
        return buildTree(inorder, postorder, 0, inorder.length, 0, postorder.length);
    }

    public TreeNode buildTree(int[] inorder, int[] postorder, int is, int ie, int ps, int pe) {
        //leaf node
        if(is==ie) return null;
        else if(is==ie-1) return new TreeNode(inorder[is]);

        TreeNode root = new TreeNode(postorder[pe-1]);
        int iPivot, pPivot;
        iPivot = map.get(postorder[pe-1]);
        pPivot = iPivot - is + ps;

        root.left = buildTree(inorder,postorder,is,iPivot,ps,pPivot);
        root.right = buildTree(inorder,postorder,iPivot+1,ie,pPivot,pe-1);

        return root;
    }
}
