// https://codeforces.com/problemset/problem/136/A
// ✅Presents✅
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

	int num_friends;
    cin >> num_friends;

    vector <int> a(num_friends), a2(num_friends);

    for(int i = 0; i < num_friends; i++)
    {
        cin >> a[i];
    }

    /*
    The first example:
    The friend 1 gave gift to the friend 2 (a[0]=2) - this means that in output array number 1 at the place 2 : [?, 1, ?, ?].
    The friend 2 gave gift to the friend 3 (a[1]=3) - this means that in output array number 2 at the place 3 : [?, 1, 2, ?].
    The friend 3 gave gift to the friend 4 (a[2]=4) - this means that in output array number 3 at the place 4 : [?, 1, 2, 3].
    The friend 4 gave gift to the friend 1 (a[3]=1) - this means that in output array number 4 at the place 1 : [4, 1, 2, 3].
    */

    for (int j = 0; j < num_friends; j++)
    {
        a2[a[j]-1] = j+1;
    }

    for (int j = 0; j < num_friends; j++)
    {
        cout << a2[j] << " ";
    }

	return 0;
}