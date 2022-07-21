import java.util.Scanner;

public class criacao_1_media_avaliacoes_aluno {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Insira o nome do aluno(a): ");
	String nome = sc.nextLine();
	
	System.out.println();
	System.out.println("Insira o nome da disciplina: ");
	String disciplina = sc.nextLine();
	
	System.out.println();
	System.out.println("Insira a nota da Avaliação 1: ");
	double AV1 = sc.nextDouble();
	
	System.out.println();
	System.out.println("Insira a nota da Avaliação 2: ");
	double AV2 = sc.nextDouble();
	
	System.out.println();
	System.out.println("Insira a nota da Avaliação 3: ");
	double AV3 = sc.nextDouble();
	
	double media = (AV1 + AV2 + AV3) / 2;
	
	System.out.println();
	System.out.println("A nota média do aluno(a) " + nome + " na disciplina " + disciplina + " é " + media);
	
	sc.close();

	}

}
