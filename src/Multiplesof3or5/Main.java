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
	 * M�todo main. Invoca os m�todos para gera��o da lista de n�meros e do c�lculo
	 * do somat�rio final.
	 */

	public static void main(String[] args) {

		List<Integer> numeros = new ArrayList<>();

		int somafinal = 0;

		numeros = gerarLista();
		somafinal = somarValores(numeros);

		System.out.println("Resultado Final: " + somafinal);
	}

	/**
	 * M�todo para retorno da listagem de n�meros divis�veis por 3 ou 5 abaixo de
	 * 1000.
	 * 
	 * @return List<Integer> - Lista de n�meros
	 */

	public static List<Integer> gerarLista() {

		List<Integer> listanumeros = new ArrayList<>();

		for (int i = 0; i < 1000; i++) {

			if ((i % 3 == 0) || (i % 5 == 0)) {

				listanumeros.add(i); // Armazenando na lista os n�meros (de 0 a 999) divis�veis por 3 ou 5.
			}

		}

		return listanumeros;
	}

	/**
	 * M�todo para retorno do somat�rio de itens da lista de n�meros.
	 * 
	 * @param Lista de n�meros - List<Integer>
	 * @return int - Somat�rio de itens da lista
	 */

	public static int somarValores(List<Integer> numeros) {

		int soma = 0;

		for (Integer n : numeros) {

			soma += n.intValue(); // Somando os itens da lista de n�meros.
		}

		return soma;
	}

}
