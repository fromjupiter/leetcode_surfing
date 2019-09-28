package kickstart.eighteen;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * You are participating in the Grand Kickstart Lucky Dip with many fantastic and amazing prizes (and some not so good ones)!

 In this Lucky Dip, there is a bag with N items. The i-th item in the bag has value Vi. You will put your hand into the bag and draw one item at random; all items in the bag have an equal probability of being chosen. The organizers want contestants to feel that they have some element of choice, so after you draw an item, you can either keep it, or "redip" by returning it to the bag and drawing again. (Note that the returned item is now just as likely to be chosen as any of the other items in the bag.) You may only redip a maximum of K times. If you use K redips, you must keep the item that you draw on your (K + 1)-th draw.

 If you play optimally to maximize the value of the item you will end the game with, what is the expected value of that item?
 */
public class LuckyDip {
    public static void main(String[] args){
        LuckyDip dip = new LuckyDip();
        Scanner input = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int T = input.nextInt();

        for(int i=1;i<=T;i++){
            input.nextLine();
            int N = input.nextInt();
            int K = input.nextInt();
            input.nextLine();
            int[] values = new int[N];
            for(int j=0;j<N;++j){
                values[j] = input.nextInt();
            }
            double res = dip.solve(N,K,values);
            System.out.println(String.format("Case #%d: %.6f", i, res));
        }
    }

    public double solve(int N, int K, int[] values){
        double prevExpect = Arrays.stream(values).average().getAsDouble();

        for(int i=1;i<=K;++i){
            double sum = 0;
            for(int j=0;j<values.length;++j){
                if(values[j]<prevExpect){
                    //do re-dip only if value is less than expected
                    sum+=prevExpect;
                } else sum+=values[j];
            }
            prevExpect = sum/N;
        }
        return prevExpect;
    }
}
