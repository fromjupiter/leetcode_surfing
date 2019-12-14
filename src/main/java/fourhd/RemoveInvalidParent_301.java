package fourhd;

import java.util.*;

/**
 * Created by Kexiang on 2019/12/8.
 */
public class RemoveInvalidParent_301 {
    public List<String> removeInvalidParentheses(String s) {
        List<String> ans = new ArrayList<>();
        dfs(s, ans, 0, 0, new char[]{'(',')'});
        return ans;
    }

    public void dfs(String s, List<String> ans, int last_i, int last_j, char[] pair) {
        for (int stack = 0, i = last_i; i < s.length(); ++i) {
            if (s.charAt(i) == pair[0]) stack++;
            if (s.charAt(i) == pair[1]) stack--;
            if (stack >= 0) continue;
            // need to remove one pair[1] from previous scanned string
            for (int j = last_j; j <= i; ++j)
                if (s.charAt(j) == pair[1] && (j == last_j || s.charAt(j - 1) != pair[1]))
                    dfs(s.substring(0, j) + s.substring(j + 1, s.length()), ans, i, j, pair);
            return;
        }
        String reversed = new StringBuilder(s).reverse().toString();
        if (pair[0] == '(')
            dfs(reversed, ans, 0, 0, new char[]{')', '('});
        else
            ans.add(reversed);
    }
}
