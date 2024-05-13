import java.time.Year;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//JAVADOC NOS METODOS!!

//UTILIZAR RANDOM PARA PREENCHIMENTO DE DADOS NAS QUESTÕES 13, 15. RANDOM COMO GLOBAL E ADICIONALAS DENTRO DE CADA MÉTODO DE EXERCICIO.

public class ListOfExercise3 {

	static Scanner leitor = new Scanner(System.in);
	static Random gerador = new Random();
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

	case 9 ->{ numberSign(); }

	case 10 ->{ System.out.println(studentGrading()); }

	case 11 ->{ tax(); }

	case 12 ->{ gerarSerie(14); }

	case 13 ->{ Jogadores.dados();	}

	case 14 ->{ numerosInteiros();	}

	case 15 ->{	numerosAte15(); }

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
	
	public static void numberSign() {
		int quantidadeNegativo = 0;
		int SomaPositivo = 0;
		int numero = 1;
		System.out.println("Insira números inteiros ou 0 para parar.");
		while (numero != 0) {
			numero = leitor.nextInt();
			
			if(numero > 0) {
				SomaPositivo += numero;
			}
			
			if (numero < 0) {
				quantidadeNegativo++;
			}
		}
		System.out.printf("Soma dos números positivos: %d\nQuantidade de números negativos: %d",SomaPositivo,quantidadeNegativo);
	}
	
	public static String studentGrading() {
		String classificacao;
		double nota = 0;
		System.out.println("Insira sua nota:");
		do {
			nota = leitor.nextDouble();
			if (nota < 0 || nota > 10) {
				System.err.println("Valor inválido! Digite novamente.");
			}
		} while(nota < 0 || nota > 10);
		classificacao = nota < 5 ? "Reporvado!" : nota >= 5 && nota < 6 ?"Recuperação!" : "Aprovado!";
		return classificacao;
	}
	
	public static void tax() {
		int opcao = 0;
		String menu = """
				---- Menu de Opções ----
				1. Imposto
				2. Novo salário
				3. Classificação
				4. Finalizar o programa
				Digite a opção desejada
				------------------------
					""";
		
	    do {
	        System.out.println(menu);
	        opcao = leitor.nextInt();
	        if (opcao < 1 || opcao > 4) {
	            System.err.println("Valor inválido!");
	            continue;
	        }
			
			switch (opcao) {
			case 1, 2, 3 ->{
				double salario = 0;
				System.out.println("Insira um salário");
				salario = leitor.nextDouble();
				
				switch (opcao) {
				case 1 ->{
					double imposto = 0.0;
					imposto = salario <= 1500.00 ? salario * 0.05 : salario <= 3000.00 ? salario * 0.10 : salario * 0.15; 
					System.out.printf("O valor de imposto de acordo com as regras é R$%.2f\n",imposto);
				}
				case 2 ->{
					double novoSalario = 0.0;
					novoSalario = salario < 2000.01 ? salario + 130.0 : salario < 3000.00 ? salario + 150.0 : salario <= 4500.00 ? salario + 200.00 : salario + 250.00;
					System.out.printf("Seu novo salário é R$%.2f\n",novoSalario);
				}
				case 3 ->{
					String classificacao = "";
					classificacao = salario <= 3000.00 ? "Mal remunerado!" : "Bem remunerado!";
					System.out.printf("Sua classificação é: %s\n",classificacao);
				}
			}	
			}
			}
		} while(opcao != 4);
	}	
	
    public static void gerarSerie(int numTermos) {
        int a = 2, b = 7, c = 3;
        for (int i = 1; i <= numTermos; i++) {
            if (i % 3 == 1) {
                System.out.print(a + ", ");
                a *= 2;
            } else if (i % 3 == 2) {
                System.out.print(b + ", ");
                b *= 3;
            } else {
                System.out.print(c + ", ");
                c *= 4;
            }
        }
    }
    
    public static class Jogadores{
    	String time;
    	int idade;
    	double peso;
    	double altura;
    	
		public String getTime() {
			return time;
		}
		public void setTime(String time) {
			this.time = time;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public double getPeso() {
			return peso;
		}
		public void setPeso(double peso) {
			this.peso = peso;
		}
		public double getAltura() {
			return altura;
		}
		public void setAltura(double altura) {
			this.altura = altura;
		}
    	
		@Override
		public String toString() {
			return "Jogadores [time=" + time + ", idade=" + idade + ", peso=" + peso + ", altura=" + altura + "]";
		}
		
		public static void dados() {
    		List<Jogadores> listaDeJogadores = new ArrayList<Jogadores>();
    		for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 15; j++) {
		    		Jogadores jogadores = new Jogadores();
		    		
					jogadores.setTime(""+i);
					jogadores.setIdade(gerador.nextInt(70)+1);
					jogadores.setPeso(gerador.nextDouble(50.0)+50.0);
					jogadores.setAltura(gerador.nextDouble(0.99)+1);
					listaDeJogadores.add(jogadores);
				}
    		}
    		
