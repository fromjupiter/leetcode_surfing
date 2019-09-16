package onehd;

/**
 * Created by Kexiang on 2019/9/15.
 */
public class ReverseInt_7 {
    public int reverse(int x) {
        long ans = 0;
        int temp = x>0?x:-x;
        while(temp>0) {
            ans = ans*10+temp%10;
            //check overflow
            if(ans>Integer.MAX_VALUE) return 0;
            temp/=10;
        }
        return x>0?(int)ans:(int)-ans;
    }
}
