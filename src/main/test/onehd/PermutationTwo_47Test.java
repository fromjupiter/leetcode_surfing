package onehd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/9/23.
 */
public class PermutationTwo_47Test {
    @Test
    public void permuteUnique() throws Exception {
        PermutationTwo_47 test = new PermutationTwo_47();
        assertEquals(3, test.permuteUnique(new int[]{1,1,2}).size());
    }

}