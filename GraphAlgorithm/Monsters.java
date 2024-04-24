import java.io.*;
import java.util.*;

public class Main {
    static class Pair{
        char t;
        int i, j;
        Pair(char t, int i, int j){
          this.t = t;
          this.i = i;
          this.j = j;
        }
    }
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
        int m = r.nextInt();
        
        char[][] matrix = new char[n][m];
        for(int i=0; i<n; i++){
          String s = r.next();
          for(int j=0; j<s.length(); j++){
             matrix[i][j] = s.charAt(j);
          }
        }
        
        bfs(matrix);
        pw.close();
    }
    static void bfs(char[][] matrix){
           int[] dx = {1, -1, 0, 0};
           int[] dy = {0, 0, 1, -1};
           Queue<Pair> q = new LinkedList<>();
           for(int i=0; i<matrix.length; i++){
             for(int j=0; j<matrix[0].length; j++){
               if(matrix[i][j] == 'A' || matrix[i][j] == 'M'){
                  q.add(new Pair(matrix[i][j], i, j));
               }
             }
           }
           
           while(!q.isEmpty()){
              Pair curr = q.poll();
              if(curr.t == 'A' && isExit(curr.i, curr.j, matrix)){
                pw.println("YES");
                return;
              }
              
              //explore neighbours
              for(int k=0; k<4; k++){
                 int nx = curr.i + dx[k];
                 int ny = curr.j + dy[k];
                 
                 if(isValid(matrix, nx, ny)){
                    matrix[nx][ny] = '#'; //mark as visited
                    q.add(new Pair(curr.t, nx, ny));
                 }
              }
           }
           
           pw.println("NO");
    }
    
    static boolean isExit(int i, int j, char[][]matrix){
           if(i == 0 || i == matrix.length-1 || j == 0 || j == matrix[0].length-1){
             return true;
           }
           return false;
    }
    
    static boolean isValid(char[][] matrix, int i, int j){
        if(i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length || matrix[i][j] != '.'){
          return false;
        }
        return true;
    }
    
    
}