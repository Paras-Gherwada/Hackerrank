#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int size;
    scanf("%d", &size);
    int num_array[size];
    for(int idx = 0; idx < size; ++idx)
        scanf("%d", &num_array[idx]);
        
    for(int idx = size-1; idx > -1; --idx)
        printf("%d ", num_array[idx]);
        
    return 0;
}

