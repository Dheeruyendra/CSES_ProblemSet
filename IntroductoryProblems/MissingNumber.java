package IntroductoryProblems;
import java.util.*;
import java.io.*;
public class MissingNumber {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split("\\s+"); 
        long n = Long.parseLong(st[0]);
        
        st = br.readLine().split("\\s+");
        long  sum = 0;
        for(int i=0; i<st.length; i++){
            sum += Long.parseLong(st[i]);
        }

        System.out.println(n*(n+1)/2 - sum);
    }


}
