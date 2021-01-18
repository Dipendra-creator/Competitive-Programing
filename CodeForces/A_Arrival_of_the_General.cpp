// https://codeforces.com/problemset/problem/144/A
// ✅Arrival of the General✅
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

    int numOfSoldiers, max_val_index, min_val_index, max_val = 0, min_val = 999999, count;

    cin >> numOfSoldiers;

    int arr[numOfSoldiers], finalArr[numOfSoldiers];    

    for (int i = 0; i < numOfSoldiers; i++)
    {
        cin >> arr[i];
        if (arr[i] > max_val)
        {
            max_val = arr[i];
            max_val_index = i;
        }
        if (arr[i] <= min_val)
        {
            min_val = arr[i];
            min_val_index = i;
        }
    }

    count = max_val_index + ((numOfSoldiers-1)-min_val_index);

    (min_val_index < max_val_index) ? cout << --count : cout << count;

    return 0;
}