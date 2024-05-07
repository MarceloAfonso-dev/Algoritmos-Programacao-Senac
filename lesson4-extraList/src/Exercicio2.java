import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroRecebivel;

        System.out.println("Digite um numero inteiro entre 1 e 100");
        numeroRecebivel = leitor.nextInt();

        System.out.println(numeroRecebivel >= 1 && numeroRecebivel <= 100 ? "Esta dentro da faixa" : "Esta fora da faixa");
    }
}
