<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Pesquisar Funcionario</title>
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
                <table class="tbCorConsulta">
                    <tr>
                        <td colspan="18" class="tbTituloNome">Lista de Funcionarios</td>
                    </tr>
                    <tr>
                        <td class="titleP"> Nome </td>
                        <td class="titleP"> Sobrenome</td>
                        <td class="titleP"> Status</td>
                        <td class="acao" colspan="2"> Ação</td>  
                    </tr>
                    <c:forEach items="${funcionarios}" var="funcionario">
                        <tr>
                            <td class="title"> <c:out value="${funcionario.nome}" />
                            <td class="title"> <c:out value="${funcionario.sobrenome}" />                        
                            <td class="title"> <c:out value="${funcionario.status}"/>
                            <td class="acao">
                                <a href="FrontController?action=PrepararEditarFuncionario&codigo=<c:out value="${funcionario.codFunc}" />"><input type="submit" value="" class="btnOpEditar"></a>
                                <a href="FrontController?action=ApagarFuncionario&codigo=<c:out value="${funcionario.codFunc}" />"><input type="submit" value="" class="btnOpDeletar"></a>
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