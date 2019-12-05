package threehd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/12/3.
 */
public class MaxSquare_221Test {
    @Test
    public void testMaximalSquare() throws Exception {
        MaxSquare_221 test = new MaxSquare_221();
        char[][] arr;
        arr = new char[][]{
                "10100".toCharArray(),
                "10111".toCharArray(),
                "11111".toCharArray(),
                "10010".toCharArray()};

        assertEquals(4, test.maximalSquare(arr));
    }

}