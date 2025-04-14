package Ex3;

public class Conta {
	String numero ;
    String titular ;
    double saldo;

    public Conta(String numero, String titular, double saldo){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public double getSald() {
        return saldo;
    }
    
    // EXIBIR NUMERO DA CONTA E TITULAR
    public void interf() {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("            BANCO UNIVERSIDADE UMC");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-==-=-=-=-=-");
        System.out.println("MENU:");
        System.out.println("");
        System.out.println("[1] Exibir Saldo Atual\n[2] Depositar valor\n[3] Sacar valor\n[4] Sair\n");
        System.out.println(" SELECIONE UMA OPÇÃO:");
    }


    // MÉTODO PARA DEPÓSITO
    public void depositar(double valor) {
        saldo += valor;
        System.out.println(" - DEPÓSITO REALIZADO COM SUCESSO!");
        System.out.println(" -> Seu saldo agora é de R$" +saldo);
    }

    // MÉTODO PARA SAQUE
    public void sacar(double valor, int i) {
		saldo -= valor;
        System.out.println(" - SAQUE REALIZADO COM SUCESSO!");
        System.out.println("  \n -> Seu saldo agora é de R$" + saldo);
  
    }

    // MÉTODO PARA OBTER O SALDO
    public void getSaldo() {
        System.out.println(" -> Seu saldo atual é de R$" + saldo);
    }
    
}
