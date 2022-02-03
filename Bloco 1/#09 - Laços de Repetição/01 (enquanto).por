/*
 * 1 (Enquanto) - Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o total do somatório, a média e o total de valores lidos.
 * O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores positivos.
 * Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.
 */

programa
{
    
    funcao inicio()
    {
        inteiro x = 0, soma = 0, media = 0

        enquanto (x==0 e x>=0)
        {
        escreva("Defina x: ")
        leia(x)

        soma=soma+x
        media=soma/x    
        }
        escreva("Soma: ", soma)
        escreva("\nMedia: ", media)
        
    }
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 677; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */