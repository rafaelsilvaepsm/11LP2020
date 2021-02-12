
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Turma turma = new Turma();
		turma.setNumero(1);
		turma.setNome("11INF");
		
		Professor professor = new Professor();
		professor.setNumero(1);
		professor.setNome("Rafael");
		professor.setLocalidade("Foros de Salvaterra");
		professor.setDisciplina("LP");
		
		Aluno aluno = new Aluno();
		aluno.setNumero(1);
		aluno.setNome("Pedro");
		aluno.setGenero("M");
		aluno.setLocalidade("Salvaterra");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNumero(2);
		aluno2.setNome("António");
		aluno2.setGenero("M");
		aluno2.setLocalidade("Marinhais");
		
		Aluno aluno3 = new Aluno();
		aluno3.setNumero(3);
		aluno3.setNome("Maria");
		aluno3.setGenero("F");
		aluno3.setLocalidade("Benavente");
		
		turma.AdicionarAluno(aluno);
		turma.AdicionarAluno(aluno2);
		turma.AdicionarAluno(aluno3);
		
		turma.AdicionarProfessor(professor);
		
		//System.out.println(turma);
		//System.out.println(professor);
		//System.out.println(aluno);
		
		System.out.println("A minha turma é composta por " + turma.NumeroDeAlunos() + " alunos");
		
		System.out.println("A minha turma é composta por " + turma.NumeroDePessoas() + " pessoas");

	}

}
