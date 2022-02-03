/*
 * 2 (Para) - Desenvolver um sistema que efetue a soma de todos os números ímpares que são
 * múltiplos de três e que se encontram no conjunto dos números de 1 até 500.
 */

programa
{
    
    funcao inicio()
    {
        inteiro x, resposta = 0
        
        para (x = 3; x <= 500; x++)
        se (x % 3 == 0 e x % 2 != 0)
        {
            resposta = resposta + x
        }
        escreva("\nA soma dos números ímpares e múltiplos de 3 é: " + resposta)
    }
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 477; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */