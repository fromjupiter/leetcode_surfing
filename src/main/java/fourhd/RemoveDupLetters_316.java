package fourhd;

/**
 * Created by Kexiang on 2019/12/26.
 */
public class RemoveDupLetters_316 {
    public String removeDuplicateLetters(String s) {
        if(s==null || s.length()<2) return s;
        //work as a stack
        int top = -1;
        char[] ans = new char[26];
        boolean[] used = new boolean[26];
        int[] count = new int[26];
        char[] chars = s.toCharArray();
        for(char ch:chars) {
            count[ch-'a']+=1;
            used[ch-'a'] = false;
        }
        for(char ch:chars) {
            count[ch-'a']-=1;
            if(used[ch-'a']) continue;
            while(top>=0 && ans[top] > ch && count[ans[top]-'a']>0) {
                used[ans[top--]-'a'] = false;
            }
            ans[++top] = ch;
            used[ch-'a'] = true;
        }
        return new String(ans, 0, top+1);
    }
}
