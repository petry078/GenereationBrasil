/*
 * 05. Crie uma classe patinete e apresente os atributos e 
 * métodos referentes esta classe, em seguida crie um objeto 
 * patinete, defina as instancias deste objeto e apresente 
 * as informações deste objeto no console.
 */


package Exercicio05;

public class ObjetoPatinete {

	public static void main(String[] args) 
	{
	
	System.out.println("PATINETES: \n");
	
	ClassePatinete p1 = new ClassePatinete();
	System.out.println("PATINETE 01:");
	p1.id=66601;
	p1.categoria=("PRAIA");
	p1.paraCriancas=true;
	p1.status();
	p1.patineteCriancaReady();
	
	ClassePatinete p2 = new ClassePatinete();
	System.out.println("PATINETE 02:");
	p2.id=66602;
	p2.categoria="PROFISSIONAL";
	p2.paraCriancas=false;
	p2.status();
	p2.patineteCriancaReady();
	
	ClassePatinete p3 = new ClassePatinete();
	System.out.println("PATINETE 03:");
	p3.id=66603;
	p3.categoria="PASSEIO";
	p3.paraCriancas=true;
	p3.status();
	p3.patineteCriancaReady();
	
	ClassePatinete p4 = new ClassePatinete();
	System.out.println("PATINETE 04:");
	p4.id=66604;
	p4.categoria="PISTA";
	p4.paraCriancas=false;
	p4.status();
	p4.patineteCriancaReady();

	}

}
