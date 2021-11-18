#include <stdio.h>
#include <stdlib.h>

int main1()
{

    int cafe_na_xicara = 14;
    int copo_coca = 10;

    int xicara_vazia = cafe_na_xicara < 5;  // Booleano (Verdadeiro(1) ou Falso(0))
    int xicara_cheia = cafe_na_xicara > 90; // Booleano (Verdadeiro(1) ou Falso(0))
    int copo_cheio = copo_coca > 90;   // Falso (0)
    int copo_vazio = copo_coca < 10;  // Verdadeiro (1)


    int buscar_cafe_na_cozinha = (xicara_vazia == 1);  // Falso (0)
    int buscar_coca_cola_na_cozinha = (copo_vazio == 1);   // Verdadeiro


    int ir_cozinha = buscar_cafe_na_cozinha ^ buscar_coca_cola_na_cozinha;
    int ficar_no_quarto = ! ir_cozinha;

    printf("Ir a cozinha ==> %d \n", ir_cozinha);
    printf("Ficar no quarto ==> %d \n", ficar_no_quarto);
    return 0;
}
