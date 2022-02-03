package Exercicio05;

public class ClassePatinete 
{
	int id;
	String categoria;
	boolean paraCriancas;
	
	public void patineteCriancaReady()
	{
		if (this.paraCriancas==true)
		System.out.println("PATINETE INDICADO PARA CRIANÇAS\n");
		else
		System.out.println("PATINETE NÃO É INDICADO PARA CRIANÇAS\n");
	}
	
	public void status()
	{
		System.out.println("ID: " + this.id);
		System.out.println("CATEGORIA: " + this.categoria);
		System.out.println("INDICADO PARA CRIANÇAS? " + this.paraCriancas);
	}
}
