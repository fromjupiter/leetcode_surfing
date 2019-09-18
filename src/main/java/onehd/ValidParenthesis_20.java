package onehd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Kexiang on 2019/9/17.
 */
public class ValidParenthesis_20 {
    /**
     * Using a stack will solve this problem
     */
    public boolean isValid(String s) {
        List<Character> stack = new ArrayList<>();
        List<Character> chars = Arrays.asList('(',')','[',']','{','}');
        List<Character> openParents = Arrays.asList('(','[','{');
        List<Character> closeParents = Arrays.asList(')',']','}');
        for (int i=0;i<s.length();++i) {
            if (closeParents.contains(s.charAt(i))) {
                if(!stack.isEmpty()){
                    if(isMatch(stack.get(stack.size()-1),s.charAt(i))) {
                        stack.remove(stack.size()-1);
                    } else return false;
                } else stack.add(s.charAt(i));
            } else if(openParents.contains(s.charAt(i))) {
                stack.add(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }

    boolean isMatch(char open, char close) {
        return (open=='['&&close==']')||(open=='('&&close==')')||(open=='{'&&close=='}');
    }
}
