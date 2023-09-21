package IntroductoryProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IncreasingArray {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    String[] str = br.readLine().split("\\s+");

    long[] arr = new long[n];
    for(int i=0; i<n; i++){
        arr[i] = Long.parseLong(str[i]);
    }

    long moves = 0;
    for(int i=1; i<n; i++){
        if(arr[i] < arr[i-1]){
         moves+=(arr[i-1]-arr[i]);
         arr[i] += (arr[i-1]-arr[i]);
        } 
    }
   
     System.out.println(moves);
  }
    
}