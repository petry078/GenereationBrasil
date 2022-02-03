/*
 * 04. Crie uma classe funcionário e apresente os atributos e 
 * métodos referentes esta classe, em seguida crie um objeto 
 * funcionário, defina as instancias deste objeto e apresente 
 * as informações deste objeto no console.
 */


package Exercicio04;

public class ClasseFuncionario 
{
	String nome;
	int setor;
	int id;
	
	public void trocaSetor()
	{
		if (this.setor == 0)
			{
			System.out.println("FUNCIONÁRIO AINDA SEM SETOR DEFINIDO.");
			}
				else
				{
				System.out.println("FUNCIONÁRIO COM SETOR DEFINIDO, APTO PARA COMEÇAR O TRABALHO.");	
				}
	}
	
	public void status()
	{
		System.out.println("NOME: " + this.nome);
		System.out.println("SETOR: " + this.setor);
		System.out.println("ID: " + this.id);
	}
}
