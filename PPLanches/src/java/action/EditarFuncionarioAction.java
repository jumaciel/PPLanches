package action;

import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Funcionario;
import persistence.FuncionarioDAO;
import state.FuncionarioCadastrado;
import state.FuncionarioDemitido;


public class EditarFuncionarioAction implements Action {

    public EditarFuncionarioAction() {
    }

     @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            int codigo = Integer.parseInt(request.getParameter("codigo"));
            String nome = request.getParameter("txtNome");
            String sobrenome = request.getParameter("txtSobrenome");
            String status = request.getParameter("txtStatus");

            if (nome.equals("")) {
                response.sendRedirect("index.jsp");
            } else {
                Funcionario funcionario = new Funcionario(codigo, nome, sobrenome , status);

                FuncionarioDAO.alterar(funcionario);
                RequestDispatcher view = request.getRequestDispatcher("FrontController?action=LerFuncionario");
                view.forward(request, response);
            }
        } catch (IOException ex) {
        } catch (ClassNotFoundException ex) {
        } catch (SQLException ex) {
        } catch (ServletException ex) {
        }
    }
}
