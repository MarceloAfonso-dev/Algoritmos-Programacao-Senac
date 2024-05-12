import java.time.Year;
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

	case 4 ->{ System.out.println("Digite um termo");
			   int termo = leitor.nextInt(); 
			   System.out.println(showSumOfSequence(termo)); }

	case 5 ->{ System.out.println(showSequences()); }

	case 6 ->{ System.out.println("Digite o primeiro e segundo termo respectivamente");
		int primeiroTermo = leitor.nextInt();
		int segundoTermo = leitor.nextInt();
		System.out.println(showSequences());}

	case 7 ->{ System.out.printf("O salário atual do funcionário é R$%.2f",salaryIncrease()); }

	case 8 ->{ 
		System.out.println("Insira o salário de Carlos");
		double salario = leitor.nextDouble();
		System.out.println("Quantidade de meses para o capital de João ultrapassar Carlos: " + numberMonths(salario));
	}

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
		for(int i = 50; i != 9500; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
	}

	public static void showMultiplesOf10() {
		for(int i = 1; i != 250; i++) {
			if (i % 10 == 0) {
				System.out.println(i + " | Múltiplo de 10!");
			} else { 
				System.out.println(i);
				}
		}
	}

	public static int showSumOfSequence() {
		int soma = 0;
		int termo = 100;
		for (int i = 1; i <= termo; i++){
			soma += i;
		}
		return soma;
	}
	
	public static int showSumOfSequence(int termoRecebido) {
		int soma = 0;
		int termo = termoRecebido;
		for (int i = 1; i <= termo; i++){
			soma += i;
		}
		return soma;
	}
	
	public static int showSequences() {
		int soma = 0;
		for(int i = 0;i != 15; i++) {
			soma += 5;
		}
		return soma;
	}
	
	public static int showSequences(int termoInicial,int termoFinal) {
		int soma = 0;
		for(int i = termoInicial;i != termoFinal; i+=5) {
			soma += i;
		}
		return soma;
	}
	
	public static double salaryIncrease() {
		double initialSalary = 1000.00;
		double percentageIncrease = 1.5 / 100;
		int yearOfHiring = 2010;
		int currentYear = Year.now().getValue();
		
		double currentSalary = initialSalary;
		
		for(int year = yearOfHiring + 1; year <= currentYear; year++) {
			if (year == 2011) {
				currentSalary += initialSalary * percentageIncrease;
			} else {
				percentageIncrease *= 2;
				currentSalary += currentSalary * percentageIncrease;
			}
		}
		return currentSalary;
	}
	
	public static int numberMonths(double salario) {
		double carlosSalary = salario; 
		double joaoSalary = carlosSalary / 3;
		int mounth;
		
			for (mounth = 0; carlosSalary >= joaoSalary; mounth++) {
				carlosSalary *= 1.02;
				joaoSalary *= 1.05;
			}
		return mounth;
	}
}