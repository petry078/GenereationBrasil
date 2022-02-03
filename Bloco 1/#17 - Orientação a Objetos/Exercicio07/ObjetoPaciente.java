package Exercicio07;

public class ObjetoPaciente 
{
	public static void main(String[] args) 
	{
		ClassePaciente p1 = new ClassePaciente();
		System.out.println("PACIENTE 01: ");
		p1.nome="Anderson Abreu";
		p1.id=666;
		p1.doencas="VAMPIRISMO";
		p1.tratamento=true;
		p1.status();
		p1.tratar();
		
		ClassePaciente p2 = new ClassePaciente();
		System.out.println("PACIENTE 02: ");
		p2.nome="Guilherme";
		p2.id=001;
		p2.doencas="VAMPIRISMO";
		p2.tratamento=false;
		p2.status();
		p2.tratar();
		
	}	
}
