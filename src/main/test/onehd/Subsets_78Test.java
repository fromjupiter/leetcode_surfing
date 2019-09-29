package onehd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/9/28.
 */
public class Subsets_78Test {
    @Test
    public void subsets() throws Exception {
        Subsets_78 test = new Subsets_78();
        assertEquals(8, test.subsets(new int[]{1,2,3}).size());
    }

}