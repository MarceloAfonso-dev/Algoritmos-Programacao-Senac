import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String corVermelha = "\u001B[31m";
        String corAmarela = "\u001B[33m";
        String corVerde = "\u001B[32m";
        String resetarCor = "\u001B[0m";

        System.out.println("--SISTEMA ESCOLAR--\nInsira 3 notas de um aluno");
        double nota1 = leitor.nextDouble();
        double nota2 = leitor.nextDouble();
        double nota3 = leitor.nextDouble();
        double media = (nota1+nota2+nota3)/3;
        if (media >= 6) {
            System.out.println(corVerde+"Aluno Aprovado!"+resetarCor);
        } else if (media < 5) {
            System.out.println(corVermelha+"Aluno Reprovado!"+resetarCor);
        } else {
            System.out.println("Aluno em Recuperacao!\nInsira a nota da atividade recuperativa");
            double notaRecuperacao = leitor.nextDouble();
            media = (media + notaRecuperacao)/2;
            if (media < 6){
                System.out.println(corVermelha+"Aluno Reprovado!"+resetarCor);
            } else {
                System.out.println(corAmarela+"Aluno Aprovado por Recuperacao"+resetarCor);
            }
        }
    }
}
