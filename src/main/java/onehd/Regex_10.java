package onehd;

/**
 * Created by Kexiang on 2019/9/15.
 *
 * DP:
 *  define table[i,j] as a bool indicating whether s[j:] matches p[i:].
 *  It will be easier to read if we use recursion.
 *  (the star case was over-complicated)
 */
public class Regex_10 {
    public boolean isMatch(String s, String p) {
        if(0==s.length()&&0==p.length()) {
            return true;
        }else if(0==p.length()) return false;

        int sLen = s.length(), pLen = p.length();
        //default to false, so we don't need to init false values
        //we add guardian level for empty string match
        boolean[][] table = new boolean[pLen+1][sLen+1];
        //init
        table[pLen][sLen]=true;
        if(sLen!=0 && '*'!=p.charAt(pLen-1)) {
            table[pLen-1][sLen-1] = isMatch(s.charAt(sLen-1), p.charAt(pLen-1));
        } else {
            //table[pLen-2][sLen] = true;
            for(int j=sLen-1;j>=0;--j) {
                if(isMatch(s.charAt(j),p.charAt(pLen-2))) {
                    table[pLen - 2][j] = true;
                } else break;
            }
        }
        //fill
        for(int i= pLen - 2;i>=0;--i){
            // don't need to fill '*' column
            if('*'==p.charAt(i)) continue;
            if('*'!=p.charAt(i+1)) {
                for(int j=sLen-1;j>=0;--j){
                    table[i][j] = isMatch(s.charAt(j),p.charAt(i)) && table[i+1][j+1];
                }
                continue;
            }
            if(0==sLen) {
                table[i][0] = table[i+2][0];
                continue;
            }
            for(int j=sLen;j>=0;--j) {
                //find the first non-match letter of p[i] after index j
                int endIndex = j;
                while(endIndex<sLen && isMatch(s.charAt(endIndex),p.charAt(i))) ++endIndex;
                for(int k=j;k<=endIndex;++k) {
                    table[i][j] = table[i][j] || table[i+2][k];
                }
            }
        }

        return table[0][0];
    }

    public boolean isMatch(char s, char p) {
        if('.'==p) return true;
        return s==p;
    }
}
