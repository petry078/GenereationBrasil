/*
 * 6) Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
 * Infantil A = 5 a 7 anos
 * Infantil B = 8 a 11 anos
 * Juvenil A = 12 a 13 anos
 * Juvenil B = 14 a 17 anos
 * Adultos = Maiores de 18 anos
 *
 */

programa
{
    
    funcao inicio()
    {
    real idade

    escreva("Qual é a idade do nadador? ")
    leia(idade)

    se (idade <= 4)
    escreva("Muito novinho ainda pra nadar, não acha?")
    
    se (idade == 5 ou idade == 6 ou idade == 7)
    escreva("Nadador pertence a categoria Infantil A.")

    se (idade == 8 ou idade == 9 ou idade == 10 ou idade == 11)
    escreva("Nadador pertence a categoria Infantil B.")

    se (idade == 12 ou idade == 13)
    escreva("Nadador pertence a categoria Juvenil A.")

    se (idade == 14 ou idade == 15 ou idade == 16 ou idade == 17)
    escreva("Nadador pertence a categoria Juvenil B.")

    se (idade >= 18)
    escreva("Nadador pertence a categoria Adulto.")
    }
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 977; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */