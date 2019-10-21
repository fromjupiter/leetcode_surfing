package twohd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/10/18.
 */
public class Candy_135Test {
    @Test
    public void candyTest() throws Exception {
        Candy_135 test = new Candy_135();
        assertEquals(2, test.candy(new int[]{2,2}));
        assertEquals(13, test.candy(new int[]{1,2,87,87,87,2,1}));
        assertEquals(5, test.candy(new int[]{1,0,2}));
        assertEquals(4, test.candy(new int[]{1,2,2}));
    }

}