
public class Aluno {
	
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	
	private int numero;
	private String nome;
	private String genero;
	private String localidade;
		
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
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getLocalidade() {
		return localidade;
	}
	
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
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
			return "Aluno [numero=" + numero + ", nome=" + nome + ", genero=" + genero + ", localidade=" + localidade + "]";
		}
  
	
	    // ----> equals()

}
