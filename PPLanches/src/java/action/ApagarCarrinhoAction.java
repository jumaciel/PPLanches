package action;

import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Carrinho;
import persistence.CarrinhoDAO;

public class ApagarCarrinhoAction implements Action{

    public ApagarCarrinhoAction() {
    }
    
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        if (request.getParameter("codigo").equals("") ) {
            response.sendRedirect("index.jsp");
        } else {
            int id = Integer.parseInt(request.getParameter("codigo"));
            Carrinho carrinho = new Carrinho(id);
           try {
                CarrinhoDAO.getInstance().delete(carrinho);
                response.sendRedirect("FrontController?action=LerCarrinho");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            } catch (SQLException ex) {
                response.sendRedirect("carrinhoErro.jsp");
                ex.printStackTrace();
            }
        }
    }
}
