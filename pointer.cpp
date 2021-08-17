#include <stdio.h>

void update(int *a,int *b) {
    // Complete this function
    int a_temp = *a;
    int b_temp = *b;
    *a = a_temp+b_temp;
    *b = a_temp-b_temp;
    if(*b < 0)
        *b = -(*b);
}

int main() {
    int a, b;
    int *pa = &a, *pb = &b;
    
    scanf("%d %d", &a, &b);
    update(pa, pb);
    printf("%d\n%d", a, b);

    return 0;
}
