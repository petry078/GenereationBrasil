package Exercicio02;

public class ClasseAviao 
{
	int id;
	String modelo;
	int ano;
	boolean manutencao;

	public void manutencaoM()
	{
		if (this.manutencao == true)
		{
		System.out.println("Aeronave em condições para voar.\n");
		}
		else
		{
		System.out.println("Atenção! Aeronave não pode deixar o solo sem manutenção.\n");
		}
	}
	
	public void status()
	{
		System.out.println("ID: " + this.id);
		System.out.println("MODELO: " + this.modelo);
		System.out.println("ANO: " + this.ano);
		System.out.println("PRECISA DE MANUTENÇÃO? " + this.manutencao);
		
	}
	
}
