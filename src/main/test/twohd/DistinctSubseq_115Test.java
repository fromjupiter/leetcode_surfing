package twohd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/10/11.
 */
public class DistinctSubseq_115Test {
    @Test
    public void numDistinctTest() throws Exception {
        DistinctSubseq_115 test = new DistinctSubseq_115();
        assertEquals(1, test.numDistinct("",""));
        assertEquals(1, test.numDistinct("a",""));
        assertEquals(2, test.numDistinct("aa","a"));
        assertEquals(3, test.numDistinct("rabbbit","rabbit"));
    }

}