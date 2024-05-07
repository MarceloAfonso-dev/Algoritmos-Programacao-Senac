import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double altura, peso, imc;
		System.out.println("--CALCULADORA IMC--\nInsira sua altura e peso respectivamente");
		altura = leitor.nextDouble();
		peso = leitor.nextDouble();
		imc = (peso / Math.pow(altura, 2));
		System.out.println("Sua classificacao: " + classificarIMC(imc));
	}

	public static String classificarIMC(double imc) {
		if (imc <= 16.0) {
			return "Magreza Severa";
		} else if (imc <= 17.0) {
			return "Magreza Moderada";
		} else if (imc <= 18.5) {
			return "Magreza Leve";
		} else if (imc <= 25.0) {
			return "Normal";
		} else if (imc <= 30.0) {
			return "Obesidade Leve";
		} else if (imc <= 40.0) {
			return "Obesidade Severa";
		} else {
			return "Obesidade Morbida";
		}
	}
}