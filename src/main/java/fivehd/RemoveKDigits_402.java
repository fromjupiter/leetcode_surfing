package fivehd;


public class RemoveKDigits_402 {
    /*
        scan left to right, find max
     */
    public String removeKdigits(String num, int k) {
        if(num.length()<=k) return "0";

        StringBuilder sb = new StringBuilder();
        int i=0;
        while(k>0 && i<num.length()) {
            if(sb.length()!=0 && sb.charAt(sb.length()-1) > num.charAt(i)) {
                sb.deleteCharAt(sb.length()-1);
                --k;
            } else {
                sb.append(num.charAt(i));
                ++i;
            }
        }
        //handle the rest k
        if(i<num.length()-k)
            sb.append(num.substring(i, num.length()-k));
        else {
            // add too many chars in sb, remove them
            sb.delete(sb.length() - (i-num.length()+k), sb.length());
        }
        if(sb.length()==0) return "0";
        //remove heading zeros
        i=0;
        while(i<sb.length() && sb.charAt(i)=='0') ++i;
        if(i==sb.length()) return "0";
        return sb.substring(i);
    }
}
