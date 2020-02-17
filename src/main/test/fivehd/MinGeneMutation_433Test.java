package fivehd;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinGeneMutation_433Test {
    MinGeneMutation_433 test = new MinGeneMutation_433();

    @Test
    public void minMutation() throws Exception {
        assertEquals(-1, test.minMutation("AACCGGTT","AAACGGTA", new String[]{}));
        assertEquals(2, test.minMutation("AACCGGTT","AAACGGTA", new String[]{"AACCGGTA", "AACCGCTA", "AAACGGTA"}));
        assertEquals(3, test.minMutation("AAAAACCC","AACCCCCC", new String[]{"AAAACCCC", "AAACCCCC", "AACCCCCC"}));
    }

}