
public class Pessoa {
	
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	
	private String NomePessoa;
	private String Morada;
	private String Telemovel;
	private String CodigoPostal;
	
	
		
	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================
  

	public String getNomePessoa() {
		return NomePessoa;
	}
	public void setNomePessoa(String nomePessoa) {
		NomePessoa = nomePessoa;
	}
	public String getMorada() {
		return Morada;
	}
	public void setMorada(String morada) {
		Morada = morada;
	}
	public String getTelemovel() {
		return Telemovel;
	}
	public void setTelemovel(String telemovel) {
		Telemovel = telemovel;
	}
	public String getCodigoPostal() {
		return CodigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		CodigoPostal = codigoPostal;
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
			return "Pessoa [NomePessoa=" + NomePessoa + ", Morada=" + Morada + ", Telemovel=" + Telemovel
					+ ", CodigoPostal=" + CodigoPostal + "]";
		}
	
	    // ----> equals()

}
