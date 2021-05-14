import java.util.ArrayList;

public class Carro {
	
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	
	private String matricula;
	private String marca;
	private String modelo;
	private String cor;

	private ArrayList<Roda> rodas = new ArrayList<Roda>();
	private ArrayList<Porta> portas = new ArrayList<Porta>();
	
	
	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================
  
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public ArrayList<Roda> getRodas() {
		return rodas;
	}

	public void setRodas(ArrayList<Roda> rodas) {
		this.rodas = rodas;
	}

	public ArrayList<Porta> getPortas() {
		return portas;
	}

	public void setPortas(ArrayList<Porta> portas) {
		this.portas = portas;
	}

	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================
  
  
	    // CONSTRUTOR DEFAULT
      
      
	    // CONSTRUTOR COM PARÂMETROS
      
      
	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================
	
	
	public int NumeroRodas() {
		return this.rodas.size();
	}
	
	public int NumeroPortas() {
		return this.portas.size();
	}

	@Override
	public String toString() {
		return "Carro [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + ", rodas="
				+ rodas + ", portas=" + portas + "]";
	}
  
	// =======================================================
	// ============== MÉTODOS COMPLEMENTARES ==============
	// =======================================================
	
  
	    // ----> toString()
  
	
	    // ----> equals()

}
