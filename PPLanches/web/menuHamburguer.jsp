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
    </head>
    <body>
        <h1>Hamburguer</h1>
           <table border="1">
            <form>
                <tr>
                    <td><a href="">xBacon</a></td>
                    <td><a href="">xEgg</a></td>
                    <td><a href="">xTudo</a></td>
                    <td><a href="">x1</a></td>
                    <td><a href="">x1</a></td>
                    <td><a href="">x1</a></td>
                    <td>
                </tr>
                <tr>
                    <td>
                        Ingredientes Adicionais:
                    </td>
                    <td>
                        <input type="checkbox" name="queijo">Queijo
                        <input type="checkbox" name="frango">Frango
                        <input type="checkbox" name="ovo">Ovo
                        <input type="checkbox" name="bacon">Bacon
                        <input type="checkbox" name="catupiry">Catupiry
                   
                    </td>
                </tr>
                <tr>
                    
                    <td>
                        <a href="index.jsp">inicio</a>
                    </td>
                    <td>
                        <input type="submit" value="Adicionar no carrinho">
                    </td>
                </tr>
            </form>
        </table>
    </body>
</html>
