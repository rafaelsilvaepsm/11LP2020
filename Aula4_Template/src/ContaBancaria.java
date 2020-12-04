
public class ContaBancaria {
	
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	
	private String numeroConta;
	private String nomePessoa;
	private String numeroTelemovel;
	private String nib;
	private double saldo;
		
	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================
	
	public String getNumeroConta() {
		return numeroConta;
	}
	
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public String getNomePessoa() {
		return nomePessoa;
	}
	
	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
	
	public String getNumeroTelemovel() {
		return numeroTelemovel;
	}
	
	public void setNumeroTelemovel(String numeroTelemovel) {
		this.numeroTelemovel = numeroTelemovel;
	}
	
	public String getNib() {
		return nib;
	}
	
	public void setNib(String nib) {
		this.nib = nib;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================
  
  
	    // CONSTRUTOR DEFAULT
		public ContaBancaria () {
			
		}
      
      
	    // CONSTRUTOR COM PARÂMETROS
		public ContaBancaria(String numeroConta, String nomePessoa, String numeroTelemovel, String nib, double saldo) {
			super();
			this.numeroConta = numeroConta;
			this.nomePessoa = nomePessoa;
			this.numeroTelemovel = numeroTelemovel;
			this.nib = nib;
			this.saldo = saldo;
		}
      
      
	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================
	
	// A palavra "void" indica que este metodo não vai retornar qualquer valor quando for executado.
	// Este metodo recebe o parametro valor para enviarmos o valor que é para levantar
	void depositar (double valor) {
		this.saldo += valor;
	}

	boolean levantar (double valor) {
		if (this.saldo >= valor) {
			double novoSaldo = this.saldo - valor;
			this.saldo = novoSaldo;
			return true;
		} else {
			return false;
		}
	}
	
	void transferir (ContaBancaria destino, double valor) {
		this.saldo = this.saldo - valor;
		destino.saldo = destino.saldo + valor;
	}
	
  
	// =======================================================
	// ============== MÉTODOS COMPLEMENTARES ==============
	// =======================================================
	
  
	    // ----> toString()
		@Override
		public String toString() {
			return "ContaBancaria [numeroConta=" + numeroConta + ", nomePessoa=" + nomePessoa + ", numeroTelemovel="
					+ numeroTelemovel + ", nib=" + nib + ", saldo=" + saldo + "]";
		}
	
	    // ----> equals()

}
