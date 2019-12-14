package kickstart.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Kexiang on 2019/12/9.
 */
public class Solution1 {

    public static String solution(String[] A) {
        Map<String, Integer> rooms = new HashMap<>();
        for(String booking:A) {
            if(booking.charAt(0)=='-') continue;
            rooms.put(booking, rooms.getOrDefault(booking,0)+1);
        }
        return rooms.entrySet().stream().max((e1,e2)->{
            // book num
            if(e1.getValue() != e2.getValue()) return e1.getValue() - e2.getValue();
            // alphabetically
            if(e1.getKey().charAt(2) != e2.getKey().charAt(2)) return e2.getKey().charAt(2) - e1.getKey().charAt(2);
            // numerically
            return e2.getKey().charAt(1) - e1.getKey().charAt(1);
        }).get().getKey().substring(1);
    }

    public static String solution_countbase(String[] A) {
        int[][] rooms = new int[26][10];
        // Your solution goes here.
        for(String booking:A) {
            if(booking.charAt(0)=='-') continue;
            rooms[booking.charAt(2)-'A'][Integer.parseInt(booking.substring(1,2))] += 1;
        }
        int max_i = 0, max_j = 0;
        for(int i=0; i<26;++i) {
            for(int j=0;j<10;++j) {
                if(rooms[max_i][max_j]<rooms[i][j]) {
                    max_i = i; max_j = j;
                }
            }
        }
        return String.format("%d%s",max_j, (char)('A'+max_i));
    }

    public static void main(String[] args) {
        // Read from stdin, solve the problem, and write the answer to stdout.
        Scanner in = new Scanner(System.in);
        System.out.print(solution(in.next().split(",")));
    }
}
