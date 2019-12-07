package threehd;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/12/4.
 */
public class SlidingWindowMax_239Test {
    @Test
    public void maxSlidingWindow() throws Exception {
        SlidingWindowMax_239 test = new SlidingWindowMax_239();
        assertTrue(Arrays.equals(new int[]{3,3,5,5,6,7},test.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3)));
    }

}