package onehd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/9/28.
 */
public class WordSearch_79Test {
    @Test
    public void existTest() throws Exception {
        WordSearch_79 test = new WordSearch_79();
        char[][] board;
        board = new char[][]{"ABCE".toCharArray(),"SFCS".toCharArray(),"ADEE".toCharArray()};

        assertEquals(false, test.exist(board,"ABCB"));
        assertEquals(true, test.exist(board,"SEE"));
        assertEquals(true, test.exist(board,"ABCCED"));
    }

}