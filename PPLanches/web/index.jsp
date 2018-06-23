<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>PP Lanches</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
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
                                <a href="#">Pesquisar</a>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
            <div id="conteudo">
                <table>
                    <tr>
                        <th colspan="2">Menu</th>
                    </tr>
                    <tr>
                        <td><a href="menuPizza.jsp"><img src="img/pizza.jpg"</a></td>
                        <td><a href="menuHamburguer.jsp"><img src="img/hb.jpg"></a></td>
                    </tr>
                    <tr>
                        <td class="nomeMenu"><a href="menuPizza.jsp">Pizza</a></td>
                        <td class="nomeMenu"><a href="menuHamburguer.jsp">Hamburguer</a></td>
                    </tr>
                </table>
            </div>
    </body>
</html>
