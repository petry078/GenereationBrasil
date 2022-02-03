package Exercicio02;

public class Main {

	public static void main(String[] args) {
		
		SubClasseCachorro c1 = new SubClasseCachorro();
		SubClasseCavalo c2 = new SubClasseCavalo();
		SubClassePreguica c3 = new SubClassePreguica();
		
		System.out.println("Cachorro: ");
		c1.falar();
		
		System.out.println("Cavalo: ");
		c2.falar();
		
		System.out.println("Preguiça: ");
		c3.falar();

	}

}
