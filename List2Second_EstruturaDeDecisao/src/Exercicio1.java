import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double numero1, numero2;
		
		System.out.println("Insira 2 numeros");
		numero1 = leitor.nextDouble();
		numero2 = leitor.nextDouble();
		
		if (numero1 == numero2) {System.out.printf("%.1f e %.1f sao iguais",numero1,numero2);}
		else {
			if(numero1 > numero2) {System.out.printf("%.1f e maior que %.1f",numero1,numero2);}else {
				System.out.printf("%.1f e maior que %.1f",numero2,numero1);}
		}
	}
}
