<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Cadastro Funcionarios</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
    </head>
    <body>
        <div id="top">
            <div id="titulo">
                <img src="img/logo.png" class="imgLogo">
                <div id="pesq">
                    <ul id="menuPesquisas">
                        <li class="pesqt">Funcionarios
                            <div class="dropdown-content">
                                <a href="funcionarioLer.jsp">Pesquisar</a>
                            </div>
                        </li>
                        <li class="pesqt2">Clientes
                            <div class="dropdown-content2">
                                <a href="#">Cadastrar</a>
                                <a href="#">Pesquisar</a>
                            </div>
                        </li>
                    </ul>
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
                            <select name="txtStatus">
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
