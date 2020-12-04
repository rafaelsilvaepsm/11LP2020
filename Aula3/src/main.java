
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ContaBancaria contaBancaria = new ContaBancaria();
		contaBancaria.setNib("10");
		System.out.println(contaBancaria);
		
		ContaBancaria contaBancaria2 = new ContaBancaria("15151",
				"João", "91111", "1511", 0);
		
		System.out.println(contaBancaria2);
		contaBancaria2.Depositar(1000);
		System.out.println(contaBancaria2);
		
		boolean levantamento = contaBancaria2.Levantar(100);
		if (levantamento == true) {
			System.out.println("Sucesso");
		} else {
			System.out.println("Vai Trabalhar");
		}
		
		System.out.println(contaBancaria2);
		
		boolean transferir = contaBancaria2.Transferir(100, 
				contaBancaria);
		
		if (transferir == true) {
			System.out.println("Sucesso");
		} else {
			System.out.println("Vai Trabalhar");
		}
		
		System.out.println(contaBancaria);
		System.out.println(contaBancaria2);

	}

}
