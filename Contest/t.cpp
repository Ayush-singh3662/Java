#include<bits/stdc++.h>

using namespace std;

#define int long long

int32_t main() {
    int t;
    cin >> t;

    while (t--) {
        int n;
        cin >> n;
        int m = n;

        map<int, int> mp;
        int maxi = 0;
        int ans = 0;
        int counter = 0;

        while (n--) {
            int x, y;
            cin >> x >> y;
            mp[y]++;

            counter++;

            int some = mp[y] - 2;  
            ans -= (some) * (some + 1) / 2;

            int full = mp[y] - 1;
            ans += (full) * (full + 1) / 2;

            if (mp[y] > maxi) {
                maxi = mp[y];
            }

            full = maxi - 1;

            int soln = ans;

            soln -= (full) * (full + 1) / 2;

            full = maxi + (m - counter) - 1;

            soln += (full) * (full + 1) / 2;

            cout << soln << " ";
        }

        cout << endl;
    }

    return 0;
}