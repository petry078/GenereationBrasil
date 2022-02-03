programa
{
    
    funcao inicio()
    {
        real n1, n2, n3, media
        real pesoN1 = 2
        real pesoN2 = 3
        real pesoN3 = 5

        escreva("N1 (peso 2): ")
        leia(n1)

        escreva("N2 (peso 3): ")
        leia(n2)

        escreva("N3 (peso 5): ")
        leia(n3)

        media=(n1*2) + (n2*3) + (n3*5) / (pesoN1 + pesoN2 + pesoN3)

        escreva("Média ponderada: ", media)

    }

        
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 430; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */