// https://codeforces.com/problemset/problem/451/A
// ✅Game With Sticks✅
// A2OJ
#include <bits/stdc++.h>
#include <vector>
#define fastio                        \
    ios_base::sync_with_stdio(false); \
    cin.tie(0);                       \
    cout.tie(0);
#define double long double
#define int long long
#define endl "\n"

using namespace std;

signed main()
{
    fastio

    int n,m, cp;
    cin >> n >> m;

    (n > m) ? cp = m : cp = n;

    cout << ((cp % 2 == true) ? "Akshat" : "Malvika");

    return 0;
}