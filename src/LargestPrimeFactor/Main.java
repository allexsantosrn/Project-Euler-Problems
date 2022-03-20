package LargestPrimeFactor;

/**
 * Problem: The prime factors of 13195 are 5, 7, 13 and 29. What is the largest
 * prime factor of the number 600851475143?
 * 
 * @author Alexandre
 *
 */
public class Main {

	public static void main(String[] args) {

		Long num = 600851475143L;

		int maxdiv = 0;

		maxdiv = gerarMaxDiv(num);

		System.out.println("Resultado Final: " + maxdiv);

	}

	public static int gerarMaxDiv(Long numero) {

		Long resto = numero;

		int maxdiv = 0;

		for (int i = 2; i <= numero; i++) {

			if (resto % i == 0) {

				resto = resto / i; //Atualizando o valor do resto.
				
				if (resto == 1) {

					maxdiv = i; //Divisor máximo recebe valor de i.
					break;
				}
				
				i = i - 1; //Fixando o valor do divisor para a próxima iteração.
			}		

		}

		return maxdiv;
	}

}
