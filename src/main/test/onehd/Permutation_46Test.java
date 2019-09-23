package onehd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/9/23.
 */
public class Permutation_46Test {
    @Test
    public void permuteTest() throws Exception {
        Permutation_46 test = new Permutation_46();
        assertEquals(6, test.permute(new int[]{1,2,3}).size());
    }

}