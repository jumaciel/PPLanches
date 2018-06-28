<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Cadastro Clientes</title>
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
                                <a href="funcionarioCadastro.jsp">Cadastrar</a>
                                <a href="FrontController?action=LerFuncionario">Pesquisar</a>
                            </div>
                        </li>
                        <li class="pesqt2">Clientes
                            <div class="dropdown-content2">
                                <a href="clienteCadastro.jsp">Cadastrar</a>
                                <a href="FrontController?action=LerCliente">Pesquisar</a>
                            </div>
                        </li>
                        <li class="pesqt"><a href="FrontController?action=LerCarrinho">Carrinho</a></li>
                    </ul>
                </div>
            </div>
            <div id="tCadastro">
                <table class="tbCor">
                    <form action="FrontController?action=GravarCliente" method="post">
                        <tr>
                            <td colspan="5" class="tbTituloNome">Cadastro cliente</td>
                        </tr>
                        <tr>
                            <td >
                                Nome<br/>
                                <input type="text" size="20" name="txtNome">
                            </td>
                            <td>
                                Email<br/>
                                <input type="text" name="txtEmail">
                            </td>
                        </tr>
                        <tr>
                            <td> Endereço<br>
                            <input type="text" name="txtEndereco">
                            </td>
                            <td> Telefone<br>
                            <input type="text" name="txtTelefone">
                            </td>
                        </tr>
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
