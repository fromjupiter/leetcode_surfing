package fivehd;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class NextGreaterElement_503Test {
    NextGreaterElement_503 test = new NextGreaterElement_503();
    @Test
    public void nextGreaterElements() {

        assertTrue(Arrays.equals(new int[]{2,-1,2}, test.nextGreaterElements(new int[]{1,2,1})));
    }
}