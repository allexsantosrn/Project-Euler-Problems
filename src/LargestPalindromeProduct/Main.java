package LargestPalindromeProduct;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem: A palindromic number reads the same both ways. The largest
 * palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 * @author Alexandre
 *
 */

public class Main {

	/**
	 * 
	 * Método main. Invoca o métodos para geração da lista de palíndromos e da busca
	 * do maior palíndromo existente.
	 */

	public static void main(String[] args) {

		List<Integer> palindromos = new ArrayList<Integer>();

		int nummax = 0;

		palindromos = gerarLista();

		nummax = retornaValorMaximo(palindromos);

		System.out.println(nummax);

	}

	/**
	 * Método para retorno da listagem de números palíndromos.
	 * 
	 * @return List<Integer> - Lista de números palíndromos
	 */

	private static List<Integer> gerarLista() {

		int numero = 0;

		List<Integer> listanumeros = new ArrayList<Integer>();

		for (int i = 100; i < 1000; i++) {

			for (int j = 100; j < 1000; j++) {

				numero = i * j;

				if (isPalindromo(numero)) {

					listanumeros.add(numero); // Adicionando número palíndromo a lista de números.
				}
			}

		}

		return listanumeros;
	}

	/**
	 * Método que verifica se um número é palíndromo.
	 * 
	 * @param Número - int
	 * @return boolean = true ou false
	 */

	private static boolean isPalindromo(int numero) {

		String s1, s2;

		s1 = String.valueOf(numero);

		s2 = inverterString(s1);

		if (s1.equals(s2)) {

			return true; // Retorna true caso as strings s1 e s2 sejam iguais.
		}

		else {

			return false;
		}

	}

	/**
	 * Método que realiza a inversão de uma string.
	 * 
	 * @param s1 - String
	 * @return String - Palavra inversa
	 */

	private static String inverterString(String s1) {

		String s2 = "";

		for (int i = s1.length() - 1; i >= 0; i--) {

			s2 += s1.charAt(i); // Monta uma string com os caracteres da string repassada.
		}

		return s2;

	}

	/**
	 * Método para retorno do maior valor da lista de números.
	 * 
	 * @param palindromos - List<Integer>
	 * @return int - Maior número da lista
	 */

	private static int retornaValorMaximo(List<Integer> palindromos) {

		int maior = 0;

		for (Integer n : palindromos) {

			if (n > maior) {
				maior = n; // Atualiza o maior valor, caso o número obtido seja maior.
			}

		}

		return maior;

	}
}