import java.util.*;
import java.io.*;
public class Repetitions {

  public static void main(String[] args)throws IOException {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  String s = br.readLine();
  int maxLen = 1;
  int n = s.length();
  int i = 0;

  while (i<n) {
    char c = s.charAt(i);
    int  j = i;

    while(j+1 < n && s.charAt(j+1) == s.charAt(j)){
        j+=1;
    }

    if(j-i+1 > maxLen){
        maxLen = j-i+1;
    }

    i = j+1;
    
  }
  System.out.println(maxLen);
  }  
    
}