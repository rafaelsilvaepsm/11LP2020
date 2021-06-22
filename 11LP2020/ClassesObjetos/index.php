<?php

// Incluir classe aluno
include_once "Aluno.php";
 
//var_dump($aluno1);
//echo "teste";

if (isset($_POST["btnGravar"])){
    $nome = $_POST["nome"];
    $localidade = $_POST["localidade"];
    $email = $_POST["email"];

    $aluno1 = new Aluno();
    $aluno1->setNome($nome);
    $aluno1->setLocalidade($localidade);
    $aluno1->setEmail($email);

    $aluno1->criarBD();
}

if (isset($_GET["idDelete"])){

  $aluno = new Aluno();
  $aluno->eliminar($_GET["idDelete"]);

}

?>

<!DOCTYPE html>
<html>
    <head>
        <title>Registo de Alunos</title>
    </head>
    <body>

      <form method="POST">
      
        <label>Nome</label>
        <input name="nome" type="text" />

        <br>

        <label>Localidade</label>
        <input name="localidade" type="text" />

        <br>

        <label>Email</label>
        <input name="email" type="text" />

        <br>

        <input type="submit" name="btnGravar" value="Gravar" />
      
      </form>

      <?php
      
      $aluno = new Aluno();
      $alunos = $aluno->listar();
      //var_dump($alunos);

      ?>

      <table>
              
          <thead>
              <tr>
                  <th>Nome</th>
              </tr>
          </thead>

          <tbody>

              <?php foreach ($alunos as $aluno) { ?>
                  <tr>
                      <td>
                          <?php echo $aluno["id"]; ?>
                          <?php echo $aluno["nome"]; ?>
                          <a href="index.php?idDelete=<?php echo $aluno["id"]; ?>">Eliminar</a>
                      </td>
                  </tr>
              <?php } ?>

          </tbody>

      </table>

    </body>
</html>