import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double numero1, numero2, numero3, menor = 0;

		System.out.println("Insira tres numeros");
		numero1 = leitor.nextDouble();
		numero2 = leitor.nextDouble();
		numero3 = leitor.nextDouble();
		
		if (numero1 < numero2 && numero1 < numero3) {
			menor = numero1;
		}
		if (numero2 < numero1 && numero2 < numero3) {
			menor = numero2;
		}
		if (numero3 < numero2 && numero3 < numero1) {
			menor = numero3;
		}
		System.out.printf("%.1f e o menor entre os 3 numeros",menor);
	}
}
