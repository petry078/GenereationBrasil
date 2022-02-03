/*
 * 04. Uma empresa desenvolveu uma pesquisa para saber as 
 * características psicológicas dos indivíduos de uma região. 
 * Para tanto, a cada uma das pessoas era perguntado: 
 * idade, sexo (1-feminino / 2-masculino / 3-Outros), 
 * e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 
 * 3, se a pessoa era agressiva). 
 * 
 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, 
 * calcule e mostre: (WHILE)
 * 
 * - o número de pessoas calmas; 
 * - o número de mulheres nervosas; 
 * - o número de homens agressivos; 
 * - o número de outros calmos;
 * - o número de pessoas nervosas com mais de 40 anos; 
 * - o número de pessoas calmas com menos de 18 anos.
 */

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) 
	
	{ 
		int participantes=0;
		
		int idade, sexo, caracteristica; //Sexo: (1) Feminino/ (2) Masculino/ (3) Outro //
									     //Características: (1) Calmo/ (2)Nervoso/ (3)Agressivo //
		//Variáveis especiais//
		int pCalma=0, pNervosa=0, pAgressiva=0;
		
		//Variáveis mais que especiais//
		int mNervosas=0, hAgressivos=0, oCalmos=0, pNervosas40mais=0, pCalmas18menos=0;
		
		//Scanner
		Scanner bruno = new Scanner (System.in);
		
		while (participantes < 150)
		{
			participantes++;
		
		//Coleta de dados dos participantes//
		
		System.out.println("Idade do participante: ");
		idade = bruno.nextInt();
		
		System.out.println("Sexo do participante [(1) Feminino/ (2) Masculino/ (3) Outro]:  ");
		sexo = bruno.nextInt();
		
		System.out.println("Característica do participante [(1) Calmo/ (2)Nervoso/ (3)Agressivo]: " );
		caracteristica = bruno.nextInt();
		
		//Somador de características//
		
		if (caracteristica == 1)
				pCalma++;
		if (caracteristica == 2)
				pNervosa++; 
		if (caracteristica == 3)
				pAgressiva++;
		
		//Somador das variáveis especiais//
		if (sexo == 1 && caracteristica == 2)
				mNervosas++; 
		
		if (sexo == 2 && caracteristica == 3)
				hAgressivos++; 
		
		if (sexo == 3 && caracteristica == 1)
				oCalmos++; 
		
		if (idade <= 40 && caracteristica == 2)
				pNervosas40mais++; 
		
		if (idade >=18 && caracteristica == 1)
				pCalmas18menos++;
		
		}
		System.out.println("Quantidade de participantes calmos: " + pCalma);
		System.out.println("Quantidade de mulheres nervosas: " + mNervosas);
		System.out.println("Quantidade de homens agressivos: " + hAgressivos);
		System.out.println("Quantidade de não binários calmos: " + oCalmos);
		System.out.println("Quantidade de pessoas nervosas com mais de 40 anos: " + pNervosas40mais);
		System.out.println("Quantidade de pessoas calmas com menos de 18 anos: " + pCalmas18menos);
	//FIM DO PROGRAMA//
	}

}
