import java.util.Scanner;

public class testando_if_else {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Digite um n�mero inteiro, sendo ele negativo ou positivo: ");
	int x = sc.nextInt();
	
	System.out.println();
	
	if (x < 0) {
		System.out.println("O n�mero digitado � um valor NEGATIVO.");
		
	}
	
	else {
		System.out.println("O n�mero digitado � um valor POSITIVO.");
	
	}
	
	sc.close();
	
	}

}
