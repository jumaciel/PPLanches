<%-- 
    Document   : menuHamburguer
    Created on : 14/06/2018, 09:32:36
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
                <table>
                    <form
                        <tr>
                            <td><img src="img/hb_big_bao.png" class="hb"></td>
                            <td><img src="img/hb_bao_bacon_com_file.png" class="hb"></td>
                            <td><img src="img/hb_mais_que_bao.png" class="hb"></td>
                            <td><img src="img/hb_mega_bao.png" class="hb"></td>
                        </tr>
                        <tr>
                            <td><input type="checkbox" name="queijo">Big bão</td>
                            <td><input type="checkbox" name="queijo">Bão Bacon </td>
                            <td><input type="checkbox" name="queijo">Mais que bão</td>
                            <td><input type="checkbox" name="queijo">Mega bão</td>
                        </tr>
                         <tr>
                            <td><img src="img/hb_mio_de_bao.png" class="hb"></td>
                            <td><img src="img/hb_mucado_bao.png" class="hb"></td>
                            <td><img src="img/hb_trem_bao.png" class="hb"></td>
                            <td><img src="img/hb_tudi_bao.png" class="hb"></td>
                        </tr>
                        <tr>
                            <td><input type="checkbox" name="queijo">Mio que bão</td>
                            <td><input type="checkbox" name="queijo">Mucado bão</td>
                            <td><input type="checkbox" name="queijo">Trem bão</td>
                            <td><input type="checkbox" name="queijo">Tudi bão</td>
                        </tr>
                        <tr>
                            <td colspan="4">
                                Ingredientes Adicionais:
                            </td
                        </tr>
                        <tr>
                            <td colspan="4">
                                <input type="checkbox" name="queijo">Queijo
                                <input type="checkbox" name="frango">Frango
                                <input type="checkbox" name="ovo">Ovo
                                <input type="checkbox" name="bacon">Bacon
                                <input type="checkbox" name="catupiry">Catupiry

                            </td>
                        </tr>
                        <tr>
                            <td colspan="4">
                                <a href="index.jsp" class="btnOptxt"> Inicio</a>
                                <input type="submit" value="Adicionar na sacola" class="btnOpMenuAdd">
                            </td>
                        </tr>
                    </form>
                </table>
            </div>
    </body>
</html>

