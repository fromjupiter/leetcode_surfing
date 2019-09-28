package onehd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/9/25.
 */
public class MergeIntervals_56Test {
    @Test
    public void mergeTest() throws Exception {
        MergeIntervals_56 test = new MergeIntervals_56();
        int[][] arr = new int[4][2];
        arr[0]=new int[]{1,3};arr[1]=new int[]{2,6};
        arr[2]=new int[]{8,10};arr[3]=new int[]{15,18};
        assertEquals(2, test.merge(arr).length);
    }

}