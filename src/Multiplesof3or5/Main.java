package Multiplesof3or5;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem: If we list all the natural numbers below 10 that are multiples of 3
 * or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23. Find the sum of
 * all the multiples of 3 or 5 below 1000.
 * 
 * @author Alexandre Dantas
 */

public class Main {

	/**
	 * Método main. Invoca os métodos para geração da lista de números e do cálculo
	 * do somatório final.
	 */

	public static void main(String[] args) {

		List<Integer> numeros = new ArrayList<>();

		int somafinal = 0;

		numeros = gerarLista();
		somafinal = somarValores(numeros);

		System.out.println("Resultado Final: " + somafinal);
	}

	/**
	 * Método para retorno da listagem de números divisíveis por 3 ou 5 abaixo de
	 * 1000.
	 * 
	 * @return List<Integer> - Lista de números
	 */

	public static List<Integer> gerarLista() {

		List<Integer> listanumeros = new ArrayList<>();

		for (int i = 0; i < 1000; i++) {

			if ((i % 3 == 0) || (i % 5 == 0)) {

				listanumeros.add(i); // Armazenando na lista os números (de 0 a 999) divisíveis por 3 ou 5.
			}

		}

		return listanumeros;
	}

	/**
	 * Método para retorno do somatório de itens da lista de números.
	 * 
	 * @param Lista de números - List<Integer>
	 * @return int - Somatório de itens da lista
	 */

	public static int somarValores(List<Integer> numeros) {

		int soma = 0;

		for (Integer n : numeros) {

			soma += n.intValue(); // Somando os itens da lista de números.
		}

		return soma;
	}

}
