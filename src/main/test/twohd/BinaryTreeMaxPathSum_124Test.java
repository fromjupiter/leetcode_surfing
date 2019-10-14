package twohd;

import misc.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/10/11.
 */
public class BinaryTreeMaxPathSum_124Test {
    @Test
    public void maxPathSumTest() throws Exception {
        BinaryTreeMaxPathSum_124 test = new BinaryTreeMaxPathSum_124();
        assertEquals(16, test.maxPathSum(TreeNode.make(new Integer[]{9,6,-3,null,null,-6,2,null,null,2,null,-6,-6,-6})));
        assertEquals(6, test.maxPathSum(TreeNode.make(new Integer[]{1,2,3})));
    }

}