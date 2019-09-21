package onehd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/9/20.
 */
public class JumpGame_55Test {
    @Test
    public void canJumpTest() throws Exception {
        JumpGame_55 test = new JumpGame_55();
        assertEquals(false, test.canJump(new int[]{3,2,1,0,4}));
        assertEquals(true, test.canJump(new int[]{2,3,1,1,4}));
    }

}