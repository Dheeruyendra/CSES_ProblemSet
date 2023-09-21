#include <iostream>
#include <vector>
using namespace std;
 
int dx[] = {-1, 0, 1, 0};
int dy[] = {0, 1, 0, -1};
 
bool isValid(int ci, int cj, vector<vector<char>>& grid) {
    if (ci < 0 || cj < 0 || ci >= grid.size() || cj >= grid[0].size() || grid[ci][cj] == '#') {
        return false;
    }
    return true;
}
 
void dfs(vector<vector<char>>& grid, int i, int j) {
    grid[i][j] = '#'; // marking visited
    for (int k = 0; k < 4; k++) {
        int ci = i + dx[k];
        int cj = j + dy[k];
        if (isValid(ci, cj, grid)) {
            dfs(grid, ci, cj);
        }
    }
}
 
void solve(vector<vector<char>>& grid) {
    int n = grid.size();
    int m = grid[0].size();
    int count = 0;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (grid[i][j] == '.') {
                dfs(grid, i, j);
                count += 1;
            }
        }
    }
    cout << count << endl;
}
 
int main() {
    int n, m;
    cin >> n >> m;
    vector<vector<char>> grid(n, vector<char>(m));
 
    for (int i = 0; i < n; i++) {
        string st;
        cin >> st;
        for (int j = 0; j < m; j++) {
            grid[i][j] = st[j];
        }
    }
 
    solve(grid);
 
    return 0;
}