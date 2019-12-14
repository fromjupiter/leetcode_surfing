package kickstart.interview;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class StudentRow {

    //Greedy
    //Always take the row whose shortest is shortest.
    static int solution(Integer[] A) {
        //brain dead solution
        List<Integer> rows = new ArrayList<>();

        for(int num : A) {
            Integer target = null;
            for(int i=0;i<rows.size();++i) {
                //find some row that has a shorter min
                if(target!=null && rows.get(i)<rows.get(target))
                    target = i;
                else if(target==null && num<rows.get(i))
                    target = i;
            }
            if(target==null) {
                rows.add(num);
            } else {
                rows.set(target, num);
            }
        }
        return rows.size();
    }

    public static void main(String[] args) {
        // Read from stdin, solve the problem, write answer to stdout.
        Scanner in = new Scanner(System.in);
        Integer[] A = getIntegerArray(in.next());

        System.out.print(solution(A));
    }

    private static Integer[] getIntegerArray(String str) {
        return Stream.of(str.split("\\,"))
                .map(Integer::valueOf)
                .toArray(Integer[]::new);
    }
}
