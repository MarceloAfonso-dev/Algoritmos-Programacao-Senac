import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("--PESO IDEAL--\nInsira seu sexo entre M ou F e sua altura em centimetros");
        char sexo = leitor.next().charAt(0);
        double altura = leitor.nextDouble();
        double pesoIdeal = calcularPesoIdeal(altura, sexo);

        if (pesoIdeal != -1) {
            System.out.printf("Seu peso ideal e %.2f",pesoIdeal);
        } else {
            System.out.println("Dados invalidos!");
        }
    }

    public static double calcularPesoIdeal(double altura, char sexo) {
        double pesoIdeal;
        if (sexo == 'M' || sexo == 'm'){
            pesoIdeal = 52+(0.75*(altura-152.4));
        } else if (sexo == 'F' || sexo == 'f'){
            pesoIdeal = 52+(0.67*(altura-152.4));
        } else {
            pesoIdeal = -1;
        }
        return pesoIdeal;
    }
}
