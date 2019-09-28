package onehd;

/**
 * Created by Kexiang on 2019/9/27.
 */
public class SortColors_75 {
    public void sortColors(int[] nums) {
        if(nums.length==0||nums.length==1) return;

        int lpos = 0, rpos = nums.length-1, cursor=0;
        //lpos is exclusive, meaning [0,lpos) will be 0
        //rpos is exclusive, meaning (rpos, end] will be 2
        //then [lpos,rpos] will be 1
        int oneCount = 0;
        while(rpos-lpos>=oneCount){
            if(nums[cursor]==0){
                nums[lpos]=0;
                lpos++;
                cursor++;
            } else if(nums[cursor]==2){
                nums[cursor]=nums[rpos];
                nums[rpos]=2;
                rpos--;
            } else {
                oneCount++;
                cursor++;
            }
        }
        for(int i=lpos;i<=rpos;++i) nums[i]=1;
    }
}
