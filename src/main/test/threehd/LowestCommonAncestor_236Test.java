package threehd;

import misc.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/12/3.
 */
public class LowestCommonAncestor_236Test {
    @Test
    public void testLowest() throws Exception {
        LowestCommonAncestor_236 test = new LowestCommonAncestor_236();

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5); root.right = new TreeNode(1);
        root.left.left = new TreeNode(6); root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0); root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7); root.left.right.right = new TreeNode(4);

        TreeNode p,q;
        p = root.left; q = root.right;
        assertEquals(3, test.lowestCommonAncestor(root, p, q).val);
        p = root.left; q = root.left.right.right;
        assertEquals(5, test.lowestCommonAncestor(root, p, q).val);
    }
}