import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double numero1, numero2, numero3;
		boolean resultadoEntre = false;
		
		System.out.println("Insira 3 numeros");
		numero1 = leitor.nextDouble();
		numero2 = leitor.nextDouble();
		numero3 = leitor.nextDouble();
		
		//resultadoEntre = (numero3 < numero2 && numero3 > numero1)? true : (numero3 > numero2 && numero3 < numero1) ? true : false ;
		resultadoEntre = (numero3 < numero2 && numero3 > numero1) || (numero3 > numero2 && numero3 < numero1);
		
		if (resultadoEntre) {
			System.out.printf("%.1f esta entre %.1f e %.1f",numero3,numero1,numero2);
		} else {
			System.out.println("O terceiro valor nao esta entre os primeiros 2 iniciais.");
		}
	}
}