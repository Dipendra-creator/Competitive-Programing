// 
// 
// 
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
    string result;

    // taking Input of string
    cin >> str;
    
    // using transform() function and ::tolower in STL 
    transform(str.begin(), str.end(), str.begin(), ::tolower);

    // removing Vowels
    char vowels[6] = {'a', 'e', 'i', 'o', 'u', 'y'};
    for (int i = 0; i < 6; i++){
        str.erase(remove(str.begin(), str.end(), vowels[i]), str.end());
    }
    
    // putting '.' before every letter
    for (int i = 0; i < str.length(); i++){
        result = result + "." + str[i];
    }

    cout << result << endl;

	return 0;
}