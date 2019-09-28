package onehd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/9/28.
 */
public class Combinations_77Test {
    @Test
    public void combineTest() throws Exception {
        Combinations_77 test = new Combinations_77();
        assertEquals(6, test.combine(4,2).size());
        assertEquals(0, test.combine(3,5).size());
    }

}