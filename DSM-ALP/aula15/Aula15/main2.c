#include <stdio.h>
#include <stdlib.h>

int main2() {

    int idade = 70;
    char nome[] = "Antonio";
    char letra = "X";
    int contar = 19;


    printf("Contar %d\n", contar);
    // esquerda       direita
    contar       =    contar - 1;
    printf("Contar %d\n", contar);

    // contar = contar + 1;
    contar -= 1;   // Operador Aritm�tico de Atribui��o
    printf("Contar %d\n", contar);

    contar       =    contar - 1;
    printf("Contar %d\n", contar);

    contar       =    contar - 1;
    printf("Contar %d\n", contar);

    contar       =    contar - 1;
    printf("Contar %d\n", contar);

    contar -= 1;
    printf("Contar %d\n", contar);



    return 0;
}
