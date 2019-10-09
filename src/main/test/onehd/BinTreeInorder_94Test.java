package onehd;

import misc.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/10/9.
 */
public class BinTreeInorder_94Test {
    @Test
    public void inorderTraversalTest() throws Exception {
        BinTreeInorder_94 test = new BinTreeInorder_94();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        assertEquals("[1, 3, 2]", test.inorderTraversal(root).toString());
    }

}