// https://codeforces.com/problemset/problem/4/A
// Watermelon
// A2OJ
#include <bits/stdc++.h>
#define fastio ios_base::sync_with_stdio(false); cin.tie(0); cout.tie(0);
#define double long double
#define int long long
#define endl "\n"

using namespace std;

signed main()
{
    fastio

    int a;
    cin >> a;
    if (a == 2)
    {
        cout << "NO";
    }
    else
    {
        cout << ((a & 1) ? "NO" : "YES");
    }
    
    return 0;
}