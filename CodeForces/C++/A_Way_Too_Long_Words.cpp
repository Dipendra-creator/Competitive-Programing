// https://codeforces.com/problemset/problem/71/A
// Way_Too_Long_Words
// A2OJ
#include <bits/stdc++.h>
#include <sstream>  // for string streams 
#include <string>  // for string  
#define fastio ios_base::sync_with_stdio(false); cin.tie(0); cout.tie(0);
#define double long double
#define int long long
#define endl "\n"

using namespace std;

void limitingWord(string word){
    int lengthOfWord = word.length();
    if (lengthOfWord > 10){
        lengthOfWord -= 2;
        // declaring output string stream 
        ostringstream str1; 
    
        // Sending a number as a stream into output 
        // string 
        str1 << lengthOfWord; 
    
        // the str() coverts number into string 
        string str = str1.str(); 

        string finalWord = word[0] + str + word[(lengthOfWord+1)];
        
        cout << finalWord << endl;
    }
    else{
        cout << word << endl;
    }

}

signed main()
{
	fastio

	int numOfWords;
    cin >> numOfWords;

    for(int i = 0; i < numOfWords; i++){
        string limitedWord;
        cin >> limitedWord;
        limitingWord(limitedWord);
    }

    return 0;
}