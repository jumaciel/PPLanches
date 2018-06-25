package action;

import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Funcionario;
import persistence.FuncionarioDAO;

public class GravarFuncionarioAction implements Action {

    public GravarFuncionarioAction() {
    }

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
       
        String nome = request.getParameter("txtNome");
        String sobrenome = request.getParameter("txtSobrenome");
        String status = request.getParameter("txtStatus");

        if (nome.equals("")) {
            response.sendRedirect("index.jsp");
        } else {
            Funcionario funcionario = new Funcionario(0, nome, sobrenome , status);
            try {
                FuncionarioDAO.getInstance().save(funcionario);
                response.sendRedirect("FrontController?action=LerFuncionario");
            } catch (ClassNotFoundException ex) {
            } catch (SQLException ex) {
                response.sendRedirect("erro.jsp");
            }
        }
    }
}
