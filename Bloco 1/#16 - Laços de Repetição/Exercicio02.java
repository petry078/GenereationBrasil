/*
 * 02. Ler 10 números e imprimir quantos 
 * são pares e quantos são ímpares. (FOR)
 */

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) 
	
	{
		int x, nPares=0, nImpares=0;
		Scanner bruno = new Scanner (System.in);
	
		for (x=1; x<=10; x++)
		{
			System.out.printf("Defina um valor: ");
			x = bruno.nextInt();
			
			if(x % 2 ==0)
			{
				nPares++;
			}
			else
			{
				nImpares++;
			}

		}
		System.out.printf("Foram definidos " + nPares + " números pares.\n");
		System.out.printf("Foram definidos " + nImpares + " números Impares.");		
		
		
		
	//FIM DO PROGRAMA//
	}

}
