#include <iostream>
#include <vector>
using namespace std;
int main(){
  long long n;
  cin >> n;
  vector<long long> res;
  res.push_back(n);

  while(n!=1){
    if(n%2 == 0){
        n = n/2;
        res.push_back(n);
    }
    else {
        n = n*3 + 1;
        res.push_back(n);
    }
  }

  for(long long num : res){
    cout << num  << " ";
  }
 return 0;
}