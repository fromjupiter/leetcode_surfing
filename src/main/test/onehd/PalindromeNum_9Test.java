package onehd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/9/15.
 */
public class PalindromeNum_9Test {
    @Test
    public void isPalindromeTest() throws Exception {
        PalindromeNum_9 test = new PalindromeNum_9();
        assertEquals(true, test.isPalindrome(121));
        assertEquals(false, test.isPalindrome(-121));
    }

}