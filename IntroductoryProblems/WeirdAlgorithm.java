package IntroductoryProblems;
import java.util.*;
/**
 * Problem Link: https://cses.fi/problemset/task/1068
 * TC =>O(N) SC =>O(N)
 */
public class WeirdAlgorithm {

    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    long n = in.nextLong();
    ArrayList<Long> res = new ArrayList<>();
    res.add(n);

    while(n != 1){
       if(n%2 == 0){
         res.add(n/2);
         n = n/2;
       }
       else{
        n = n*3+1;
        res.add(n);
       }
    } 
    for(long num : res){
    System.out.print(num+" ");
    }
   } 
}