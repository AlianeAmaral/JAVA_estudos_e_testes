import java.util.Scanner;

public class testando_if_elseif {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o n�mero para o dia da semana, de 1 at� 7: ");
		int numero = sc.nextInt();
		String dia;
		
		if (numero == 1) {
			dia = "DOMINGO.";
		}
		
		else if (numero == 2) {
			dia = "SEGUNDA-FEIRA.";
		}
		
		else if (numero == 3) {
			dia = "TER�A-FEIRA.";
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
			dia = "S�BADO.";
		}
		
		else {
			dia = "N�MERO INV�LIDO.";
		}
		
		System.out.println("Dia da Semana: " + dia);
		
		sc.close();

	}

}
