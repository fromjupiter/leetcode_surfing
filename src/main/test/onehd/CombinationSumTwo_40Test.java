package onehd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/9/21.
 */
public class CombinationSumTwo_40Test {
    @Test
    public void combinationSum2() throws Exception {
        CombinationSumTwo_40 test = new CombinationSumTwo_40();
        assertEquals(4, test.combinationSum2(new int[]{10,1,2,7,6,1,5}, 8).size());
        assertEquals(2, test.combinationSum2(new int[]{2,5,2,1,2}, 5).size());
    }

}