package threehd;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/12/6.
 */
public class SingleNumThree_260Test {
    @Test
    public void singleNumber() throws Exception {
        SingleNumThree_260 test = new SingleNumThree_260();
        assertEquals(8, Arrays.stream(test.singleNumber(new int[]{1,1,2,3,4,4,3,6})).sum());
    }

}