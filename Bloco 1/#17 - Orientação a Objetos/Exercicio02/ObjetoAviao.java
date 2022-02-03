package Exercicio02;

public class ObjetoAviao {

	public static void main(String[] args) 
	{
	System.out.println("Status das aeronaves: ");
	
	ClasseAviao a1 = new ClasseAviao();
	System.out.println("Aeronave A1: ");
	a1.id=66601;
	a1.modelo="Avião do cão";
	a1.ano=1666;
	a1.manutencao=false;
	a1.status();
	a1.manutencaoM();
	
	ClasseAviao a2 = new ClasseAviao();
	a2.id=66602;
	a2.modelo="Avião sem modelo definido";
	a2.ano=0000;
	a2.manutencao=true;
	a2.status();
	a2.manutencaoM();
	
	ClasseAviao a3 = new ClasseAviao();
	a3.id=00001;
	a3.modelo="Avião bolado";
	a3.ano=2021;
	a3.manutencao=false;
	a3.status();
	a3.manutencaoM();	
		
	}

}
