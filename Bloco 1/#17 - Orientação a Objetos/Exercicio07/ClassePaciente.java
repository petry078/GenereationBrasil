package Exercicio07;

public class ClassePaciente
{
	String nome;
	int id;
	boolean tratamento;
	String doencas;
	
	public void tratar()
	{
		if (this.tratamento == true)

			System.out.println("PACIENTE TRATANDO: " + this.doencas);	
		else
		
			System.out.println("PACIENTE CURADO. REALIZAR DOCUMENTAÇÃO DE AUTA");
	}
	
	public void status()
	{
		System.out.println("NOME: " + this.nome);
		System.out.println("ID: " + this.id);
		System.out.println("EM TRATAMENTO: " + this.tratamento);
		
		
	}
	
}
