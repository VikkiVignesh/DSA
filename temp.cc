#include <iostream>
#include <string>
#include <unordered_set>
#include<algorithm>

using namespace std;

class Solution {
public:
    string gcdOfStrings(string str1, string str2) {
        // Find the common prefix of str1 and str2
        string str = "";
        for (int i = 0, j = 0; i < str1.length() && j < str2.length(); i++, j++) {
            if (str1[i] == str2[j]) {
                str += str1[i];
            } else {
                break;
            }
        }
        
        if (str.empty()) {
            return str;
        }

        // Construct a set of unique characters from the common prefix
        unordered_set<char> charSet;
        for (char c : str) {
            charSet.insert(c);
        }

        // Construct the resulting string by concatenating unique characters
        string res = "";
        for (char c : charSet) {
            res += c;
        }
        sort(res.begin(),res.end());
        return res;
    }
};

int main() {
    string s1 = "ABABAB";
    string s2 = "ABAB";
    Solution obj;
    cout << obj.gcdOfStrings(s1, s2);
    return 0;
}
