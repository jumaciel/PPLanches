<%-- 
    Document   : menuPizza
    Created on : 14/06/2018, 09:07:38
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
                    <form
                        <tr>
                            <td colspan="5" class="tbTituloNome">Monte sua pizza</td>
                        </tr>
                        <tr>
                            <td rowspan="6"><img src="img/pizza.jpg"></td>
                        </tr>
                        <tr>
                            <td>
                                Tamanho:
                            </td>
                            <td>
                                <select>
                                    <option value="pequeno">Pequeno</option>
                                    <option value="medio">Medio</option>
                                    <option value="grande">Grande</option>
                                </select>                    
                            </td>
                        </tr>
                        <tr>
                            <td>
                                Massa:
                            </td>
                            <td>
                                <select>
                                    <option value="integral">Integral</option>
                                    <option value="tradicional">Tradicional</option>
                                </select>                    
                            </td>
                        </tr>
                        <tr>
                            <td>
                                Molho:
                            </td>
                            <td>
                                <select>
                                    <option value="tomate">Tomate</option>
                                    <option value="picante">Picante</option>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                Ingredientes:
                            </td>
                            <td>
                                <input type="checkbox" name="queijo">Queijo
                                <input type="checkbox" name="frango">Frango
                                <input type="checkbox" name="calabresa">Calabresa
                                <input type="checkbox" name="milho">Milho
                                <input type="checkbox" name="catupiry">Catupiry
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <a href="index.jsp" class="btnOptxt"> Inicio</a>
                                <input type="submit" value="Montar" class="btnOpMenu">
                            </td>
                        </tr>
                    </form>
                </table>
            </div>
    </body>
</html>
