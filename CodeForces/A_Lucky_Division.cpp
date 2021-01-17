// https://codeforces.com/problemset/problem/122/A
// ✅Lucky Division✅
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

    int posibilities[] = {4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777};
    int pos_len = sizeof(posibilities)/sizeof(posibilities[0]);
    int value;
    cin >> value;

    if(1<= value <=1000){
        for(auto i : posibilities){
            if(value == i || value%i == 0){
                cout << "YES";
                break;
            }else{
                if(i == 777){
                    cout << "NO";
                }
            }
        }
    }
    else{
        cout << "NO";
    }
	return 0;
}