    		analise(listaDeJogadores);	
    	
		}
		
		public static void analise(List<Jogadores> jogadores) {
			System.out.printf("""
					Jogadores menores de idade: %d
					Média de idades por time: %s
					Média de altura dos jogadores: %.2f cm
					Percentual de jogadores acima de 80kg: %.1f%s
							""",contarMenores(jogadores),calcularMediaPorTime(jogadores),calcularMediaAltura(jogadores),calcularPercentualMais80Kg(jogadores),"%");
		}
		
		public static int contarMenores(List<Jogadores> jogadores) {
			int quantidadeJogadores = 0;
			for (Jogadores jogador : jogadores) {
				if (jogador.getIdade() < 18) {
					quantidadeJogadores++;
				}
			}
			return quantidadeJogadores;
		}
		
		public static String calcularMediaPorTime(List<Jogadores> jogadores) {
			double[] somaIdadesPorTime = new double[5];
			int[] contadorPorTime = new int[5];
			
			for (Jogadores jogador : jogadores) {
			    int index = Integer.parseInt(jogador.getTime());
			    somaIdadesPorTime[index] += jogador.getIdade();
			    contadorPorTime[index]++;
			}
			
			double[] mediaPorTime = new double[5];
			for (int i = 0; i < 5; i++) {
			    mediaPorTime[i] = somaIdadesPorTime[i] / contadorPorTime[i];
			}
			
			String mediaPorTimeTexto = String.format("\nTime 1: %.0f\nTime 2: %.0f\nTime 3: %.0f\nTime 4: %.0f\nTime 5: %.0f",
                    mediaPorTime[0], mediaPorTime[1], mediaPorTime[2], mediaPorTime[3], mediaPorTime[4]);
			return mediaPorTimeTexto;
		}
		
		public static double calcularMediaAltura(List<Jogadores> jogadores) {
	        double somaAlturas = 0;
	        for (Jogadores jogador : jogadores) {
	            somaAlturas += jogador.getAltura();
	        }
	        return somaAlturas / jogadores.size();
		}
		
	    public static double calcularPercentualMais80Kg(List<Jogadores> jogadores) {
	        int quantidadeJogadores = 0;
	        for (Jogadores jogador : jogadores) {
	            if (jogador.getPeso() > 80) {
	            	quantidadeJogadores++;
	            }
	        }
	        return ((double) quantidadeJogadores / jogadores.size()) * 100;
	    }
		
    }
    
    public static void numerosInteiros() {
    	System.out.println("Insira somente números inteiros positivos ou negativo para sair.");
    	int numero = 0;
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
    	do {
    		numero = leitor.nextInt();
    		if (numero >= 0) {
    			listaNumeros.add(numero);
    		}
    	}while(numero >= 0);
    	Collections.sort(listaNumeros);
    	
    	System.out.printf("\nMaior número informado: %d \nMenor número informado: %d",
    			listaNumeros.get(listaNumeros.size() - 1), listaNumeros.get(0));
    }
    
    public static void numerosAte15() {
    	System.out.println("Insira 15 números");
    	double entrada = 0;
    	ArrayList<Double> listaNumeros = new ArrayList<Double>();
    	
    	for (int i = 0; i < 15; i++) {
    		entrada = leitor.nextDouble();
    		
    		listaNumeros.add(entrada);
    	}
    	
    	Collections.sort(listaNumeros);
    	
    	double menorNumero = listaNumeros.get(0);
    	
    	double maiorNumero = listaNumeros.get(listaNumeros.size() - 1);
    	
    	double soma = 0;
        for (double numero : listaNumeros) {
            soma += numero;
        }
        double mediaNumeros = soma / listaNumeros.size();
    	
        int contPares = 0;
        int contDiv5 = 0;
        for (double numero : listaNumeros) {
            if (numero % 2 == 0) {
                contPares++;
            }
            if (numero % 5 == 0) {
                contDiv5++;
            }
        }
        
    	System.out.printf("""
    			Menor número: 			%.1f
    			Maior número: 			%.1f
    			Média dos números: 		%.2f
    			Quantidade de pares: 		%d
    			Quantidade divisíveis por 5: 	%d
    				""",menorNumero,maiorNumero,mediaNumeros,contPares,contDiv5);
    }
}