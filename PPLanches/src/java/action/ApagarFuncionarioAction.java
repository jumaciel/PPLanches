package action;

import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Funcionario;
import DAO.FuncionarioDAO;

public class ApagarFuncionarioAction implements Action{

    public ApagarFuncionarioAction() {
    }
    
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        if (request.getParameter("codigo").equals("") ) {
            response.sendRedirect("index.jsp");
        } else {
            int id = Integer.parseInt(request.getParameter("codigo"));
            Funcionario funcionario = new Funcionario(id);
            try {
                FuncionarioDAO.getInstance().delete(funcionario);
                response.sendRedirect("FrontController?action=LerFuncionario");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            } catch (SQLException ex) {
                response.sendRedirect("funcionarioErro.jsp");
                ex.printStackTrace();
            }
        }
    }
}
