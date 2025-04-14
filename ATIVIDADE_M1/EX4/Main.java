package Ex4;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

        int qtd;
        int resp;
        int resp2=0;
        int loop=1;
        int i=1;
        int qt;

        Scanner scan = new Scanner(System.in);

        Produto meuProduto = new Produto("Headset RedDragon Rosa",150,4);
        
        do {
        	//EXIBIR INTERFACE
            meuProduto.interf(loop);
            
            qt = meuProduto.getQuantidade();
            
            do {// VERIFICAR SE QUANTIDADE DIGITADA ESÁ DISPONÍVEL EM ESTOQUE
            	qtd = scan.nextInt();
            	
            	if(qtd>qt) {
            		System.out.println(" -> VALOR ACIMA DA QUANTIDADE EM ESTOQUE.");
            		System.out.println("    SELECIONE NOVAMENTE: ");
            	}else {
            		break;
            	}
            }while(true);
            
            do {
	            //CARRINHO
	            meuProduto.carrinho(qtd);
	            resp = scan.nextInt();
	            
	            //DETERMINAR 
	            if (resp==1){// -> FINALIZA A COMPRA
	        		meuProduto.vender(qtd);
	        		resp2 = scan.nextInt();
	        		if (resp2==2) {
	        			break;
	        		}
	            }else if (resp==2){// -> ALTERA QUANTIDADE NO CARRINHO
	            	System.out.println(" -> SELECIONE A NOVA QUANTIDADE:");
	            	
	            	do {// VERIFICAR SE QUANTIDADE DIGITADA ESÁ DISPONÍVEL EM ESTOQUE
	                	qtd = scan.nextInt();
	                	
	                	if(qtd>qt) {
	                		System.out.println(" -> VALOR ACIMA DA QUANTIDADE EM ESTOQUE.");
	                		System.out.println("    SELECIONE NOVAMENTE: ");
	                	}else {
	                		break;
	                	}
	                	
	                }while(true);
	            	
	            } else {// -> ENCERRA
	            	resp2=2;
	            	break;
	            }
	            }while(i==1);
            if(resp2==2) {
            	break;
            }
            
        }while(loop==1);
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=--=--=-==-=-");
    	System.out.println("      OBRIGADA PELAS COMPRAS E VOLTE SEMPRE");
    	System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=--=--=-==-=-");
       
    	scan.close();
    }
}	
	
