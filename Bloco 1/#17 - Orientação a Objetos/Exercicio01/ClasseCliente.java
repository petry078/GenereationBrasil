/*
 * 01. Crie uma classe cliente e apresente os atributos e 
 * métodos referentes esta classe, em seguida crie um 
 * objeto cliente, defina as instancias deste objeto e 
 * apresente as informações deste objeto no console.
 */

package Exercicio01;

public class ClasseCliente 
//INICIO//
{

	//ATRIBUTOS//
	public String nome;
	public int idade;
	public boolean interessado;
	
	//MÉTODOS//
	public void remarketing()
	{
		if (this.interessado==true)
			System.out.println("CLIENTE APTO PARA RECEBER CAMPANHA DE REMARKETING\n");
		
		else
			System.out.println("CLIENTE NÃO TEM INTERESSE NA EMPRESA. NÃO SUBMETE-LO À CAMPANHAS DE REMARKETING\n");
		
	}
	
	//APRESENTAÇÃO DE DADOS NO CONSOLE//
	
	public void status()
	{
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade + " anos.");
		System.out.println("Interessado na empresa? " + this.interessado);

	}
	
//FIM//
}
