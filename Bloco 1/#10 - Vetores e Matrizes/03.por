/*
 * Crie um programa que receba valores do usuário para preencher uma matriz 3X3,
 * e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
 * diagonal, ou seja, diagonal principal.
 */

programa
{
    
    funcao inicio()
    {
        inteiro m[3][3], x=0, linha=0, coluna=0, somad=0, soma=0
        
        para (linha=0; linha<3; linha++)
        {
            para (coluna=0; coluna<3; coluna++)
            {
                escreva("Defina os valores da matriz: ")
                leia(m[linha][coluna])
                
            }
        }

        soma= (m[0][0] + m[0][1] + m[0][2]) + (m[1][0] + m[1][1] + m[1][2]) + (m[2][0] + m[2][1] + m[2][2])
        somad= m[0][0] + m[1][1] + m[2][2]
        
        escreva("A soma da primeira diagonal e: ", somad)
        escreva("A soma dos valores dessa matriz e: ", soma)
        
        

        
    }
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 893; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */