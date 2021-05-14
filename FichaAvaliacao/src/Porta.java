
public class Porta {
	
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	
	private String lado;
	private boolean estado;
	private double altura;
	private double largura;
		
	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================
  
	public String getLado() {
		return lado;
	}
	
	public void setLado(String lado) {
		this.lado = lado;
	}
	
	public boolean isEstado() {
		return estado;
	}
	
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getLargura() {
		return largura;
	}
	
	public void setLargura(double largura) {
		this.largura = largura;
	}

	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================
  
  
	    // CONSTRUTOR DEFAULT
      
      
	    // CONSTRUTOR COM PARÂMETROS
      
      
	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================
  
	public void Abrir() {
		this.estado = true;
	}
	
	public boolean AbertaOuFechada() {
		return this.estado;
	}

	@Override
	public String toString() {
		return "Porta [lado=" + lado + ", estado=" + estado + ", altura=" + altura + ", largura=" + largura + "]";
	}
	
  
	// =======================================================
	// ============== MÉTODOS COMPLEMENTARES ==============
	// =======================================================
	
  
	    // ----> toString()
  
	
	    // ----> equals()

}
