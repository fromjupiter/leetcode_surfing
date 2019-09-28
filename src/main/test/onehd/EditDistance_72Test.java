package onehd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/9/27.
 */
public class EditDistance_72Test {
    @Test
    public void minDistance() throws Exception {
        EditDistance_72 test = new EditDistance_72();
        assertEquals(2, test.minDistance("sea","eat"));
        assertEquals(0, test.minDistance("",""));
        assertEquals(3, test.minDistance("horse","ros"));
    }

}