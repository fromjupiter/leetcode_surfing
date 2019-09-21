package onehd;

import org.junit.Test;

import static org.junit.Assert.*;


public class SearchRotatedSortedArray_33Test {
    @Test
    public void searchTest() throws Exception {
        SearchRotatedSortedArray_33 test = new SearchRotatedSortedArray_33();
        assertEquals(1, test.search(new int[]{3,5,1}, 5));
        assertEquals(-1, test.search(new int[]{1}, 0));
        assertEquals(-1, test.search(new int[]{}, 8));
        assertEquals(0, test.search(new int[]{8}, 8));
        assertEquals(4, test.search(new int[]{4,5,6,7,0,1,2}, 0));
        assertEquals(-1, test.search(new int[]{4,5,6,7,0,1,2}, 8));
    }

}