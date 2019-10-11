package twohd;

import misc.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/10/11.
 */
public class CstrTreeInOrdPostOrd_106Test {
    @Test
    public void buildTreeTest() throws Exception {
        CstrTreeInOrdPostOrd_106 test = new CstrTreeInOrdPostOrd_106();
        int[] inorder;
        int[] postorder;

        inorder = new int[]{1,2,3,4,5};
        postorder = new int[]{2,1,5,4,3};
        assertEquals("[1, 2, 3, 4, 5]", TreeNode.inorderTraversal(test.buildTree(inorder,postorder)).toString());

        inorder = new int[]{2,1};
        postorder = new int[]{2,1};
        assertEquals("[2, 1]", TreeNode.inorderTraversal(test.buildTree(inorder,postorder)).toString());

        inorder = new int[]{9,3,15,20,7};
        postorder = new int[]{9,15,7,20,3};
        assertEquals("[9, 3, 15, 20, 7]", TreeNode.inorderTraversal(test.buildTree(inorder,postorder)).toString());
    }

}