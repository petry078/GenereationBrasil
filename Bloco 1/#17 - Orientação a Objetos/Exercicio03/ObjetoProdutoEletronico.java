package Exercicio03;

public class ObjetoProdutoEletronico {

	public static void main(String[] args) 
	{
	System.out.println("Status dos produtos eletronicos: ");
	System.out.println("\n");
		
	ClasseProdutoEletronico pe1 = new ClasseProdutoEletronico();
	pe1.categoria="Periférico;";
	pe1.nome="Mousepad HP 120x90;";
	pe1.sku=666016;
	pe1.preco=75.90;
	pe1.danificado=false;
	pe1.status();
	pe1.pDanificado();
	System.out.println("\n");
	
	ClasseProdutoEletronico pe2 = new ClasseProdutoEletronico();
	pe2.categoria="Hardware;";
	pe2.nome="HDD SATA 3 Bruninho Hardwares;";
	pe2.sku=666026;
	pe2.preco=166.60;
	pe2.danificado=true;
	pe2.status();
	pe2.pDanificado();
	System.out.println("\n");
	
	ClasseProdutoEletronico pe3 = new ClasseProdutoEletronico();
	pe3.categoria="Hardware;";
	pe3.nome="Processador AMD Ryzen 5 5600G;";
	pe3.sku=666036;
	pe3.preco=1789.90;
	pe3.danificado=false;
	pe3.status();
	pe3.pDanificado();
	System.out.println("\n");
	
	ClasseProdutoEletronico pe4 = new ClasseProdutoEletronico();
	pe4.categoria="Periférico;";
	pe4.nome="Headset Gamer ASTRO A40;";
	pe4.sku=666046;
	pe4.preco=100.69;
	pe4.danificado=false;
	pe4.status();
	pe4.pDanificado();
	System.out.println("\n");
	
	}

}
