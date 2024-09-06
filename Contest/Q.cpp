#include <iostream>
#include <vector>
#include <unordered_set>
#include <unordered_map>
#include <map>
#include <string>
#include <algorithm>

using namespace std;

int solve(int n, vector<string>& a, unordered_set<char>& set) {
    unordered_map<char, int> m;
    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < a[i].length(); ++j) {
            if (isdigit(a[i][j])) {
                continue;
            }
            m[a[i][j]]++;
        }
    }
    
    map<int, char, greater<int>> map;
    for (const auto& pair : m) {
        map[pair.second] = pair.first;
    }
    
    int p = 1;
    unordered_map<char, int> val;
    bool flag = true;
    for (const auto& pair : map) {
        char c = pair.second;
        if (set.find(c) == set.end() && flag) {
            val[c] = 0;
            flag = false;
        } else if (flag) {
            val[c] = p++;
        }
    }
    
    int sum = 0;
    for (int i = 0; i < a.size(); ++i) {
        string sb;
        for (int j = 0; j < a[i].length(); ++j) {
            char c = a[i][j];
            if (!isdigit(c)) {
                sb += to_string(val[c]);
                continue;
            }
            sb += c;
        }
        sum += stoi(sb);
    }
    return sum;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    
    int t;
    cin >> t;
    while (t-- > 0) {
        int n;
        cin >> n;
        vector<string> a(n);
        unordered_set<char> set;
        for (int i = 0; i < n; ++i) {
            cin >> a[i];
            if (!isdigit(a[i][0])) {
                set.insert(a[i][0]);
            }
        }
        cout << solve(n, a, set) << endl;
    }
    return 0;
}