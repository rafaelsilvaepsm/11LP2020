<?php

class Aluno implements JsonSerializable {

    // Atributos
    private string $nome;
    private string $localidade;
    private string $email;

    // Acessores e Modificadores
    public function setNome($value){
        $this->nome = $value;
    }

    public function getNome(){
        return $this->nome;
    }

    public function setLocalidade($value){
        $this->localidade = $value;
    }

    public function getLocalidade(){
        return $this->localidade;
    }

    public function setEmail($value){
        $this->email = $value;
    }

    public function getEmail(){
        return $this->email;
    }

    // Comportamentos
    public function escreverAluno(){
        return "Nome: " . $this->nome . " | Localidade: " . $this->localidade . " | Email: " . $this->email;
    }

    public function criarBD(){

        // Conectar a base de dados
        $dsn = "mysql:host=localhost;dbname=BDAlunos";
        $user = "root";
        $passwd = "";

        $conexao = new PDO($dsn, $user, $passwd);

        $nome = $this->nome;
        $localidade = $this->localidade;
        $email = $this->email;

        $insert = "INSERT INTO alunos(nome, localidade, email) 
            VALUES ('" . $nome . "', '" . $localidade . "', '" . $email . "')";

        $conexao->exec($insert);

    }

    public function listar(){

        // Conectar a base de dados
        $dsn = "mysql:host=localhost;dbname=BDAlunos";
        $user = "root";
        $passwd = "";
        $conexao = new PDO($dsn, $user, $passwd);

        // Instrução SQL para ler todos os alunos da BD
        $sql = "SELECT * FROM alunos";
        // Preparação da instrução à BD
        $query = $conexao->query($sql);
        // Execução da query na BD e gravar resultados numa variável
        $alunos = $query->fetchAll(PDO::FETCH_ASSOC);

        // Devolver resultado
        return $alunos;

    }

    public function procurar($id){

        // Conectar a base de dados
        $dsn = "mysql:host=localhost;dbname=BDAlunos";
        $user = "root";
        $passwd = "";
        $conexao = new PDO($dsn, $user, $passwd);

        $sql = "Select * FROM Alunos WHERE id = " . $id;

        // Preparação da instrução à BD
        $query = $conexao->query($sql);
        // Execução da query na BD e gravar resultados numa variável
        $alunos = $query->fetchAll(PDO::FETCH_ASSOC);

        // Preencher atributos do objecto com os valores da base de dados
        $this->setNome($alunos[0]["nome"]);
        $this->setEmail($alunos[0]["email"]);
        $this->setLocalidade($alunos[0]["localidade"]);

    }

    public function eliminar($id){

        // Conectar a base de dados
        $dsn = "mysql:host=localhost;dbname=BDAlunos";
        $user = "root";
        $passwd = "";
        $conexao = new PDO($dsn, $user, $passwd);

        //$id = $_GET["idDelete"];

        $delete = "DELETE FROM alunos WHERE ID = " . $id;

        $conexao->exec($delete);

    }

    public function jsonSerialize()
    {
        return 
        [
            'nome'   => $this->nome,
            'localidade' => $this->localidade,
            'email' => $this->email
        ];
    }

}

?>