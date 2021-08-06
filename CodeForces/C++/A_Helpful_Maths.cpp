// https://codeforces.com/problemset/problem/339/A
// ✅Helpful Maths✅
// A2OJ
#include <bits/stdc++.h>
#include <sstream>  // for string streams 
#include <string>  // for string 
#define fastio ios_base::sync_with_stdio(false); cin.tie(0); cout.tie(0);
#define double long double
#define int long long
#define endl "\n"

using namespace std;

signed main()
{
	fastio

    // Inputing Initial String
    string str;
    cin >> str;

    /* Creating Vector of String to get our value without "+" sign */ 
    vector<string> v;
 
    stringstream ss(str);
 
    while (ss.good()) {
        string substr;
        getline(ss, substr, '+');
        v.push_back(substr);
    }
 
    // creating String Array of Size Of our String
    string arr[v.size()];
    
    // putting values in array
    for (int i = 0; i < v.size(); i++){
        arr[i] = v[i];
    }
    
    // length of array
    int n = sizeof(arr) / sizeof(arr[0]);

    /*Here we take two parameters, the beginning of the
    array and the length n upto which we want the array to
    be sorted*/
    sort(arr, arr + n);

    // getting desireable result
    string result = arr[0];

    for (int i = 1; i < v.size(); i++){
        result = result + "+" + arr[i];
    }

    // printing result
    cout << result;
	return 0;
}