package kickstart.interview;

import java.util.Scanner;

/**
 * Created by Kexiang on 2019/12/9.
 */
public class Solution2 {
    public static String solution(String T) {
        String[] splits = T.split(":");
        // Your solution goes here.
        return String.format("%s:%s", maxHour(splits[0]), maxMin(splits[1]));
    }

    private static String maxHour(String T) {
        if(T.equals("??")) {
            return "23";
        }
        if(T.charAt(0)=='?') {
            if(T.charAt(1) < '4') {
                return T.replace('?', '2');
            } else return T.replace('?', '1');
        }
        if(T.charAt(1)=='?') {
            if(T.charAt(0) < '2') {
                return T.replace('?', '9');
            } else return T.replace('?', '3');
        }
        return T;
    }

    private static String maxMin(String T) {
        if(T.equals("??")) {
            return "59";
        }
        if(T.charAt(0)=='?') {
            return T.replace('?', '5');
        }
        if(T.charAt(1)=='?') {
            return T.replace('?', '9');
        }
        return T;
    }

    public static void main(String[] args) {
        // Read from stdin, solve the problem, write answer to stdout.
        Scanner in = new Scanner(System.in);
        System.out.print(solution(in.next()));
    }
}
