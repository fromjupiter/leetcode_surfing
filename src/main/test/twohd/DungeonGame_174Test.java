package twohd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/10/19.
 */
public class DungeonGame_174Test {
    @Test
    public void calculateMinimumHP() throws Exception {
        DungeonGame_174 test = new DungeonGame_174();

        int[][] dungeon;
        dungeon = new int[][]{new int[]{0,-3}};
        assertEquals(4, test.calculateMinimumHP(dungeon));

        dungeon = new int[][]{new int[]{-2,-3,3},new int[]{-5,-10,1},new int[]{10,30,-5}};
        assertEquals(7, test.calculateMinimumHP(dungeon));
    }

}