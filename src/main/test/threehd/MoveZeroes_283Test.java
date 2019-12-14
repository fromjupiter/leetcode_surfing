package threehd;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/12/6.
 */
public class MoveZeroes_283Test {
    @Test
    public void moveZeroes() throws Exception {
        MoveZeroes_283 test = new MoveZeroes_283();
        int[] arr = new int[]{0,1,0,3,12};
        test.moveZeroes(arr);
        assertTrue(Arrays.equals(new int[]{1,3,12,0,0}, arr));
    }

}