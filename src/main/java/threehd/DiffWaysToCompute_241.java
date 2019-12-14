package threehd;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kexiang on 2019/12/6.
 */
public class DiffWaysToCompute_241 {

    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> res = new ArrayList<>();

        for(int i=0;i<input.length();++i) {
            if(input.charAt(i)=='+'||input.charAt(i)=='-'||input.charAt(i)=='*') {
                List<Integer> left = diffWaysToCompute(input.substring(0, i));
                List<Integer> right = diffWaysToCompute(input.substring(i+1));
                for(int j=0;j<left.size();++j) {
                    for (int k = 0; k < right.size(); ++k) {
                        switch (input.charAt(i)) {
                            case '+':
                                res.add(left.get(j) + right.get(k));
                                break;
                            case '-':
                                res.add(left.get(j) - right.get(k));
                                break;
                            case '*':
                                res.add(left.get(j) * right.get(k));
                                break;
                            default:
                                break;
                        }
                    }
                }
            }
        }
        if(res.isEmpty()) {
            res.add(Integer.parseInt(input));
        }
        return res;
    }
}
