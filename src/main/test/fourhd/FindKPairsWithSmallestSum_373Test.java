package fourhd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/12/27.
 */
public class FindKPairsWithSmallestSum_373Test {
    FindKPairsWithSmallestSum_373 test = new FindKPairsWithSmallestSum_373();

    @Test
    public void kSmallestPairs() throws Exception {
        int[] num1, num2;

        num1=new int[]{1,7,11};
        num2=new int[]{2,4,6};
        assertEquals("[[1, 2], [1, 4], [1, 6]]", test.kSmallestPairs(num1,num2,3).toString());
    }

}