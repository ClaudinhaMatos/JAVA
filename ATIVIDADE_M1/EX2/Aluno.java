package Ex2;

public class Aluno {
	
	// DECLARA ATRIBUTOS
	public String nome;
    public String matricula;
    public double nota;
		
    // INSTÂNCIA NA CLASSE
	public Aluno(String nome, String matricula, double nota){
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }
	
	//GETTERS
    public String getNome() {
        return nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public double getNota() {
        return nota;
    }
    
  	//SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
	
	// MÉTODO PARA EXIBIR OS DADOS DO ALUNO CADASTRADO
    public void exibirDados(){
        System.out.println("");
        System.out.println("-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-");
        System.out.println("        ALUNO CADASTRADO");
        System.out.println("-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-");
        System.out.println("Nome:"+ nome);
        System.out.println("Matricula: "+matricula );
        System.out.println("Nota:"+ nota);
        System.out.println("--------------------------------");
    }
}
