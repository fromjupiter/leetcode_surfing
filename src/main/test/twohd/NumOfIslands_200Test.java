package twohd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/10/21.
 */
public class NumOfIslands_200Test {
    @Test
    public void numIslands() throws Exception {
        NumOfIslands_200 test = new NumOfIslands_200();
        char[][] grid;
        grid = new char[][]{"11000".toCharArray(),"11000".toCharArray(),"00100".toCharArray(),
                        "00011".toCharArray()};
        assertEquals(3, test.numIslands(grid));
    }

}