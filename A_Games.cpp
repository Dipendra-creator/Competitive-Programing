//
//
//
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

    int numOfGames,
    x = 0;
    int a[100][2];
    cin >> numOfGames;

    for (int i = 0; i < numOfGames; i++)
    {
        for (int j = 0; j < 2; j++)
        {
            cin >> a[i][j];
        }
    }

    for (int i = 0; i < numOfGames; i++)
    {
        for (int k = 0; k < numOfGames; k++)
        {
            if (a[i][0] == a[k][1])
            {
                x++;
            }
            if (a[i][1] == a[k][0])
            {
                x++;
            }
        }
    }

    cout << x;
    return 0;
}