package Exercicio06;

public class ObjetoContaBancaria {

	public static void main(String[] args) 
	{
	ClasseContaBancaria c1 = new ClasseContaBancaria();
	
	c1.cliente=("Anderson Abreu");
	c1.conta=1;
	c1.agencia=1;
	c1.saldo=0;
	c1.status();
	
	System.out.println("DEPOSITAR OU SACAR DINHEIRO? (SE NÃO, INSIRA ZERO EM ABOS CAMPOS).");
	c1.depositar();
	c1.sacar();
	c1.status();
	
	ClasseContaBancaria c2 = new ClasseContaBancaria();
	
	c2.cliente=("Guilherme Petry");
	c2.conta=2;
	c2.agencia=1;
	c2.saldo=0;
	c2.status();
	
	System.out.println("DEPOSITAR OU SACAR DINHEIRO? (SE NÃO, INSIRA ZERO EM ABOS CAMPOS).");
	c2.depositar();
	c2.sacar();
	c2.status();
	
		
		
	}

}
