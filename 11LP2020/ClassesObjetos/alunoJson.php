<?php
// Indicar que a página devolve JSON
header("Content-Type: application/json; charset=UTF-8");

// Incluir classe aluno
include_once "Aluno.php";

// Criar um novo aluno
$aluno = new Aluno();
$aluno->setNome("João");
$aluno->setLocalidade("Porto");
$aluno->setEmail("teste@teste.pt");

// Retornar aluno em JSON
echo json_encode($aluno);

?>