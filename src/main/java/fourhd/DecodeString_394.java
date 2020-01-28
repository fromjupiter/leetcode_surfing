package fourhd;


import java.util.Stack;

public class DecodeString_394 {
    class Info {
        int count;
        int index;
        Info(int c, int i) { count=c;index=i;}
    }

    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder();

        Stack<Info> stack = new Stack<>();
        int i=0;
        int kInd = -1;
        while(i<s.length()) {
            char ch = s.charAt(i);
            if(ch>='0' && ch<='9') {
                if(kInd==-1) kInd = i;
            } else if(ch=='[') {
                stack.push(new Info(Integer.valueOf(s.substring(kInd, i)), i));
                kInd = -1;
            } else if(ch==']') {
                Info info = stack.peek();
                if(info.count<=1) {
                    stack.pop();
                } else {
                    info.count--;
                    i = info.index;
                }
            } else {
                sb.append(ch);
            }
            ++i;
        }
        return sb.toString();
    }
}
