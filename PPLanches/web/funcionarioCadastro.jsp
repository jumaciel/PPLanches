<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Cadastro Funcionarios</title>
        <link rel="stylesheet" type="text/css" href="css/css.css">
    </head>
    <body>
        <div id="top">
            <div id="titulo">
                <img src="img/logo.png" class="imgLogo">
                <div id="logo">
                    <h1 id="nomeTitulo">PP Lanches</h1>
                </div>
                <ul id="menuCadastros">
                    <li>Cadastro:</li>
                    <li class="mc2" ><a href="funcionarioCadastro.jsp" >Funcionario</a></li>
                </ul>
                <div id="pesq">
                    <ul id="menuPesquisas">
                        <li class="pesqTitulo">Pesquisa:</li>
                        <li><a href="FrontController?action=LerFuncionario" class="pesqt">Funcionario</a></li>
                    </ul>
                </div>
            </div>
        </div>
        <div id="tCadastro">
            <table class="tbCor">
                <form action="FrontController?action=GravarFuncionario" method="post">
                    <tr>
                        <td colspan="5" class="tbTituloNome">Cadastro Funcionario</td>
                    </tr>
                    <tr>
                        <td colspan="4">
                            Nome<br/>
                            <input type="text" size="20" name="txtNome">
                        </td>
                        <td>
                            Sobrenome<br/>
                            <input type="text" name="txtSobrenome">
                        </td>
                    </tr>
                        <td>
                            Estado<br/>
                            <select name="txtStatus" href="FrontController?action=LerFuncionario&acao=estado">
                                    <option value="Demitido">Selecione</option>
                                <option value="Cadastrado">Cadastrado</option>
                                <option value="Demitido">Demitido</option>
                            </select>
                        </td>
                    <tr>
                        <td>
                            <a href="index.jsp" class="btnOptxt"> Inicio</a>
                            <input type="submit" value="Cadastrar" class="btnOpMenu">
                        </td>
                    </tr>
                </form>
            </table>
        </div>
    </body>
</html>
