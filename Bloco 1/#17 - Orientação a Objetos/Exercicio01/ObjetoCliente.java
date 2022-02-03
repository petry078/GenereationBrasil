/*
 * 01. Crie uma classe cliente e apresente os atributos e 
 * métodos referentes esta classe, em seguida crie um 
 * objeto cliente, defina as instancias deste objeto e 
 * apresente as informações deste objeto no console.
 */

package Exercicio01;

public class ObjetoCliente {

	public static void main(String[] args) 
	//INÍCIO//
	{ 
	System.out.println("Status do cliente:\n ");
	
	//CLIENTE 01//
		ClasseCliente c1 = new ClasseCliente();
		c1.nome="Anderson Abreu";
		c1.idade=18;
		c1.interessado=true;
		c1.status();
		c1.remarketing();
		
	//CLIENTE 02//
		ClasseCliente c2 = new ClasseCliente();
		c2.nome="Fernanda";
		c2.idade=18;
		c2.interessado=false;
		c2.status();
		c2.remarketing();
		
	//CLIENTE 03//
		ClasseCliente c3 = new ClasseCliente();
		c3.nome="Guilherme Petry";
		c3.idade=24;
		c3.interessado=true;
		c3.status();
		c3.remarketing();
		
	//FIM//
	}

}
