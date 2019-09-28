package onehd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/9/26.
 */
public class InsertIntervals_57Test {
    @Test
    public void insertTest() throws Exception {
        InsertIntervals_57 test = new InsertIntervals_57();
        int[][] arr;

        arr = new int[2][2];
        arr[0]=new int[]{2,6};
        arr[1]=new int[]{7,9};
        assertEquals(3, test.insert(arr,new int[]{15,18}).length);

        arr = new int[1][2];
        arr[0]=new int[]{1,5};
        assertEquals(1, test.insert(arr,new int[]{2,3}).length);
    }

}