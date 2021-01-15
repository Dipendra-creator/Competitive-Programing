// https://codeforces.com/problemset/problem/112/A
// Petya and Strings
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

	string str;
    string str2;

    // taking Input of string
    cin >> str;
	cin >> str2;
    
    // using transform() function and ::tolower in STL 
    transform(str.begin(), str.end(), str.begin(), ::tolower);
	transform(str2.begin(), str2.end(), str2.begin(), ::tolower);

	// check if it is same or not
	if (str == str2){
		cout << "0";
	}
	else{
		if(str < str2){
			cout << "-1"; //If the first string is less than the second one, print "-1".
		} else{
			cout << "1"; //If the second string is less than the first one, print "1".
		}
	}
	return 0;
}