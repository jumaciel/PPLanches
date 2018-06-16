package action;

import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Funcionario;
import DAO.FuncionarioDAO;
import state.FuncionarioCadastrado;
import state.FuncionarioDemitido;


public class EditarFuncionarioAction implements Action {

    public EditarFuncionarioAction() {
    }

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String acao = request.getParameter("acao");
        if (acao.equals("prepararEditar")) {
            prepararEditar(request, response);
        } else if (acao.equals("confirmarEditar")) {
            confirmarEditar(request, response);
        }

    }

    public void prepararEditar(HttpServletRequest request, HttpServletResponse response) {
        try {
            int codFunc = Integer.parseInt(request.getParameter("txtCodFunc"));
            Funcionario funcionario = FuncionarioDAO.obterFuncionario(codFunc);
            String s = ""+funcionario.getStatus();
            
            if (s.equals("Cadastrado")) {
                funcionario.setFuncEstado(new FuncionarioCadastrado());
                String r = funcionario.getNomeFunc() + " esta no estado " + funcionario.getFuncEstado().getEstado(funcionario) + " - " + funcionario.Demitido(funcionario);
                request.setAttribute("r", r);
            } else if (s.equals("Demitido")) {
                funcionario.setFuncEstado(new FuncionarioDemitido());
                String r = funcionario.getNomeFunc() + " esta no estado " + funcionario.getFuncEstado().getEstado(funcionario) + " - " + funcionario.Demitido(funcionario);
                request.setAttribute("r", r);
            }
          
            request.setAttribute("funcionario", funcionario);
            RequestDispatcher view = request.getRequestDispatcher("funcionarioEditado.jsp");
            view.forward(request, response);
        } catch (ServletException ex) {
        } catch (IOException ex) {
        } catch (ClassNotFoundException ex) {
        }
    }

    private void confirmarEditar(HttpServletRequest request, HttpServletResponse response) {
        try {
            int codFunc = Integer.parseInt(request.getParameter("txtCodFunc"));
            String nome = request.getParameter("txtNome");;          
            String sobrenome = request.getParameter("txtSobrenome");
            String status = request.getParameter("txtStatus");

            if (nome.equals("")) {
                response.sendRedirect("index.jsp");
            } else {
                Funcionario funcionario = new Funcionario(codFunc, nome, sobrenome, status);

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
