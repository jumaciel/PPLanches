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


public class PrepararEditarClienteAction implements Action {

    public PrepararEditarClienteAction() {
    }

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            int codFunc = Integer.parseInt(request.getParameter("codigo"));
            Cliente cliente = ClienteDAO.obterCliente(codFunc);
            String s = ""+cliente.getStatus();
            
//            if (s.equals("Cadastrado")) {
//                cliente.setFuncEstado(new ClienteCadastrado());
//               // String r = cliente.getNome() + " esta no estado " + cliente.getFuncEstado().getEstado(cliente) + " - " + cliente.Demitido(cliente);
//                request.setAttribute("r", r);
//            } else if (s.equals("Demitido")) {
//                cliente.setFuncEstado(new ClienteDemitido());
//               // String r = cliente.getNome() + " esta no estado " + cliente.getFuncEstado().getEstado(cliente) + " - " + cliente.Demitido(cliente);
//                request.setAttribute("r", r);
//            }
          
            request.setAttribute("cliente", cliente);
            RequestDispatcher view = request.getRequestDispatcher("clienteEditar.jsp");
            view.forward(request, response);
        } catch (ServletException ex) {
        } catch (IOException ex) {
        } catch (ClassNotFoundException ex) {
        }
    }
}
