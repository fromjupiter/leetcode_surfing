package onehd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/9/21.
 */
public class CombinationSum_39Test {
    @Test
    public void combinationSum() throws Exception {
        CombinationSum_39 test = new CombinationSum_39();
        assertEquals(3, test.combinationSum(new int[]{8,7,4,3},11).size());
        assertEquals(2, test.combinationSum(new int[]{2,3,6,7},7).size());
        assertEquals(3, test.combinationSum(new int[]{2,3,5},8).size());
    }
}