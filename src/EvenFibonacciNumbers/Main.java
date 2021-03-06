package EvenFibonacciNumbers;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem: Each new term in the Fibonacci sequence is generated by adding the
 * previous two terms. By starting with 1 and 2, the first 10 terms will be: 1,
 * 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * 
 * By considering the terms in the Fibonacci sequence whose values do not exceed
 * four million, find the sum of the even-valued terms.
 * 
 * @author Alexandre Dantas
 */

public class Main {

	/**
	 * M?todo main. Invoca os m?todos para gera??o da lista de n?meros de Fibonacci
	 * e do c?lculo do somat?rio final.
	 */

	public static void main(String[] args) {

		List<Integer> numeros = new ArrayList<Integer>();

		int somafinal = 0;

		numeros = gerarFibonacci();
		somafinal = somarValores(numeros);

		System.out.println("Resultado Final: " + somafinal);
	}

	/**
	 * M?todo para retorno da listagem de n?meros pares (e abaixo de 4.000) da
	 * sequ?ncia de Fibonacci.
	 * 
	 * @return List<Integer> - Lista de n?meros
	 */

	public static List<Integer> gerarFibonacci() {

		List<Integer> listanumeros = new ArrayList<Integer>();

		int numbase1 = 0;
		int numbase2 = 1;
		int numcalc = 0;

		while (numcalc <= 4000000) {

			numcalc = numbase1 + numbase2;

			numbase1 = numbase2;
			numbase2 = numcalc;

			if ((numcalc <= 4000000) && (numcalc % 2 == 0)) {

				listanumeros.add(numcalc); // Armazenando na lista os n?meros de fibonacci pares menores que 4000000.
			}

		}

		return listanumeros;
	}

	/**
	 * M?todo para retorno do somat?rio de itens da lista de n?meros.
	 * 
	 * @param Lista de n?meros - List<Integer>
	 * @return int - Somat?rio de itens da lista
	 */

	public static int somarValores(List<Integer> numeros) {

		int soma = 0;

		for (Integer n : numeros) {

			soma += n.intValue(); // Somando os itens da lista de n?meros.
		}

		return soma;
	}

}
