package threehd;

/**
 * Created by Kexiang on 2019/12/6.
 */
public class SingleNumThree_260 {
    public int[] singleNumber(int[] items) {
        int[] result = new int[2];
        int xor = 0;
        for(int i : items){
            xor ^= i;
        }
        // use this mask to divide two buckets
        // it finds the first 1 in xor.
        // meaning that this bit of two numbers is different
        xor &= ~(xor - 1);
        for(int i : items){
            if((i&xor) != 0){
                result[0] ^= i;
            }
            else{
                result[1] ^= i;
            }
        }
        return result;
    }
}
