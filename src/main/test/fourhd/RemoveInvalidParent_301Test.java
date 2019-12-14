package fourhd;

import org.junit.Test;

import static org.junit.Assert.*;


public class RemoveInvalidParent_301Test {
    RemoveInvalidParent_301 test = new RemoveInvalidParent_301();

    @Test
    public void removeInvalidParentheses() throws Exception {
        assertEquals(2, test.removeInvalidParentheses("()())()").size());
    }

}