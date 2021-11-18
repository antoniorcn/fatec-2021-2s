
#include <stdio.h>
#include <stdlib.h>

int main() {
    int a = 10;
    int b = a / 2;
    // b = b + 1;
    int c = b++; // Pos fixado
    // int c = ++b; // Pre fixado

    printf("A %d\n", a);
    printf("B %d\n", b);
    printf("C %d\n", c);

    return 0;
}

