package Ex4;

public class Produto {
	String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    //GETTERS
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }

    //SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTitulo(double preco) {
        this.preco = preco;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    //INTERFACE(MENU)
    public void interf(int loop){
    	// INTERFACE
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=--=-=-=-=-=");
        System.out.println("            ARCADE GAMES E PERIFÉRICOS");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=--=-=-=-");
        System.out.println("| ITEM                   | PREÇO     | QUANTIDADE |");
        System.out.println("---------------------------------------------------");
        //EXIBIÇÃO DA QUANTIDADE EM ESTOQUE
        if (quantidade >0) {
        	System.out.println("| "+nome + " | R$"+preco + "   |      "+quantidade);
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=--=--=-==-=-");
            System.out.println("SELECIONE A QUANTIDADE:");
        }else {
	        System.out.println("| SINTO MUITO, ITEM ESGOTADO!! Volte mais tarde. \nTe avisaremos quando novas unidades surgirem.");
	        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=--=--=-==-=-");
	        loop=2;
        }
    }

   
    
    //EXIBIR ITEMS NO CARRINHO E VALOR -- FINALIZAR COMPRA
    public void carrinho(int qtd){
        System.out.println("==================================================");
        System.out.println("              CARRINHO DE COMPRAS");
        System.out.println("==================================================");
        System.out.println(" "+ qtd +" x "+nome+" ( R$"+preco+")");
        System.out.println(" \n TOTAL: R$"+ (qtd*preco));
        System.out.println("==================================================");
        System.out.println("Selecione uma opção:");
        System.out.println("[1] Finalizar Compra\n[2] Alterar quantidade\n[3] Cancelar");
    }
    
    //MÉTODO VENDER
    public void vender(int qtd){
    	quantidade -= qtd;
        System.out.println("==================================================");
        System.out.println("                   NOTA FISCAL");
        System.out.println("==================================================");
        System.out.println(" Compra de R$" + (qtd*preco) +" finalizada com sucesso!");
        System.out.println("==================================================");
        System.out.println("Selecione uma opção:");
        System.out.println("[1] Realizar outra compra\n[2] Sair");
    }
    
    
}
