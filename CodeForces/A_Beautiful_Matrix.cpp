// https://codeforces.com/problemset/problem/263/A
// ✅Beautiful Matrix✅
// A2OJ
#include <bits/stdc++.h>
#include<vector>
#define fastio ios_base::sync_with_stdio(false); cin.tie(0); cout.tie(0);
#define double long double
#define int long long
#define endl "\n"

using namespace std;

void coutSteps(int row, int column)
{
    int x, y, sum;
    
    x = abs(row - 3);
    y = abs(column - 3);

    sum = x + y;
    cout << sum;
}

signed main()
{
	fastio

    int v[10][10], r, c;

    for (int i = 1; i <= 5; i++)
    {
        for (int j = 1; j <= 5; j++)
        {
            cin >> v[i][j];
            if (v[i][j] == 1)
            {
                r = i;
                c = j;
            }
        }
    }

    coutSteps(r,c);

	return 0;
}