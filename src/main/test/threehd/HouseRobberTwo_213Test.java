package threehd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/10/21.
 */
public class HouseRobberTwo_213Test {
    @Test
    public void rob() throws Exception {
        HouseRobberTwo_213 test = new HouseRobberTwo_213();
        assertEquals(2, test.rob(new int[]{2,1}));
        assertEquals(3, test.rob(new int[]{2,3,2}));
        assertEquals(4, test.rob(new int[]{1,2,3,1}));
    }

}