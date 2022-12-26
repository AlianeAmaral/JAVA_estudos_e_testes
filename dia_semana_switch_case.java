import java.util.Scanner;

public class testando_switch_case {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número referente da semana, de 1 a 7: ");
		int numero = sc.nextInt();
		String dia;

		switch (numero) {
		case 1:
			dia = "O primeiro dia da semana é DOMINGO.";
			break;
		case 2:
			dia = "O segundo dia da semana é SEGUNDA-FEIRA.";
			break;
		case 3:
			dia = "O terceiro dia da semana é TERÇA-FEIRA.";
			break;
		case 4:
			dia = "O quarto dia da semana é QUARTA-FEIRA.";
			break;
		case 5:
			dia = "O quinto dia da semana é QUINTA-FEIRA.";
			break;
		case 6:
			dia = "O sexto dia da semana é SEXTA-FEIRA.";
			break;
		case 7:
			dia = "O sétimo dia da semana é SÁBADO.";
			break;
		default:
			dia = "O valor digitado é inválido. Digite um número de 1 a 7.";
		}
		System.out.println(dia);
		sc.close();
	}
}
