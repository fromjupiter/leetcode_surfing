package fourhd;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/12/27.
 */
public class TopKFrequent_347Test {
    TopKFrequent_347 test = new TopKFrequent_347();

    @Test
    public void topKFrequent() throws Exception {
        assertEquals("[-1, 2]", test.topKFrequent(new int[]{4,1,-1,2,-1,2,3},2).toString());
        assertEquals("[1, 2]", test.topKFrequent(new int[]{1,1,1,2,2,3},2).toString());
        assertEquals("[1]", test.topKFrequent(new int[]{1},1).toString());
    }

}