
public class Movimento {
	
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	
	private double Valor;
	private String Tipo;
	private String Descricao;
	
		
	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================
  
	public double getValor() {
		return Valor;
	}
	public void setValor(double valor) {
		Valor = valor;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
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
			return "Movimento [Valor=" + Valor + ", Tipo=" + Tipo + ", Descricao=" + Descricao + "]";
		}
  
	
	    // ----> equals()

}
