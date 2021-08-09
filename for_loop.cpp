#include <iostream>
#include <cstdio>
using namespace std;

int main() {
    // Complete the code.
    int num1, num2;
    string result;
    
    cin >> num1;
    cin >> num2;
    
    for(; num1 <= num2; ++num1){
        if(num1 == 1) result = "one";
        else if(num1 == 2) result = "two";
        else if(num1 == 3) result = "three";
        else if(num1 == 4) result = "four";
        else if(num1 == 5) result = "five";
        else if(num1 == 6) result = "six";
        else if(num1 == 7) result = "seven";
        else if(num1 == 8) result = "eight";
        else if(num1 == 9) result = "nine";
        else result = (num1 & 1)? "odd": "even";        
        
        cout << result << endl;
    }
    
    return 0;
}
