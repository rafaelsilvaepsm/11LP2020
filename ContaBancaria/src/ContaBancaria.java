import java.util.ArrayList;

public class ContaBancaria {
	
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	
	private int NrConta;
	private Pessoa Pessoa;
	private double Saldo;
	
	private int Nib;
	private ArrayList<Movimento> Movimentos;
	
		
	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================
  

	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================
  
  
	    // CONSTRUTOR DEFAULT
      
      
	    // CONSTRUTOR COM PARÂMETROS
      
      
	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================
	
	public int getNrConta() {
		return NrConta;
	}
	public void setNrConta(int nrConta) {
		NrConta = nrConta;
	}
	public Pessoa getPessoa() {
		return Pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		Pessoa = pessoa;
	}
	public double getSaldo() {
		return Saldo;
	}
	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
	public int getNib() {
		return Nib;
	}
	public void setNib(int nib) {
		Nib = nib;
	}
	public ArrayList<Movimento> getMovimentos() {
		return Movimentos;
	}
	public void setMovimentos(ArrayList<Movimento> movimentos) {
		Movimentos = movimentos;
	}
	
  
  
	// =======================================================
	// ============== MÉTODOS COMPLEMENTARES ==============
	// =======================================================
	
  
	    // ----> toString()
		@Override
		public String toString() {
			return "ContaBancaria [NrConta=" + NrConta + ", Pessoa=" + Pessoa + ", Saldo=" + Saldo + ", Nib=" + Nib
					+ ", Movimentos=" + Movimentos + "]";
		}
  
	
	    // ----> equals()

}
