package onehd;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/9/27.
 */
public class SortColors_75Test {
    @Test
    public void sortColorsTest() throws Exception {
        SortColors_75 test = new SortColors_75();
        int[] tt;
        tt=new int[]{1,2,0};
        test.sortColors(tt);
        assertEquals("[0, 1, 2]", Arrays.toString(tt));
        tt=new int[]{2,0,1};
        test.sortColors(tt);
        assertEquals("[0, 1, 2]", Arrays.toString(tt));
        tt=new int[]{2,0,2,1,1,0};
        test.sortColors(tt);
        assertEquals("[0, 0, 1, 1, 2, 2]", Arrays.toString(tt));
    }

}