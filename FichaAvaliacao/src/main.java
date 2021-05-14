import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Criar um carro
		Carro carro = new Carro();
		carro.setMatricula("AAA");
		carro.setCor("Preto");
		carro.setMarca("Ferrari");
		carro.setModelo("BBB");
		
		//Criar Roda
		Roda roda1 = new Roda();
		roda1.setLado("Esquerda");
		roda1.setPosicao("Frente");
		roda1.setMarca("Mich");
		
		//Criar Roda
		Roda roda2 = new Roda();
		roda2.setLado("Direita");
		roda2.setPosicao("Frente");
		roda2.setMarca("Mich");
		
		//Criar Roda
		Roda roda3 = new Roda();
		roda3.setLado("Esquerda");
		roda3.setPosicao("Trás");
		roda3.setMarca("Mich");
		
		//Criar Roda
		Roda roda4 = new Roda();
		roda4.setLado("Direita");
		roda4.setPosicao("Trás");
		roda4.setMarca("Mich");
		
		ArrayList<Roda> rodas = new ArrayList<Roda>();
		rodas.add(roda1);
		rodas.add(roda2);
		rodas.add(roda3);
		rodas.add(roda4);
		carro.setRodas(rodas);
		
		// Criar porta
		Porta porta1 = new Porta();
		porta1.setLado("Esquerda");
		porta1.setEstado(false);
		porta1.setAltura(100);
		porta1.setLargura(100);
		
		// Criar porta
		Porta porta2 = new Porta();
		porta2.setLado("Direira");
		porta2.setEstado(false);
		porta2.setAltura(100);
		porta2.setLargura(100);
		
		ArrayList<Porta> portas = new ArrayList<Porta>();
		portas.add(porta1);
		portas.add(porta2);
		carro.setPortas(portas);
		
		System.out.println(carro);
		System.out.println("O carro é composto por " + carro.NumeroRodas() + " rodas");
		System.out.println("O carro é composto por " + carro.NumeroPortas() + " portas");
	}

}
