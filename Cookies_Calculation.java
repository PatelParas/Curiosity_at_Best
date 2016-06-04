/**
JJesse loves cookies. He wants the sweetness of all his cookies to be greater than value.
To do this, Jesse repeatedly mixes two cookies with the least sweetness.
He creates a special combined cookie with:
sweetness =(1× Least sweet cookie + 2× 2nd least sweet cookie).
He repeats this procedure until all the cookies in his collection have a sweetness ≥K≥K. You are given Jesse's cookies.
Print the number of operations required to give the cookies a sweetness ≥K≥K. Print −1−1 if this isn't possible.

Input Format

The first line consists of integers NN, the number of cookies and KK, the minimum required sweetness,
separated by a space. The next line contains NN integers describing the array AA
where AiAi is the sweetness of the iith cookie in Jesse's collection.

Constraints

1≤N≤10^6
0≤K≤10^9
0≤Ai≤10^6
Output Format

Output the number of operations that are needed to increase the cookie's sweetness ≥k≥k.
Output −1−1 if this isn't possible.
**/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Cookies_Calculation {
    private static int getMinOperations(long K,PriorityQueue<Integer> thisQueue) {
        int operations = 0;
        while(thisQueue.peek()<K){
            if(thisQueue.size()>=2) {
                operations++;
                int tempOne = thisQueue.poll();
                int tempTwo = thisQueue.poll();
                thisQueue.offer(tempOne + 2*tempTwo);
            }
            else {
                return -1;
            }
        }
        return operations;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        long K = in.nextLong();
        PriorityQueue<Integer> thisQueue= new PriorityQueue<Integer>();
        for(int i=0; i < N; i++){
                    thisQueue.offer(in.nextInt());
        }
        System.out.print(getMinOperations(K,thisQueue));
    }
}
