import java.util.Scanner;

public class AloMund {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome, cidade;
		int idade;
		
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite seu nome:");
		nome = leitor.nextLine();
		
		System.out.print("Boas vindas, "+nome+"");
		leitor.nextLine();
		
		System.out.print("Digite sua idade:");
		idade = leitor.nextInt();
		
		System.out.print("Digite sua cidade:");
		cidade = leitor.next();
		
		System.out.print("Você é de "+cidade+" e tem "+idade+" anos");
	}

}
