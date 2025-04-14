package Ex1;

public class Livro {
	private String titulo ;
    private String autor ;
    private int anoPublicacao;
    
    // CONSTRUTOR
    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
    
    //GETTERS
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
    public double getAnoPublicacao() {
        return anoPublicacao;
    }

    //SETTERS
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    
    //MÉTODO PARA VER INFORMAÇÕES
    public void interf(){
        System.out.println("");
        System.out.println("-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-");
        System.out.println("       LIVROS - BIBLIOTECA");
        System.out.println("-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-");
        System.out.println("Livros Disponíveis: ");
        System.out.println("\n - "+ titulo);
        System.out.println("--------------------------------");
        System.out.println("SELECIONE UMA OPÇÃO: ");
        System.out.println("\n[1] Exibir informações\n[2] Sair\n");
    }
    //MÉTODO EXIBIR INFORMAÇÕES
    public void exibirInformacoes(){
        System.out.println("-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-");
        System.out.println("Titulo:"+ titulo);
        System.out.println("Autor: "+autor );
        System.out.println("Ano de Publicação:"+ anoPublicacao);
        System.out.println("--------------------------------");
    }
}
