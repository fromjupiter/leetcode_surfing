package onehd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/10/7.
 */
public class SubsetsTwo_90Test {
    @Test
    public void subsetsWithDupTest() throws Exception {
        SubsetsTwo_90 test = new SubsetsTwo_90();
        assertEquals(1, test.subsetsWithDup(new int[]{}).size());
        assertEquals(6, test.subsetsWithDup(new int[]{1,2,2}).size());
    }

}