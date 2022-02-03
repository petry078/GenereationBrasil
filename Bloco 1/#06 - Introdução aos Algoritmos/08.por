programa
{
    
    funcao inicio()
    {
        inteiro precoFabrica
        inteiro precoImposto
        inteiro precoFinal

        escreva("Qual é o preço de fábrica deste carro?")
        leia(precoFabrica)

        escreva("\nO imposto para este veículo é de 73%") //"Imposto" é a soma das duas porcentagens do enunciado.

        precoFinal = (precoFabrica*73)/100 + precoFabrica

        escreva("\nO preço que deve ser cobrado do cliente é: R$", precoFinal)
        
    }
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 485; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */