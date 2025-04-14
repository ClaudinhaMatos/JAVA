package Ex2;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		
		// DECLARA ATRIBUTOS
		String nome;
		String matricula;
		double nota;
		
		// NOME DO ALUNO
		System.out.println("Digite o nome do aluno:");
		nome = scan.nextLine();
		
		// NÚMERO DE  MATRÍCULA
		System.out.println("\nDigite o nº de matricula:");
		matricula = scan.nextLine();
		
		// NOTA
		System.out.println("\nDigite a nota:");
		nota = scan.nextDouble();		
		
		// INSERE NA CLASSE E CHAMA MÉTODO DE EXIBIÇÃO
		Aluno meuAluno = new Aluno(nome,matricula,nota);
        meuAluno.exibirDados();
		
		scan.close();				

	}
}
