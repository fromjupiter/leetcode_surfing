package onehd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/9/28.
 */
public class MaxRectangle_85Test {
    @Test
    public void maximalRectangle() throws Exception {
        MaxRectangle_85 test = new MaxRectangle_85();
        char[][] arr;
        arr = new char[][]{"10100".toCharArray(),"10111".toCharArray(),"11111".toCharArray(),"10010".toCharArray()};
        assertEquals(6, test.maximalRectangle(arr));
    }

}