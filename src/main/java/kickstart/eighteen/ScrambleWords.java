package kickstart.eighteen;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;


/**
 * It works for the test sample, but it gives runtime error in the attempt run.
 * I JUST DON'T KNOW WHY!
 */
public class ScrambleWords {
    public static void main(String[] args){
        ScrambleWords sw = new ScrambleWords();
        Scanner input = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int T = input.nextInt();
        for(int i=1;i<=T;i++){
            input.nextLine();
            int L = input.nextInt();
            input.nextLine();
            String[] words = new String[L];
            for(int j=0;j<L;++j){
                words[j] = input.next();
            }
            input.nextLine();
            char s1=input.next().charAt(0), s2=input.next().charAt(0);
            int N=input.nextInt(), A=input.nextInt(), B=input.nextInt();
            int C=input.nextInt(), D=input.nextInt();

            String s = sw.genStr(s1,s2,N,A,B,C,D);
            int res = sw.solve(words, s);
            System.out.println(String.format("Case #%d: %d", i, res));
        }
    }

    public String genStr(char s1, char s2, int N, int A, int B, int C, int D){
        int[] ords = new int[N];
        ords[0]=s1;
        ords[1]=s2;
        for(int x=2;x<N;++x){
            ords[x] = (A*ords[x-1]+B*ords[x-2]+C)%D;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(s1);sb.append(s2);
        for(int i=2;i<N;++i){
            sb.append((char)(97+ords[i]%26));
        }
        return sb.toString();
    }

    public int solve(String[] words, String seq) {
        int count = 0;
        for(String word:words){
            if(solve(word, seq)) ++count;
        }
        return count;
    }

    public boolean solve(String word, String seq) {
        if(word.length()==0) return true;
        int[] target = new int[26];
        for(int i=1;i<word.length()-1;++i){
            ++target[word.charAt(i)-97];
        }
        long required = Arrays.stream(target).filter(x->x>0).count();
        for(int i=0;i<=seq.length()-word.length();++i){
            if(word.charAt(0)!=seq.charAt(i) || word.charAt(word.length()-1)!=seq.charAt(i+word.length()-1))
                continue;
            if(required==0) return true;
            long formed = 0;
            int[] bag = new int[26];
            for(int j=1;j<word.length()-1;++j){
                int ord = seq.charAt(i+j)-97;
                if(target[ord]==0){
                    //found an unmatched char, skip
                    i+=j; break;
                } else if(target[ord]==bag[ord]) {
                    //found an extra word, skip
                    i+=j-1; break;
                }
                ++bag[ord];
                if(target[ord]==bag[ord]) formed++;
                if(formed==required) return true;
            }
        }
        return false;
    }
}
