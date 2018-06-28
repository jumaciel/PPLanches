<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
                    <form action="FrontController?action=GravarCarrinho" method="post">
                       
                        <tr>
                            <td><img src="img/hb_big_bao.png" class="hb"></td>
                            <td><img src="img/hb_bao_bacon_com_file.png" class="hb"></td>
                            <td><img src="img/hb_mais_que_bao.png" class="hb"></td>
                            <td><img src="img/hb_mega_bao.png" class="hb"></td>
                        </tr>
                        <tr>
                            <td><input type="radio" name="hb" value="Big bao">Big bão <br>R$16,00</td>
                            <td><input type="radio" name="hb" value="Bao bacon">Bão Bacon  <br>R$12,00 </td>
                            <td><input type="radio" name="hb" value="Mais que bao">Mais que bão  <br>R$12,00</td>
                            <td><input type="radio" name="hb" value="Mega bao">Mega bão  <br>R$17,00</td>
                        </tr>
                        <tr>
                            <td><img src="img/hb_mio_de_bao.png" class="hb"></td>
                            <td><img src="img/hb_mucado_bao.png" class="hb"></td>
                            <td><img src="img/hb_trem_bao.png" class="hb"></td>
                            <td><img src="img/hb_tudi_bao.png" class="hb"></td>
                        </tr>
                        <tr>
                            <td><input type="radio" name="hb" value="Mio que bao">Mio que bão  <br>R$8,00</td>
                            <td><input type="radio" name="hb" value="Mucado bao">Mucado bão <br>R$8,00</td>
                            <td><input type="radio" name="hb" value="Trem bao">Trem bão  <br>R$19,00</td>
                            <td><input type="radio" name="hb" value="Tudi bao">Tudi bão  <br>R$13,00</td>
                        </tr>
                        <tr>
                            <td colspan="4">
                                Ingredientes Adicionais:
                            </td
                        </tr>
                        <tr>
                            <td colspan="4">
                                <input type="radio" name="adc" value="Queijo">Queijo
                                <input type="radio" name="adc" value="Frango">Frango
                                <input type="radio" name="adc" value="Ovo">Ovo
                                <input type="radio" name="adc" value="Bacon">Bacon
                                <input type="radio" name="adc" value="Catupiry">Catupiry

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

