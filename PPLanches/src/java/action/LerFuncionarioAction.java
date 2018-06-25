package action;

import controller.Action;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Funcionario;
import persistence.FuncionarioDAO;
import state.FuncionarioCadastrado;

public class LerFuncionarioAction implements Action {

    public LerFuncionarioAction() {
    }

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
//            FuncionarioDAO.obterFuncionarios();
//            Funcionario funcionario = new Funcionario();
//            funcionario.setNomeFunc(funcionario.getNomeFunc());
//            funcionario.setFuncEstado(new FuncionarioCadastrado());
//            String r ="T: "+funcionario.getFuncEstado();
//             request.setAttribute("r",r);
            request.setAttribute("funcionarios", FuncionarioDAO.obterFuncionarios());
            RequestDispatcher view = request.getRequestDispatcher("funcionarioLer.jsp");
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
