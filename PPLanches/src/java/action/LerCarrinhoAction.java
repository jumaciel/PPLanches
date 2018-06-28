package action;

import controller.Action;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import persistence.CarrinhoDAO;


public class LerCarrinhoAction implements Action {

    public LerCarrinhoAction() {
    }

     @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
//            CarrinhoDAO.obterCarrinhos();
//            Carrinho carrinho = new Carrinho();
//            carrinho.setNomeFunc(carrinho.getNomeFunc());
//            carrinho.setFuncEstado(new CarrinhoCadastrado());
//            String r ="T: "+carrinho.getFuncEstado();
//             request.setAttribute("r",r);
            request.setAttribute("carrinhos", CarrinhoDAO.obterCarrinhos());
            RequestDispatcher view = request.getRequestDispatcher("carrinhoLer.jsp");
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
