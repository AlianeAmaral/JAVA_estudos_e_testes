import java.util.Scanner;

public class valor_numero_if_else {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Digite um número inteiro, sendo ele negativo ou positivo: ");
	int x = sc.nextInt();
	
	System.out.println();
	
	if (x < 0) {
		System.out.println("O número digitado é um valor NEGATIVO.");	
	}
	if (x == 0) {
		System.out.println("O número digitado é um valor NEUTRO, pois é 0.");	
	}
	else {
		System.out.println("O número digitado é um valor POSITIVO.");
	}
	sc.close();
	}
}
