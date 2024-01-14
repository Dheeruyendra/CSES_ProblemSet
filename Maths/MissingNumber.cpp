#include <bits/stdc++.h>
using namespace std;
long long missingNumber(vector<long> &nums, long n)
{
    long long sum = 0;
    for (auto num : nums)
    {
        sum += num;
    }
    long long total = (n * (n + 1)) / 2;
    return total - sum;
}
int main()
{

    long n;
    cin >> n;
    vector<long> nums;
    for (int i = 0; i < n - 1; i++)
    {
        long temp;
        cin >> temp;
        nums.push_back(temp);
    }

    long long res = missingNumber(nums, n);
    cout << res << endl;
}