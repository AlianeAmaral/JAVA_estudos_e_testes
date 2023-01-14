import java.util.Scanner;

public class estudo_7_franquia_celular_atribuicao_cumulativa {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);

	System.out.println("Quantos minutos da franquia foram utilizados?");
	int minutosConsumo = sc.nextInt();
	double excedente;
	
	if (minutosConsumo <= 100) {
		System.out.println("Valor a Pagar: R$ 50,00");
	}
	else if (minutosConsumo > 100) {
		excedente = ((minutosConsumo - 100) * 2) + 50;
		
		// ou pode-se usar também: 
		// double conta = 50;
		
		// conta = conta + (minutos - 100) * 2; ou também
		// conta += (minutos - 100) * 2;
		
		System.out.printf("Valor a Pagar: R$ %.2f %n", excedente);
	}
	
	sc.close();
	}
}
