package action;

import observer.Dados;
import observer.DadosSubject;
import observer.msgClienteObserver;
import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Cliente;
import persistence.ClienteDAO;
import model.Cliente;

public class GravarClienteAction implements Action {

    public GravarClienteAction() {
    }

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String nome = request.getParameter("txtNome");
        String email = request.getParameter("txtEmail");
        String endereco = request.getParameter("txtEndereco");
        String telefone = request.getParameter("txtTelefone");
        String status = request.getParameter("txtStatus");

        if (nome.equals("")) {
            response.sendRedirect("index.jsp");
        } else {
            Cliente cliente = new Cliente(0, nome, endereco, email, telefone, status);
            try {
                ClienteDAO.getInstance().save(cliente);

                //observer
                DadosSubject dados = new DadosSubject();
                dados.attach(new msgClienteObserver(dados));
                dados.setState(new Dados(nome, email, endereco));

                response.sendRedirect("FrontController?action=LerCliente");
            } catch (ClassNotFoundException ex) {
            } catch (SQLException ex) {
                response.sendRedirect("erro.jsp");
            }
        }
    }
    
    
}
