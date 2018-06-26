package action;

import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Cliente;
import persistence.ClienteDAO;


public class EditarClienteAction implements Action {

    public EditarClienteAction() {
    }

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            int codigo = Integer.parseInt(request.getParameter("codigo"));
            String nome = request.getParameter("txtNome");
            String email = request.getParameter("txtEmail");
            String endereco = request.getParameter("txtEndereco");
            String telefone = request.getParameter("txtTelefone");
            String status = request.getParameter("txtStatus");
            
            if (nome.equals("")) {
                response.sendRedirect("index.jsp");
            } else {
                Cliente cliente = new Cliente(codigo, nome, endereco, email, telefone, status);

                ClienteDAO.alterar(cliente);
                RequestDispatcher view = request.getRequestDispatcher("FrontController?action=LerCliente");
                view.forward(request, response);
            }
        } catch (IOException ex) {
        } catch (ClassNotFoundException ex) {
        } catch (SQLException ex) {
        } catch (ServletException ex) {
        }
    }
}
