import java.util.Scanner;

public class estudo_8_desconto_porcentagem_estrutura_ternaria {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);
		
	System.out.println("Compre até ou mais de R$ 500.00 e ganhe 30% de desconto no valor total da compra. Aproveite!");
	System.out.println("Digite o valor total da compra: R$ ");
		
	double preco = sc.nextDouble();
	double precoFinal = (preco >= 500.0)? preco - (preco * 0.30) : preco - 0;
		
	System.out.printf("Total da Compra: R$ %.2f %n", precoFinal);
		
	sc.close();
	}
}
