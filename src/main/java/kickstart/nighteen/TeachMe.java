package kickstart.nighteen;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Kexiang on 2019/9/29.
 */
public class TeachMe {
    public static void main(String[] args){
        TeachMe dip = new TeachMe();
        Scanner input = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int T = input.nextInt();

        for(int i=1;i<=T;i++){
            input.nextLine();
            int N = input.nextInt();
            int S = input.nextInt();
            List<Set<Integer>> map = new ArrayList<>(N);
            for(int j=0;j<N;++j){
                input.nextLine();
                int skills = input.nextInt();
                Set<Integer> list = new HashSet<>(skills);
                for(int k=0;k<skills;++k){
                    list.add(input.nextInt());
                }
                map.add(list);
            }
            int res = dip.solve(map, S);
            System.out.println(String.format("Case #%d: %d", i, res));
        }
    }

    public int solve(List<Set<Integer>> list, int S) {
        int count = 0;
        for(int i=0;i<list.size();++i){
            for(int j=i+1;j<list.size();++j) {
                Set<Integer> x,y;
                if(list.get(i).size()>list.get(j).size()){
                    x = list.get(j); y = list.get(i);
                } else {
                    x = list.get(i); y=list.get(j);
                }
                if(x.size()<y.size()) {
                    count++;
                    for (Integer skill : x) {
                        if (!y.contains(skill)) {
                            count++;break;
                        }
                    }
                } else {
                    if(!x.equals(y)) count+=2;
                }
            }
        }
        return count;
    }
}
