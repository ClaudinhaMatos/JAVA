package Ex1;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//DECLARAR ATRIBUTOS
		int resp;
		
		//REGISTRANDO LIVRO E INFORMAÇÕES
		Livro meuLivro = new Livro("A Volta ao Mundo em 80 Dias", "Júlio Verne", 1873 );
		
		
		//INTERFACE
		meuLivro.interf();
		
		do {
			resp = scan.nextInt();
			
			//CONDICIONAL
			
			if (resp==1) {
				meuLivro.exibirInformacoes(); // -> EXIBIR DADOS
				break;
			}else if (resp==2) { // -> SAIR
				break;
			}else { // -> RESPOSTA INVÁLIDA
				System.out.println("RESPOSTA INVÁLIDA! Tente novamente.");
			}
		}while(true);
		
		System.out.println("=====================================");
		System.out.println("      OBRIGADO E VOLTE SEMPRE!");
		System.out.println("=====================================");
		

		scan.close();
    
	}
	
	
}
