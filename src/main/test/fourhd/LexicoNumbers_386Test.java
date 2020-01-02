package fourhd;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;


public class LexicoNumbers_386Test {
    LexicoNumbers_386 test = new LexicoNumbers_386();

    @Test
    public void lexicalOrder() throws Exception {
        assertEquals(Arrays.asList(1), test.lexicalOrder(1));

        List<Integer> res = Arrays.asList(1,10,11,12,13,2,3,4,5,6,7,8,9);
        assertEquals(res, test.lexicalOrder(13));

    }

}