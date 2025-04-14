package Ex3;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

		double resp;
		double valor;
		double loop1;
        double loop = 1;
        int i = 1;

        // CRIAR NOVA CONTA
        Conta minhaConta = new Conta("12345", "João Silva", 1000);

        do{
            //INTERFACE E MENU
            minhaConta.interf();
            
            do {
	            resp = scan.nextDouble();
	            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-==-=-=-=-=-");
	
	            //USUÁRIO SELECIONA OPÇÃO
	            
	            if (resp == 1) {// -> EXIBIR O SALDO
	                System.out.println("OPÇÃO SELECIONADA: Exibir Saldo.");
	                minhaConta.getSaldo(); 
	                break;
	                
	            } else if (resp == 2){// -> DEPOSITAR VALOR
	                System.out.println("OPÇÃO SELECIONADA: Depósito.");
	                System.out.println("-----------------------------");
	                System.out.println("VALOR A SER DEPOSITADO: ");
	                valor = scan.nextDouble();
	                minhaConta.depositar(valor);
	                break;
	                
	            } else if (resp == 3){// -> SACAR VALOR
	                System.out.println("OPÇÃO SELECIONADA: Saque.");
	                System.out.println("--------------------------------------------");
	                System.out.println("SALDO ATUAL: R$" );
	                System.out.println("VALOR A SER SACADO:");
	                do {
	                	
	                	valor = scan.nextDouble();
	                	double saldo = minhaConta.getSald();
	      
			            if (valor<=saldo) {
			            	minhaConta.sacar(valor, i);
			            	break;
			            }else {
			            	System.out.println("Valor de saque inválido ou saldo insuficiente.\nSelecione outro valor: ");
			            }
			    
	                }while(true);
	                break;
	                
	            } else if (resp == 4){// -> CANCELAR
	                System.out.println("OBRIGADA E VOLTE SEMPRE!");
	                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-==-=-=-=-=-");
	                loop=2;
	                
	            } else {
	                System.out.println("Valor inválido. Insira novamente...");
	            }	
            }while(true);

            //DEFINE SE VOLTA AO MENU OU ENCERRA PROGRAMA
            System.out.println("==============================================");
            System.out.println("\nDESEJA VOLTAR AO MENU? \n[1] SIM\n[2] SAIR");
            System.out.println("==============================================");
            do {
            	loop1 = scan.nextDouble();
            	if(loop1>2) {
            		System.out.println("Valor inválido. Insira novamente:");
            	}else {
            		break;
            	}
            }while(true);
            if(loop1 ==2) {
            	loop=2;
            }
            i=1;
        }while(loop==1);

        // AGRADECE E ENCERRA PROGRAMA
        System.out.println("Encerrando...");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-==-=-=-=-=-");
        System.out.println("OBRIGADA E VOLTE SEMPRE!");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-==-=-=-=-=-");
        
        scan.close();
    }
}
