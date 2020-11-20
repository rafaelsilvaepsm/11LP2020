import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente = new Cliente();
		cliente.setIdade(10);
		cliente.setNome("Rafael");
		System.out.println(cliente);
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome("João");
		System.out.println(cliente2);

	}

}
