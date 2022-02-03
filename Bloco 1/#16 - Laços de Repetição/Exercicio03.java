/*
 * 03. Solicitar a idade de várias pessoas e imprimir: 
 * - Total de pessoas com menos de 21 anos. 
 * - Total de pessoas com mais de 50 anos. 
 * - O programa termina quando idade for =-99. (WHILE)
 */

import java.util.Scanner;

public class Exercicio03 
{

	public static void main(String[] args) 
	{
		int x, n21=0, n50=0;
		Scanner bruno = new Scanner(System.in);
		
		System.out.println("PESQUISA DE IDADES \nPara sair insira -99 no campo abaixo.");
		
		System.out.print("\nIdade: ");
		x = bruno.nextInt();
		
		while (x!=-99)
		{
			if (x<21)
				n21++;
			if (x>50)
				n50++;
			
		System.out.print("Idade: ");
		x = bruno.nextInt();	
			
		}
			
		System.out.println("O número de participantes com menos de 21 anos foi: " + n21);
		System.out.println("O número de participantes com mais de 50 anos foi: " + n50);
		
	//FIM DO PROGRAMA//
	}

}
