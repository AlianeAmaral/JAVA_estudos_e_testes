import java.util.Scanner;

public class testando_switch_case {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um n�mero referente da semana, de 1 a 7: ");
		int numero = sc.nextInt();
		String dia;

		switch (numero) {
		case 1:
			dia = "O primeiro dia da semana � DOMINGO.";
			break;
		case 2:
			dia = "O segundo dia da semana � SEGUNDA-FEIRA.";
			break;
		case 3:
			dia = "O terceiro dia da semana � TER�A-FEIRA.";
			break;
		case 4:
			dia = "O quarto dia da semana � QUARTA-FEIRA.";
			break;
		case 5:
			dia = "O quinto dia da semana � QUINTA-FEIRA.";
			break;
		case 6:
			dia = "O sexto dia da semana � SEXTA-FEIRA.";
			break;
		case 7:
			dia = "O s�timo dia da semana � S�BADO.";
			break;
		default:
			dia = "O valor digitado � inv�lido. Digite um n�mero de 1 a 7.";
		}
		
		System.out.println(dia);
		
		sc.close();
	}
}
