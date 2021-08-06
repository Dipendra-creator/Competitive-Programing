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

    // defining sum variables
	int n, sum = 0, sum1 = 0, count;

    // taking input of total numbers
    cin >> n;

    // creating Empty array
    int arr[n];

    // taking input of array and its all element sum
    for (int i = 0; i < n; i++){
        cin >> arr[i];
        sum += arr[i]; // sum of each element in array
    }

    // sorting of array
    sort(arr, arr + n);
    
    // reversing of array
    reverse(arr, arr + n);

    // defining counter as 1 
    count = 1;

    // logic
    for (int i = 0; i < n; i++){

        // sum of element those he already taken
        sum1 += arr[i];

        // creating counter of coin picked
        if(sum1 <= sum - sum1){
            count++;
        }
    }

    // counter printing
    cout << count;
    
    return 0;
}