package threehd;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/10/21.
 */
public class CourseScheduleTwo_202Test {
    @Test
    public void findOrderTest() throws Exception {
        CourseScheduleTwo_202 test = new CourseScheduleTwo_202();
        assertEquals("[]",Arrays.toString(test.findOrder(4,new int[][]{new int[]{1,0},new int[]{0,1}})));
        assertEquals("[0, 1, 2, 3]", Arrays.toString(test.findOrder(4,new int[][]{new int[]{1,0},new int[]{2,0}
                        ,new int[]{3,1},new int[]{3,2}})));
    }

}