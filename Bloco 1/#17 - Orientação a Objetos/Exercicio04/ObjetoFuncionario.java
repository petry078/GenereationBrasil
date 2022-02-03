package Exercicio04;

public class ObjetoFuncionario {

	public static void main(String[] args) 
	{
		System.out.println("STATUS DOS FUNCIONÁRIOS:\n");
		
		ClasseFuncionario f1 = new ClasseFuncionario();
		System.out.println("FUNCIONÁRIO 01:");
		f1.nome="Fidelso";
		f1.id=66601;
		f1.setor=0;
		f1.status();
		f1.trocaSetor();
		System.out.println("\n");
		
		ClasseFuncionario f2 = new ClasseFuncionario();
		System.out.println("FUNCIONÁRIO 02:");
		f2.nome="Filho do Fidelso";
		f2.id=66602;
		f2.setor=1;
		f2.status();
		f2.trocaSetor();
		System.out.println("\n");
		
		ClasseFuncionario f3 = new ClasseFuncionario();
		f3.nome="O outro filho de Fidelso";
		f3.id=66603;
		f3.setor=7;
		f3.status();
		f3.trocaSetor();
		System.out.println("\n");
		
		ClasseFuncionario f4 = new ClasseFuncionario();
		f4.nome="Fidelsen Ramos";
		f4.id=66604;
		f4.setor=0;
		f4.status();
		f4.trocaSetor();
		System.out.println("\n");


	}

}
