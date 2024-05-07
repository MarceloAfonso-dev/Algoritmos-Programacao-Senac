import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double salarioBruto, salarioLiquido, gratificacao, imposto;

        System.out.println("Insira a seguir salario base e gratificacao de um funcionario");
        salarioBruto = leitor.nextDouble();
        gratificacao = leitor.nextDouble();
        salarioBruto += gratificacao;

        if (salarioBruto < 2500.00) {
            imposto = 0.10;
        } else {
            imposto = 0.15;
        }

        salarioLiquido = salarioBruto - salarioBruto * imposto;
        System.out.printf("O salario bruto: R$ %.2f %nA gratificacao: R$ %.2f %nO imposto: %% %.2f %nO salario liquido: R$ %.2f", salarioBruto, gratificacao, imposto, salarioLiquido);
    }
}
