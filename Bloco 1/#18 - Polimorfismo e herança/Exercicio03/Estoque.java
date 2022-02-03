package Exercicio03;

import java.util.ArrayList;

public class Estoque {

	public static void main(String[] args) {
		
		String produto;
		
		ArrayList<String> listaEstoque = new ArrayList<>();

//POSIÇÃO//	//ÍTEM//	
		
//0			
		listaEstoque.add("Cimento");
//1		
		listaEstoque.add("Piso");
//2
		listaEstoque.add("Pedra");
//3
		listaEstoque.add("Furadeira");
//4		
		listaEstoque.add("Chave de fenda");
		
//Print estoque//
		System.out.println(listaEstoque);
		
//Removendo dados da lista//
		listaEstoque.remove(3);
		System.out.println(listaEstoque);
		
		listaEstoque.set(0, (" ")); //Não é remover mas queria testar ;D
		System.out.println(listaEstoque);
		
		listaEstoque.removeAll(listaEstoque);
		System.out.println(listaEstoque);
		
//Atualizando os dados da lista//

	 	listaEstoque.add(0, "01Cimento");
		listaEstoque.add(1, "02Piso");
		listaEstoque.add(2, "03Pedra");
		listaEstoque.add(3, "04Furadeira");
		listaEstoque.add(4, "05Chave de fenda");
		System.out.println(listaEstoque);
		
//Apresentando todos os dados//
		System.out.println(listaEstoque);
	
	}

}
