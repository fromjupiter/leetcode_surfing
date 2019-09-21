package onehd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/9/21.
 */
public class FindFirstAndLast_34Test {
    @Test
    public void searchRangeTest() throws Exception {
        FindFirstAndLast_34 test = new FindFirstAndLast_34();
        assertEquals(-1, test.searchRange(new int[]{2,2},3)[0]);
        assertEquals(3, test.searchRange(new int[]{5,7,7,8,8,10},8)[0]);
    }

}