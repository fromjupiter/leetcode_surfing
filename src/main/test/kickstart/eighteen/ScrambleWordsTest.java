package kickstart.eighteen;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/9/28.
 */
public class ScrambleWordsTest {
    @Test
    public void solveTest() throws Exception {
        ScrambleWords test = new ScrambleWords();
        String[] dic;
        String seq;
        dic = new String[] {""};
        seq = "abc";
        assertEquals(1, test.solve(dic, seq));

        dic = new String[] {"aa","a","ba"};
        seq = test.genStr('b','a',4,0,0,0,1);
        assertEquals(3, test.solve(dic, seq));

        dic = new String[]{"axpaj","apxaj","dnrbt","pjxdn","abd"};
        seq = test.genStr('a','a',50,1,1,1,30);
        assertEquals("aapxjdnrbtvldptfzbbdbbzxtndrvjblnzjfpvhdhhpxjdnrbt",seq);
        assertEquals(4, test.solve(dic, seq));
    }
}