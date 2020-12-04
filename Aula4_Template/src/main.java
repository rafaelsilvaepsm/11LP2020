
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Criar conta bancária 1
		ContaBancaria contaBancaria = new ContaBancaria();
		contaBancaria.setNib("10");
		System.out.println(contaBancaria);
		
		// Criar conta bancária 2
		ContaBancaria contaBancaria2 = new ContaBancaria();
		contaBancaria2.setNib("20");
		System.out.println(contaBancaria2);
		
		// Depositar 1000 e ver resultado
		contaBancaria2.depositar(1000);
		System.out.println(contaBancaria2);
		
		
		// Levantar 500 e ver resultado
		boolean consegui = contaBancaria2.levantar(500);
		if (consegui == true) {
			System.out.println("Levantamento com sucesso");
		} else {
			System.out.println("Saldo não disponível");
		}
		
		// Levantar 1000 e ver resultado
		boolean consegui2 = contaBancaria2.levantar(1000);
		if (consegui2 == true) {
			System.out.println("Levantamento com sucesso");
		} else {
			System.out.println("Saldo não disponível");
		}
		
	}

}
