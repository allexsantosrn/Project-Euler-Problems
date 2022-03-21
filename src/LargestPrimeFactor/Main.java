package LargestPrimeFactor;

/**
 * Problem: The prime factors of 13195 are 5, 7, 13 and 29. What is the largest
 * prime factor of the number 600851475143?
 * 
 * @author Alexandre
 *
 */

public class Main {

	/**
	 * 
	 * Método main. Invoca o método para geração do máximo fator comum.
	 */

	public static void main(String[] args) {

		Long num = 600851475143L;

		int maxfat = 0;

		maxfat = gerarMaxFatorPrimo(num);

		System.out.println("Resultado Final: " + maxfat);

	}

	/**
	 * Método para retorno do máximo fator primo do número informado.
	 * 
	 * @param Número - Long
	 * @return int - Máximo fator primo
	 */

	public static int gerarMaxFatorPrimo(Long numero) {

		Long resto = numero;

		int maxfator = 0;

		for (int i = 2; i <= numero; i++) {

			if (resto % i == 0) {

				resto = resto / i; // Atualizando o valor do resto.

				if (resto == 1) {

					maxfator = i; // Divisor máximo recebe valor de i.
					break;
				}

				i = i - 1; // Fixando o valor do divisor para a próxima iteração.
			}

		}

		return maxfator;
	}

}
