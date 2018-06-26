package action;

import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Cliente;
import persistence.ClienteDAO;

public class ApagarClienteAction implements Action{

    public ApagarClienteAction() {
    }
    
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        if (request.getParameter("codigo").equals("") ) {
            response.sendRedirect("index.jsp");
        } else {
            int id = Integer.parseInt(request.getParameter("codigo"));
            Cliente cliente = new Cliente(id);
            try {
                ClienteDAO.getInstance().delete(cliente);
                response.sendRedirect("FrontController?action=LerCliente");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            } catch (SQLException ex) {
                response.sendRedirect("clienteErro.jsp");
                ex.printStackTrace();
            }
        }
    }
}
