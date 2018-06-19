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
    </head>
    <body>
        <h1>Monte Sua Pizza</h1>
        <table>
            <form>
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
                        <input type="submit" value="Inicio">
                    </td>
                    <td>
                        <input type="submit" value="Montar">
                    </td>
                </tr>
            </form>
        </table>
    </body>
</html>