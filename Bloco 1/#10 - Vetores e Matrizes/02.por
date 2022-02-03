/*
 * 2 - Um dado é lançado 10 vezes e o valor correspondente
 * é anotado. Faça um programa que gere um vetor com os
 * lançamentos, escreva esse vetor.
 * A seguir determine e imprima a média aritmética dos
 * lançamentos, contabilize e apresente também quantas
 * foram as ocorrências da maior pontuação.
 */

programa
{
    
    funcao inicio()
    {
        inteiro vet[10], x=0, media=0, maior=0, maiorl=0, aperto=0

        para (x=0;x<10;x++)
        {
            escreva("Insira: ")
            leia(vet[x])        
        
            se (vet[x]>maior)
            {
                maior=vet[x]
                aperto++
            }

        }

        media=(vet[0] + vet[1] + vet[2] + vet[3] + vet[4] + vet[5] + vet[6] + vet[7] + vet[8] + vet[9])/10
        escreva("O maior número desse vetor é: ",maior)
        escreva("\nA média das variáveis desse vetor é: ",media)
        escreva("\nNumero de vezes que apareceu o maior lançamento: ",aperto)
        
    }
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 982; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */