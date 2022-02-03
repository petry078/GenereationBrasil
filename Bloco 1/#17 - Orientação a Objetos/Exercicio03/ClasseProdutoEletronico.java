package Exercicio03;

public class ClasseProdutoEletronico 

{
	String categoria;
	String nome;
	int sku;
	double preco;
	boolean danificado;
	
	public void pDanificado()
	{
		if (this.danificado==true)
		{
		System.out.println("Este equipamente está danificado e precisa de reparos.");
		}
		else
		{
		System.out.println("Equipamento não apresenta defeitos.");
		}
	}
	
	public void status()
	{
		System.out.println("CATEGORIA: " + this.categoria);
		System.out.println("NOME: " + this.nome);
		System.out.println("SKU " + this.preco);
		System.out.println("DANIFICADO: " + this.danificado);
		
	}
	
}
