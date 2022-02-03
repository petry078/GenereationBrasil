/*
 * 7) Receber valores de base e altura de um triângulo e verificar se são valores válidos
 * (positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
 *
 */

programa
{
    
    funcao inicio()
    {
        real base, altura, media
        escreva("Valor da altura: ")
        leia(altura)
        
        escreva("Valor da base: ")
        leia(base)

        media = (base * altura) /2

        se (base >= 0 e base >= 0)
        escreva("A área do triangulo é: ", media)
        senao
        {
            escreva("Valores de área e base devem ser positivos")
        }
        
        }
        
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 632; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */