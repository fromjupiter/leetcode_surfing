package onehd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/9/25.
 */
public class NQueens_51Test {
    @Test
    public void solveNQueensTest() throws Exception {
        NQueens_51 test = new NQueens_51();
        assertEquals(2, test.solveNQueens(4));
    }

}