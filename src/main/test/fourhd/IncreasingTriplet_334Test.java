package fourhd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/12/26.
 */
public class IncreasingTriplet_334Test {
    IncreasingTriplet_334 test = new IncreasingTriplet_334();

    @Test
    public void increasingTriplet() throws Exception {
        assertTrue(test.increasingTriplet(new int[]{4,5,1,3,5}));
        assertFalse(test.increasingTriplet(new int[]{4,5,1,3}));

        assertTrue(test.increasingTriplet(new int[]{4,5,1,6}));
        assertFalse(test.increasingTriplet(new int[]{4,5,1}));

        assertTrue(test.increasingTriplet(new int[]{1,2,3,4,5}));
        assertFalse(test.increasingTriplet(new int[]{5,4,3,2,1}));
    }

}