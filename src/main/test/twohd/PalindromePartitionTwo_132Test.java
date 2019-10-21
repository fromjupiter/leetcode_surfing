package twohd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/10/18.
 */
public class PalindromePartitionTwo_132Test {
    @Test
    public void minCutTest() throws Exception {
        PalindromePartitionTwo_132 test = new PalindromePartitionTwo_132();
        assertEquals(1, test.minCut("aab"));
    }

}