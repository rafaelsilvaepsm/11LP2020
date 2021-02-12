
public class Professor {

	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	
	private int numero;
	private String nome;
	private String localidade;
	private String disciplina;
	
		
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
	
	public String getLocalidade() {
		return localidade;
	}
	
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}
	
	public String getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	

	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================
  
  
	    // CONSTRUTOR DEFAULT
      
      
	    // CONSTRUTOR COM PARÂMETROS
      
      
	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================
  
  
	// =======================================================
	// ============== MÉTODOS COMPLEMENTARES ==============
	// =======================================================
	
  
	    // ----> toString()
		@Override
		public String toString() {
			return "Professor [numero=" + numero + ", nome=" + nome + ", localidade=" + localidade + ", disciplina="
					+ disciplina + "]";
		}
	
  
	
	    // ----> equals()
	
}
