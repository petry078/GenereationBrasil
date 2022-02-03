package Exercicio06;

import java.util.Scanner;

public class ClasseContaBancaria 
{
	String cliente;
	int conta;
	int agencia;
	double saldo;
	double depositoS;
	double saqueS;
	
	Scanner deposito = new Scanner (System.in);
	Scanner saque = new Scanner(System.in);
	
	
	public void depositar()
	{		
		System.out.println("VALOR DO DEPOSITO? ");
		depositoS = deposito.nextDouble();
		saldo = saldo + depositoS;
		
	}
	
	public void sacar()
	{
		System.out.println("VALOR DO SAQUE? ");
		saqueS = saque.nextDouble();
		saldo = saldo - saqueS;
		
	}
	
	public void status()
	{
		System.out.println("CLIENTE: " + this.cliente);
		System.out.println("CONTA: " + this.conta);
		System.out.println("AGÊNCIA: " + this.agencia);
		System.out.println("SALDO: " + this.saldo);
	}
}
