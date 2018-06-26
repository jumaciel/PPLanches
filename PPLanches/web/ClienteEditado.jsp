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
                                <a href="clienteLer.jsp">Pesquisar</a>
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
                    <form action="FrontController?action=EditarCliente&codigo=<c:out value="${cliente.idCliente}" />" method="post">
                        <tr>
                            <td colspan="5" class="tbTituloNome">Cadastro Cliente</td>
                        </tr>
                        <tr>
                            <td colspan="4">
                                Nome<br/>
                                <input type="text" size="20" name="txtNome" value="${cliente.nome}">
                            </td>
                            <td>
                                Sobrenome<br/>
                                <input type="text" name="txtSobrenome" value="${cliente.sobrenome}">
                            </td>
                            <td>
                                Endereço<br/>
                                <input type="text" name="txtEndereco" value="${cliente.sobrenome}">
                            </td>
                            <td>
                                Telefone<br/>
                                <input type="text" name="txtTelefone" value="${cliente.sobrenome}">
                            </td>
                        </tr>
                        <td>
                            Estado<br/>
                            <select name="txtStatus">
                                <option value="Cadastrado"<c:if test="${cliente.status == 'Cadastro'}"> selected</c:if>>Cadastrado</option>
                                <option value="Demitido"<c:if test="${cliente.status == 'Demitido'}"> selected</c:if>>Demitido</option>
                            </select>
                        </td>
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
