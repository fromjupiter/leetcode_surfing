package threehd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/12/3.
 */
public class KthLargest_215Test {
    @Test
    public void testFindKthLargest() throws Exception {
        KthLargest_215 test = new KthLargest_215();
        assertEquals(4, test.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4));
        assertEquals(1, test.findKthLargest(new int[]{2,1}, 2));
        assertEquals(5, test.findKthLargest(new int[]{3,2,1,5,6,4}, 2));
    }
}