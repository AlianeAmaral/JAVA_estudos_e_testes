import java.util.Scanner;

public class estudo_5_desconto_compra_estrutura_ternaria {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Compre até ou mais de R$ 100.00 e ganhe R$ 20,00 de desconto. Aproveite!");
	System.out.println("Digite o valor total da compra: R$ ");
	
	double preco = sc.nextDouble();
	double precoFinal = (preco >= 100.0)? preco-20:preco-0;
	
	System.out.printf("Total da Compra: R$ %.2f %n", precoFinal);
	
	sc.close();
	}
} 
