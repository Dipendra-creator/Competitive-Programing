// https://codeforces.com/problemset/problem/58/A
// ✅Chat Room✅
// A2OJ
#include <bits/stdc++.h>
#include <string>
#define fastio ios_base::sync_with_stdio(false); cin.tie(0); cout.tie(0);
#define double long double
#define int long long
#define endl "\n"

using namespace std;

signed main()
{
	fastio

    int char_pos = 0, count = 0;

	string str;

    cin >> str;

    char hello[5] = {'h', 'e', 'l', 'l', 'o'};
 
    for (int i = 0; i < str.length(); i++)
    {
        if (str[i] == hello[char_pos]){
            char_pos++;
            count ++;
        }
    }
    
    // cout << count <<endl;
    (count == 5) ? cout << "YES" : cout << "NO";

	return 0;
}