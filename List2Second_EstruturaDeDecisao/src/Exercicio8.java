import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("--Verificador de Triangulo\nInsira os valores de X, Y e Z");
        double x = leitor.nextDouble();
        double y = leitor.nextDouble();
        double z = leitor.nextDouble();
        System.out.println(classificadorTriangulo(x,y,z));

    }

    public static String classificadorTriangulo(double x,double y,double z){
            if (x + y > z && x + z > y && y + z > x){
                if (x == y && y == z){
                    return "E um triangulo equilatero";
                } else if (x == y || y == z || x == z){
                    return "E um triangulo isosceles";
                } else{
                    return "E um triangulo escaleno";
                }
            } else {
                return "Os valores nao formam um triangulo!";
            }
    }
}
