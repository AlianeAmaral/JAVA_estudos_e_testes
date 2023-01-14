import java.util.Scanner;

public class estudo_6_cumprimentos {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Que horas são? (Obs: digitar o número inteiro das horas).");
	int horas = sc.nextInt();
	
	if (horas < 12){
		System.out.println("O cumprimento é: Bom dia!");
	}
	else if (horas >= 12 && horas < 18){
		System.out.println("O cumprimento é: Boa tarde!");
	}
	else if (horas > 18){
		System.out.println("O cumprimento é: Boa noite!");
	}
		
	sc.close();
	}
}
