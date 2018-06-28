<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Enfermeiro editar</title>
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
                    <form action="FrontController?action=EditarCliente&codigo=<c:out value="${cliente.id}" />" method="post">
                        <tr>
                            <td colspan="5" class="tbTituloNome">Cadastro Cliente</td>
                        </tr>
                        <tr>
                            <td colspan="4">
                                Nome<br/>
                                <input type="text" size="20" name="txtNome" value="${cliente.nome}">
                            </td>
                            <td>
                                Email<br/>
                                <input type="text" name="txtEmail" value="${cliente.email}">
                            </td>
                            <td>
                                Endereço<br/>
                                <input type="text" name="txtEndereco" value="${cliente.endereco}">
                            </td>
                            <td>
                                Telefone<br/>
                                <input type="text" name="txtTelefone" value="${cliente.telefone}">
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <a href="index.jsp" class="btnOptxt"> Inicio</a>
                                <input type="submit" value="Cadastrar" class="btnOpMenu">
                            </td>
                        </tr> 
                        <tr>
                            <td colspan="4">
                                <c:out value="${r}" /><br/>
                            </td>
                        </tr>
                    </form>
                </table>
            </div>
    </body>
</html>
