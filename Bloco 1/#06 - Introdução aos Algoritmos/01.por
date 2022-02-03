programa
{
    
    funcao inicio()
    {
        inteiro anos, meses, dias //declaração de variáveis
        inteiro ano = 365
        inteiro mes = 30

        escreva("Quantos anos você tem?")
        leia (anos)//entrada de dados

        escreva("Quantos meses você tem?")
        leia (meses)

        escreva("Quantos dias você tem?")
        leia (dias)

        dias=dias + (anos*ano) + (meses*mes)
        escreva("Você tem: ", dias)

    }
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */