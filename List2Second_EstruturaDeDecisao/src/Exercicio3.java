import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double nota1, nota2, nota3, nota4, media;
		String nome, classificacao;
		
		System.out.println("--SISTEMA ESCOLAR-- \nDigite seu nome");
		nome = leitor.nextLine();
		System.out.printf("Ola %s, a seguir digite suas 4 notas\n",nome);
		nota1 = leitor.nextDouble();
		nota2 = leitor.nextDouble();
		nota3 = leitor.nextDouble();
		nota4 = leitor.nextDouble();
		media = (nota1+nota2+nota3+nota4)/4;
		
		if(media > 80.0) {classificacao = "Otimo";}
		else if(media <= 80.0 && media > 60.0) {classificacao = "Bom";}
		else if(media <= 60.0 && media > 40.0) {classificacao = "Regular";}
		else if(media <= 40.0 && media > 20.0) {classificacao = "Ruim";}
		else {classificacao = "Pessimo";}
		System.out.printf("""
				Estudante: %s
				Nota 1: %.2f	Nota 3: %.2f
				Nota 2: %.2f	Nota 4: %.2f
				Media: %6.2f	
				Classificacao: 	%s
				""",nome,nota1,nota3,nota2,nota4,media,classificacao);
		
	}
}
