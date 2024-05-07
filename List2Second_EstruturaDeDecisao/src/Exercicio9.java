import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double numero1, numero2, resultado;
        String espaco = "\n";
        System.out.println("""
                ****Menu de Opcoes****
                1. Somar dois numeros
                2. Raiz quadrada de um numero
                3. Elevar um numero a uma pontencia
                ****Digite a opcao desejada****
                """);
        int opcao = leitor.nextInt();

        switch (opcao){
            case(1):
                System.out.println(espaco.repeat(10) + "Insira dois numeros");
                numero1 = leitor.nextDouble();
                numero2 = leitor.nextDouble();
                resultado = numero1 + numero2;
                System.out.printf("A soma entre %.1f e %.1f = %.1f",numero1,numero2,resultado);
                break;
            case(2):
                System.out.println(espaco.repeat(10) +"Insira um numero");
                numero1 = leitor.nextDouble();
                resultado = Math.sqrt(numero1);
                System.out.printf("A raiz quadrada de %.2f = %.2f",numero1,resultado);
                break;
            case(3):
                System.out.println(espaco.repeat(10) +"Insira um numero e sua potencia de elevacao respectivamente");
                numero1 = leitor.nextDouble();
                numero2 = leitor.nextDouble();
                resultado = Math.pow(numero1,numero2);
                System.out.printf("O numero %.1f elevado a %.1f = %.1f",numero1,numero2,resultado);
                break;
            default:
                System.out.println("Opcao invalida");
        }
    }
}