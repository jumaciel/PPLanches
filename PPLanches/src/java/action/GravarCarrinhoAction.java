package action;

import Decorator.BaconHamburguer;
import Decorator.CatupiryHamburguer;
import Decorator.FrangoHamburguer;
import Decorator.Hamburguer;
import Decorator.HamburguerLanche;
import Decorator.OvoHamburguer;
import Decorator.QueijoHamburguer;
import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Carrinho;
import persistence.CarrinhoDAO;

public class GravarCarrinhoAction implements Action {

    public GravarCarrinhoAction() {
    }

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String hb = request.getParameter("hb");
        String adc = request.getParameter("adc");
        if (adc == null) {
            adc = "";
        }

        if (hb.equals("")) {
            response.sendRedirect("index.jsp");
        } else {
            try {
                HamburguerLanche hbl = new Hamburguer();

                if (hb.equals("Big bao")) {
                    hbl.setNome(hb);
                    hbl.setPreco(16.0);
                } else if (hb.equals("Bao bacon")) {
                    hbl.setNome(hb);
                    hbl.setPreco(12.0);
                } else if (hb.equals("Mais que bao")) {
                    hbl.setNome(hb);
                    hbl.setPreco(12.0);
                } else if (hb.equals("Mega bao")) {
                    hbl.setNome(hb);
                    hbl.setPreco(17.0);
                } else if (hb.equals("Mio que bao")) {
                    hbl.setNome(hb);
                    hbl.setPreco(8.0);
                } else if (hb.equals("Mucado bao")) {
                    hbl.setNome(hb);
                    hbl.setPreco(8.0);
                } else if (hb.equals("Tem bao")) {
                    hbl.setNome(hb);
                    hbl.setPreco(19.0);
                } else if (hb.equals("Tudi bao")) {
                    hbl.setNome(hb);
                    hbl.setPreco(13.0);
                }

                if (adc.equals("Queijo")) {
                    hbl = new QueijoHamburguer((Hamburguer) hbl);
                } else if (adc.equals("Frango")) {
                    hbl = new FrangoHamburguer((Hamburguer) hbl);
                } else if (adc.equals("Ovo")) {
                    hbl = new OvoHamburguer((Hamburguer) hbl);
                } else if (adc.equals("Bacon")) {
                    hbl = new BaconHamburguer((Hamburguer) hbl);
                } else if (adc.equals("Catupiry")) {
                    hbl = new CatupiryHamburguer((Hamburguer) hbl);
                }

                Carrinho cr = new Carrinho(0, hbl.getNome(), hbl.getPreco());

                CarrinhoDAO.getInstance().save(cr);
                response.sendRedirect("FrontController?action=LerCarrinho");
            } catch (ClassNotFoundException ex) {
            } catch (SQLException ex) {
                response.sendRedirect("erro.jsp");
            }
        }
    }
}
