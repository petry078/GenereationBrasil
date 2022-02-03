package Exercicio01;

public class SuperClasseAnimal 
{
	
	//ATRIBUTOS//
	private String Nome;
	private int idade;
	
	//MÉTODOS//
	
	public void falar()
	{
		System.out.println("ANIMAL USOU SUA EXPRESSÃO VERBAL (SEJA LÁ QUAL FOR, MAS EMITIU UM SOM).");
	}
	
	//GETTERS E SETTERS//

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	

}
