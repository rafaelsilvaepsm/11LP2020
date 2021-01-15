import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Criar conta bancaria
		ContaBancaria conta = new ContaBancaria();
		
		// Criar pessoa
		Pessoa pessoa = new Pessoa();
		
		// Criar movimentos
		Movimento movimento1 = new Movimento();
		Movimento movimento2 = new Movimento();
		
		// Criar ArrayList com os movimentos
		ArrayList<Movimento> movimentos = new ArrayList<Movimento>();
		movimentos.add(movimento1);
		movimentos.add(movimento2);
		
		//Associar pessoa á conta
		conta.setPessoa(pessoa);
		
		//Associar movimentos á conta
		conta.setMovimentos(movimentos);
		
		System.out.println(conta);

	}

}
