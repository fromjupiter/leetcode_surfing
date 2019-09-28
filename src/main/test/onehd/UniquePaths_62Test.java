package onehd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/9/26.
 */
public class UniquePaths_62Test {
    @Test
    public void uniquePaths() throws Exception {
        UniquePaths_62 test = new UniquePaths_62();
        assertEquals(3, test.uniquePaths(3,2));
    }

}