package twohd;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/10/11.
 */
public class Triangle_120Test {
    @Test
    public void minimumTotalTest() throws Exception {
        Triangle_120 test = new Triangle_120();
        List<List<Integer>> ls = new ArrayList<>();
        ls.add(Arrays.asList(-10));
        assertEquals(-10, test.minimumTotal(ls));

        ls.clear();
        ls.add(Arrays.asList(2));
        ls.add(Arrays.asList(3,4));
        ls.add(Arrays.asList(6,5,7));
        ls.add(Arrays.asList(4,1,8,3));
        assertEquals(11, test.minimumTotal(ls));
    }

}