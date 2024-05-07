import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double salario;

		System.out.println("Insira o salario de um funcionario");
		salario = leitor.nextDouble();
		System.out.printf("Seu novo salario acrescido de bonificacao e auxilio escola e de R$%.2f",calcularNovoSalario(salario));

	}

	public static double calcularNovoSalario(double salario){
		double bonificacao, auxilioEscola;
			if (salario <= 2000.00){ bonificacao = 1.10; }
			else if (salario <=3000.00){ bonificacao = 1.08; }
			else { bonificacao = 1.05; }

			if (salario <= 2500.00){ auxilioEscola = 350.00; }
			else { auxilioEscola = 300.00; }
		return salario*bonificacao+auxilioEscola;
	}
}
