
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
/**
 * Problem Link: https://cses.fi/problemset/task/1068
 * TC =>O(N) SC =>O(N)
 */
public class WeirdAlgorithm {
static class InputReader {
BufferedReader reader;
StringTokenizer tokenizer;
public InputReader(InputStream stream) {
reader = new BufferedReader(new InputStreamReader(stream), 32768);
tokenizer = null;
}
String next() { // reads in the next string
while (tokenizer == null || !tokenizer.hasMoreTokens()) {
try {
tokenizer = new StringTokenizer(reader.readLine());
} catch (IOException e) {
throw new RuntimeException(e);
}
}
return tokenizer.nextToken();
}
public int nextInt() { // reads in the next int
return Integer.parseInt(next());
}
public long nextLong() { // reads in the next long
return Long.parseLong(next());
}
public double nextDouble() { // reads in the next double
return Double.parseDouble(next());
}
}
static InputReader r = new InputReader(System.in);
static PrintWriter pw = new PrintWriter(System.out);

    public static void main(String[] args){
    long n = r.nextLong();
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
     pw.print(num +" ");
    }
    pw.close();
   } 
}