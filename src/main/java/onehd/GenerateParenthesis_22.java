package onehd;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kexiang on 2019/9/18.
 */
public class GenerateParenthesis_22 {
    /**
     * A simple recursion solution
     */
    public List<String> generateParenthesis(int n) {
        int openCount = 0;
        List<String> ans = new ArrayList<>();
        appendCandidate(ans, new StringBuilder(), 0, n, n);
        return ans;
    }

    public void appendCandidate(List<String> target, StringBuilder current, int openCount, int openLeft, int closeLeft) {
        if(openLeft==0 && closeLeft==0) {
            target.add(current.toString());
            return;
        }
        if(openCount>0 && closeLeft>0) {
            //push close
            current.append(')');
            appendCandidate(target,current,openCount-1, openLeft, closeLeft-1);
            current.deleteCharAt(current.length()-1);
        }
        //push open
        if(openLeft>0) {
            current.append('(');
            appendCandidate(target,current,openCount+1,openLeft-1,closeLeft);
            current.deleteCharAt(current.length()-1);
        }
    }
}
