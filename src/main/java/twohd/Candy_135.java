package twohd;

import java.util.stream.IntStream;

/**
 * Created by Kexiang on 2019/10/18.
 */
public class Candy_135 {
    /**
     * find all lowest point, assign to 1.
     */
    public int candy(int[] ratings) {
        if(ratings.length==1) return 1;

        int[] candy = new int[ratings.length];
        for(int i=0;i<ratings.length;++i) {
            if(i>0 && ratings[i]>ratings[i-1]) continue;
            if(i<ratings.length-1 && ratings[i]>ratings[i+1]) continue;

            candy[i] = 1;
            //left
            int left = i-1;
            while(left>=0 && ratings[left]>ratings[left+1]) {
                if(candy[left]!=0){
                    candy[left] = Math.max(candy[left], i-left+1);
                    break;
                }
                candy[left] = i-left+1;
                --left;
            }
            //right
            int right = i+1;
            while(right<candy.length && ratings[right]>ratings[right-1]) {
                if(candy[right]!=0){
                    candy[right] = Math.max(candy[right], right-i+1);
                    break;
                }
                candy[right] = right-i+1;
                ++right;
            }
        }
        return IntStream.of(candy).sum();
    }
}
