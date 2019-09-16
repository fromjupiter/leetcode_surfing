package onehd;

/**
 * Created by Kexiang on 2019/9/15.
 * Too boring so I'll just skip. You can even find out the pattern with eyes.
 */
public class ZigZag_6 {
    public String convert(String s, int numRows) {
        if (numRows <= 1) return s;
        StringBuilder res = new StringBuilder();
        int size = 2 * numRows - 2, n = s.length();
        for (int i = 0; i < numRows; ++i) {
            for (int j = i; j < n; j += size) {
                res.append(s.charAt(j));
                int pos = j + size - 2 * i;
                if (i != 0 && i != numRows - 1 && pos < n) res.append(s.charAt(pos));
            }
        }
        return res.toString();
    }
}
