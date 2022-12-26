import java.util.Scanner;

public class dia_semana_if_else_if {

	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número para o dia da semana, de 1 até 7: ");
		int numero = sc.nextInt();
		String dia;

		if (numero == 1) {
			dia = "DOMINGO.";
		}
		else if (numero == 2) {
			dia = "SEGUNDA-FEIRA.";
		}
		else if (numero == 3) {
			dia = "TERÇA-FEIRA.";
		}
		else if (numero == 4) {
			dia = "QUARTA-FEIRA.";
		}
		else if (numero == 5) {
			dia = "QUINTA-FEIRA.";
		}
		else if (numero == 6) {
			dia = "SEXTA-FEIRA.";
		}
		else if (numero == 7) {
			dia = "SÁBADO.";
		}
		else { 
			dia = "NÚMERO INVÁLIDO.";
		}
		System.out.println("Dia da Semana: " + dia);
		sc.close();
	} 
}
