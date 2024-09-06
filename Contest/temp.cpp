#include <iostream>
#include <vector>
#include <algorithm>
#include <climits>

using namespace std;

long long maxProfit(int n, int k, vector<int>& profit) {
    vector<long long> doubledProfit(2 * n);
    copy(profit.begin(), profit.end(), doubledProfit.begin());
    copy(profit.begin(), profit.end(), doubledProfit.begin() + n);

    vector<long long> prefixSum(2 * n + 1, 0);
    for (int i = 1; i <= 2 * n; ++i) {
        prefixSum[i] = prefixSum[i - 1] + doubledProfit[i - 1];
    }

    long long maxProfit = LLONG_MIN;

    for (int i = 0; i < n; ++i) {
        long long sumK = prefixSum[i + k] - prefixSum[i];
        int oppositeStart = (i + n - k) % n;
        long long sumOppositeK = prefixSum[oppositeStart + k] - prefixSum[oppositeStart];
        long long totalProfit = sumK + sumOppositeK;
        maxProfit = max(maxProfit, totalProfit);
    }

    return maxProfit;
}

int main() {
    int k, n;
    cin >> k >> n;
    vector<int> a(n);
    for (int i = 0; i < n; ++i) {
        cin >> a[i];
    }
    cout << maxProfit(n, k, a) << endl;  // Output should be the maximum profit
    return 0;
}
