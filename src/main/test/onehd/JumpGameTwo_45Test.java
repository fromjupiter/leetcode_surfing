package onehd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/9/20.
 */
public class JumpGameTwo_45Test {
    @Test
    public void jumpTest() throws Exception {
        JumpGameTwo_45 test = new JumpGameTwo_45();
        assertEquals(1, test.jump(new int[]{2,3,1}));
        assertEquals(1, test.jump(new int[]{3,2,1}));
        assertEquals(1, test.jump(new int[]{2,1}));
        assertEquals(2, test.jump(new int[]{2,3,1,1,4}));
    }

}