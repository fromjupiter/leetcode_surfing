package onehd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/9/23.
 */
public class GroupAnagrams_49Test {
    @Test
    public void groupAnagramsTest() throws Exception {
        GroupAnagrams_49 test = new GroupAnagrams_49();
        assertEquals(3, test.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }

}