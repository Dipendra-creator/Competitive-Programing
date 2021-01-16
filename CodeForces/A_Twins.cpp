// https://codeforces.com/problemset/problem/160/A
// ✅Twins✅
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

	int n, sum = 0, sum1 = 0, count;

    cin >> n;

    int arr[n];

    for (int i = 0; i < n; i++){
        cin >> arr[i];
        sum += arr[i];
    }

    sort(arr, arr + n);
    reverse(arr, arr + n);

    count = 1;
    for (int i = 0; i < n; i++){
        sum1 += arr[i];
        if(sum1 <= sum - sum1){
            count++;
        }
    }

    cout << count;
    
    return 0;
}