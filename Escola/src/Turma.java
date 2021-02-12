import java.util.ArrayList;

public class Turma {
	
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	
	private int numero;
	private String nome;
	private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	private ArrayList<Professor> professores = new ArrayList<Professor>();
	
		
	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================
	
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	
	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	public ArrayList<Professor> getProfessores() {
		return professores;
	}
	
	public void setProfessores(ArrayList<Professor> professores) {
		this.professores = professores;
	}

	

	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================
  
  
	    // CONSTRUTOR DEFAULT
      
      
	    // CONSTRUTOR COM PARÂMETROS
      
      
	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================
	
	public void AdicionarAluno (Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	public void AdicionarProfessor (Professor professor) {
		this.professores.add(professor);
	}
	
	public int NumeroDeAlunos() {
		return this.alunos.size();
	}
	
	public int NumeroDePessoas() {
		return this.alunos.size() + this.professores.size();
	}
  
  
	// =======================================================
	// ============== MÉTODOS COMPLEMENTARES ==============
	// =======================================================
	
  
	    // ----> toString()
		@Override
		public String toString() {
			return "Turma [numero=" + numero + ", nome=" + nome + ", alunos=" + alunos + ", professores=" + professores
					+ "]";
		}
	
  
	
	    // ----> equals()

}
