import java.util.Iterator;

import java.util.Scanner;

//JAVADOC NOS METODOS!!

//UTILIZAR RANDOM PARA PREENCHIMENTO DE DADOS NAS QUESTÕES 13, 15. RANDOM COMO GLOBAL E ADICIONALAS DENTRO DE CADA MÉTODO DE EXERCICIO.

public class ListOfExercise3 {

	

	static Scanner leitor = new Scanner(System.in);

	

	public static void main(String[] args) {

		

	int opcao;

	System.out.println("## LISTA 3 - 15 EXERCICIOS ##");

	System.out.println("\nOlá usuário! \nA seguir digite qual exercício deseja executar:");	

	

	do {

	opcao = leitor.nextInt();

	switch (opcao) {

	case 1 ->{ showDivisiblesOf3(); }

	case 2 ->{ showMultiplesOf10(); }

	case 3 ->{ System.out.println(showSumOfSequence()); }

	case 4 ->{ }

	case 5 ->{ }

	case 6 ->{ }

	case 7 ->{ }

	case 8 ->{ }

	case 9 ->{ }

	case 10 ->{ }

	case 11 ->{ }

	case 12 ->{	}

	case 13 ->{	}

	case 14 ->{	}

	case 15 ->{	}

	default -> { System.err.println("Número inválido, digite novamente!"); }

	}

	}while(opcao < 1 || opcao > 15);

	

	}

	

	public static void showDivisiblesOf3() {

		for(int numero = 50; numero != 9500; numero++) {

			if (numero % 3 == 0) {

				System.out.println(numero);

			}

		}

	}

	

	public static void showMultiplesOf10() {

		for(int numero = 1; numero != 250; numero++) {

			if (numero % 10 == 0) {

				System.out.println(numero + " | Múltiplo de 10!");

			} else { 

				System.out.println(numero);

				}

		}

	}

	

	public static int showSumOfSequence() {

		int soma = 0;

		for (int numero = 1; numero < 100; numero++){

			soma += numero;

		}

		return soma;

	}

}