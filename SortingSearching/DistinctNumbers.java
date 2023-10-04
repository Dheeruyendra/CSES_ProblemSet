package SortingSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class DistinctNumbers {
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

    public static void main(String[] args) {
        
        int n = r.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = r.nextInt();
        }
        solve(arr);
        pw.close();
    }
    static void solve(int[] arr){
        int count = 1;
        sort(arr, 0, arr.length-1);
        for(int i=1; i<arr.length; i++){
            if(arr[i] != arr[i-1]){
                count++;
            }
        }
        pw.println(count);
    }
}
