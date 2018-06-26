package action;

import controller.Action;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Cliente;
import persistence.ClienteDAO;


public class LerClienteAction implements Action {

    public LerClienteAction() {
    }

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
//            ClienteDAO.obterClientes();
//            Cliente cliente = new Cliente();
//            cliente.setNomeFunc(cliente.getNomeFunc());
//            cliente.setFuncEstado(new ClienteCadastrado());
//            String r ="T: "+cliente.getFuncEstado();
//             request.setAttribute("r",r);
            request.setAttribute("clientes", ClienteDAO.obterClientes());
            RequestDispatcher view = request.getRequestDispatcher("clienteLer.jsp");
            view.forward(request, response);
        } catch (ServletException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    public void Status(){
        
    }
}
