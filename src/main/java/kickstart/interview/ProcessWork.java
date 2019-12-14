package kickstart.interview;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Created by Kexiang on 2019/12/9.
 */
public class ProcessWork {
    static int solution(Integer[] loads) {
        int total_loads = Arrays.stream(loads).mapToInt(Integer::intValue).sum();
        // put your solution here
        int[] ans = new int[1];
        ans[0] = Integer.MAX_VALUE;
        dfs(loads, ans, 0, total_loads, 0);
        return ans[0];
    }

    private static void dfs(Integer[] loads, int[] ans, int curr_load, int total_load, int start_pos) {
        for(int i=start_pos;i<loads.length;++i) {
            if(ans[0]==0 && (total_load & 1) == 0) return;
            else if(ans[0]==1 &&(total_load & 1) == 1) return;

            curr_load += loads[i];
            if(curr_load>=total_load/2) {
                ans[0] = Math.min(ans[0], Math.abs(total_load-2*curr_load));
                break;
            }
            dfs(loads, ans, curr_load, total_load, i+1);
            curr_load-= loads[i];
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer[] loads = getIntegerArray(in.next());

        System.out.print(solution(loads));
    }

    private static Integer[] getIntegerArray(String str) {
        return Stream.of(str.split("\\,"))
                .map(Integer::valueOf)
                .toArray(Integer[]::new);
    }
}
