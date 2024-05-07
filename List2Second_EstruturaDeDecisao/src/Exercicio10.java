import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int horaInicio, horaFim, minutoInicio, minutoFim;
        //Formato 24h
        System.out.println("--CALCULADORA DE JOGO--\nHorario de Inicio");

        do {
            System.out.println("Insira a hora de inicio (entre 0 e 23):");
            horaInicio = leitor.nextInt();
        } while (horaInicio < 0 || horaInicio > 23);

        do {
            System.out.println("Insira os minutos de inicio (entre 0 e 59):");
            minutoInicio = leitor.nextInt();
        } while (minutoInicio < 0 || minutoInicio > 59);

        System.out.println("\nHorario de Termino");

        do {
            System.out.println("Insira a hora de termino (entre 0 e 23):");
            horaFim = leitor.nextInt();
        } while (horaFim < 0 || horaFim > 23);

        do {
            System.out.println("Insira os minutos de termino (entre 0 e 59):");
            minutoFim = leitor.nextInt();
        } while (minutoFim < 0 || minutoFim > 59);

        int duracaoTotalMinutos = (horaFim * 60 + minutoFim) - (horaInicio * 60 + minutoInicio);
        int duracaoHora = duracaoTotalMinutos / 60;
        int duracaoMinuto = duracaoTotalMinutos % 60;

        if (duracaoMinuto < 0) {
            duracaoHora--;
            duracaoMinuto += 60;
        }

        if (duracaoHora < 0) {
            duracaoHora += 24;
        }

            System.out.printf("A duracao do jogo foi de %dh%dmin",duracaoHora,duracaoMinuto);
    }
}