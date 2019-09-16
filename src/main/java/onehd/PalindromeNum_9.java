package onehd;

/**
 * Created by Kexiang on 2019/9/15.
 */
public class PalindromeNum_9 {
    /*
        Given that we cannot convert it to string,
        We just need a "long" to store the reverse number
     */
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        return reverse(x)==x;
    }

    public long reverse(int x) {
        long ans=0;
        while(x>0) {
            ans = ans*10+x%10;
            x/=10;
        }
        return ans;
    }
}
