package threehd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/10/21.
 */
public class CourseSchedule201Test {
    @Test
    public void canFinish() throws Exception {
        CourseSchedule_201 test = new CourseSchedule_201();
        assertEquals(true, test.canFinish(3, new int[][]{new int[]{0,1},new int[]{0,2},new int[]{1,2}}));
        assertEquals(true, test.canFinish(2, new int[][]{new int[]{1,0}}));
        assertEquals(false, test.canFinish(2, new int[][]{new int[]{1,0},new int[]{0,1}}));
    }

}