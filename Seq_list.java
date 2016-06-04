/** https://www.hackerrank.com/challenges/dynamic-array **/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Seq_list {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int Q = in.nextInt();
        List<List> thisArrayList = new ArrayList();
        for (int i = 0; i < N; i++){
            thisArrayList.add(new ArrayList<Integer>());
        }
        int lastAns = 0 ;
        for(int i=0; i<Q; i++){
            int t = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            List<Integer> seq = thisArrayList.get((x^lastAns)%N);
            switch (t) {
                case 1 :seq.add(y);
                        break;
                case 2 :lastAns = seq.get(y%(seq.size()));
                        System.out.println(lastAns);
                        break;
                default: break;
            }
        }
    }
}
