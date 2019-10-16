package twohd;

import org.junit.Test;

import java.util.AbstractCollection;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/10/15.
 */
public class PalindromePartition_131Test {
    @Test
    public void partition() throws Exception {
        PalindromePartition_131 test = new PalindromePartition_131();
        assertEquals(2, test.partition("bb").size());
        assertEquals(2, test.partition("aab").size());
    }

}