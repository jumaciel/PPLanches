<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Pesquisar Cliente</title>
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
                    </ul>
                </div>
            </div>
            <div id="tCadastro">
                <table class="tbCorConsulta">
                    <tr>
                        <td colspan="18" class="tbTituloNome">Lista de Clientes</td>
                    </tr>
                    <tr>
                        <td class="titleP"> Nome </td>
                        <td class="titleP"> Email</td>
                        <td class="titleP"> Endereço</td>
                        <td class="titleP"> Telefone</td>
                        <td class="titleP"> Status</td>
                        <td class="acao" colspan="2"> Ação</td>  
                    </tr>
                    <c:forEach items="${clientes}" var="cliente">
                        <tr>
                            <td class="title"> <c:out value="${cliente.nome}" />
                            <td class="title"> <c:out value="${cliente.email}" />
                            <td class="title"> <c:out value="${cliente.endereco}" /> 
                            <td class="title"> <c:out value="${cliente.telefone}" /> 
                            <td class="title"> <c:out value="${cliente.status}"/>
                            <td class="acao">
                                <a href="FrontController?action=PrepararEditarCliente&codigo=<c:out value="${cliente.id}" />"><input type="submit" value="" class="btnOpEditar"></a>
                                <a href="FrontController?action=ApagarCliente&codigo=<c:out value="${cliente.id}" />"><input type="submit" value="" class="btnOpDeletar"></a>
                            </td>
                        </tr>
                    </c:forEach>
                    <tr>
                        <td bgcolor="#d4d4d4" colspan="18">
                            <a  href="index.jsp"><input type="submit" value="Inicio" class="btnOpMenu"></a>
                        </td>
                    </tr>
                </table>
            </div>
    </body>
</html>
