import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int nota1, nota2, nota3, nota4, qtdeAulas, qtdePresenca;
        String premio;

        System.out.println("--SISTEMA DE PREMIOS ESCOLARES--\nInsira 4 notas de um aluno (0 a 100)");
        nota1 = leitor.nextInt();
        nota2 = leitor.nextInt();
        nota3 = leitor.nextInt();
        nota4 = leitor.nextInt();
        double media= (nota1+nota2+nota3+nota4)/4;
        System.out.println("\nInsira a quantidade de aulas dadas e sua presenca respectivamente");
        qtdeAulas = leitor.nextInt();
        qtdePresenca = leitor.nextInt();

        if (media > 80.0 && qtdePresenca == qtdeAulas){
            premio = "Excursao";
        } else if (media > 80.0 || qtdePresenca == qtdeAulas) {
            premio = "Camiseta";
        } else if (media >= 70.0 && qtdePresenca >= (0.90*qtdeAulas)) {
            premio = "Squeeze";
        } else if (media >= 70.0 || qtdePresenca >= (0.90*qtdeAulas)) {
            premio = "Caneta Personalizada";
        } else {
            premio = "Nao ha premios";
        }
        System.out.printf("De acordo com os requisitos de premio, voce tem direito a: %s",premio);
    }
}
