import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class CountingRooms {
 
    public static void main(String[] args)throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String[] str = br.readLine().split("\\s+");
      int n = Integer.parseInt(str[0]);
      int m = Integer.parseInt(str[1]);
 
      char[][] grid = new char[n][m];
      for(int i=0; i<n; i++){
        String st = br.readLine();
        for(int j=0; j<m; j++){
            grid[i][j] = st.charAt(j);
        }
      }
 
       solve(grid);
    }
 
    private static void solve(char[][] grid) {
            int n = grid.length;
            int m = grid[0].length;
            int count = 0;
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    if(grid[i][j] == '.'){
                        dfs(grid, i, j);
                        count+=1;
                    }
                }
            }
            System.out.println(count);
    }
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    private static void dfs(char[][] grid, int i, int j){
             grid[i][j] = '#'; //marking visited
              for(int k=0; k<4; k++){
                  int ci = i + dx[k];
                  int cj = j + dy[k];
                  if(isValid(ci, cj, grid)){
                      dfs(grid, ci, cj);
                  }
              }
    }
    static private boolean isValid(int ci, int cj, char[][] grid){
          if(ci < 0 || cj < 0 || ci >= grid.length || cj >= grid[0].length || grid[ci][cj] == '#'){
              return false;
          }
          return true;
    }
} 