<?php 

// Indicar que a página devolve JSON
header("Content-Type: application/json; charset=UTF-8");

// Incluir classe aluno
include_once "Aluno.php";

$id = $_GET["id"];

$aluno = new Aluno();
$aluno->procurar($id);

// Retornar aluno em JSON
echo json_encode($aluno);

?>