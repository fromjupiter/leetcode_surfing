package threehd;

import misc.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/12/6.
 */
public class SerializeBinaryTree_297Test {

    SerializeBinaryTree_297 test = new SerializeBinaryTree_297();

    @Test
    public void testSerialize() throws Exception {
        TreeNode tree;
        tree = null;
        assertEquals("[]", test.serialize(tree));
        tree = TreeNode.make(new Integer[]{1,2,3,null,null,4,5});
        assertEquals("[1,2,3,null,null,4,5]", test.serialize(tree));
    }

    @Test
    public void testDeserialize() throws Exception {
        TreeNode tree = test.deserialize("[1,2,3,null,null,4,5]");
        assertEquals("[1,2,3,null,null,4,5]", test.serialize(tree));
        tree = test.deserialize("[]");
        assertNull(tree);
    }

}