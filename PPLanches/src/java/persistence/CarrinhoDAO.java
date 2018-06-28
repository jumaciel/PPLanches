/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Carrinho;

/**
 *
 * @author Ana
 */
public class CarrinhoDAO {
     private static CarrinhoDAO instance = new CarrinhoDAO();

    private CarrinhoDAO() {

    }

    public static CarrinhoDAO getInstance() {
        return instance;
    }

    public void save(Carrinho carrinho) throws SQLException,
            ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("insert into carrinho (id, descricao, valorTotal)"
                    + " values ('" + carrinho.getCodPed() + "','" + carrinho.getDescricao() + "', '" + carrinho.getValorTotal() + "')");
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResources(conn, st);
        }
    }

    public void delete(Carrinho carrinho) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("delete from carrinho where id ='" + carrinho.getCodPed() + "'");
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResources(conn, st);
        }
    }

    public static List<Carrinho> obterCarrinhos() throws ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        List<Carrinho> carrinhos = new ArrayList<Carrinho>();
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from carrinho");
            while (rs.next()) {
                Carrinho carrinho = new Carrinho(rs.getInt("id"),
                        rs.getString("descricao"),
                        rs.getDouble("valorTotal"));
                carrinhos.add(carrinho);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources(conn, st);
        }
        return carrinhos;
    }

//    public static Carrinho obterCarrinho(int codigo) throws ClassNotFoundException {
//        Connection conn = null;
//        Statement st = null;
//        Carrinho carrinho = null;
//        try {
//            conn = DatabaseLocator.getInstance().getConnection();
//            st = conn.createStatement();
//            ResultSet rs = st.executeQuery("select * from carrinho where id = " + codigo);
//            rs.first();
//            carrinho = new Carrinho(rs.getInt("id"),
//                    rs.getString("nome"),
//                    rs.getString("sobrenome"),
//                    rs.getString("endereco"),
//                    rs.getString("telefone"),
//                    rs.getString("status"));
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            closeResources(conn, st);
//        }
//        return carrinho;
//    }

//      public static void alterar(Carrinho carrinho) throws SQLException, ClassNotFoundException {
//        Connection conn = null;
//        try {
//            conn = DatabaseLocator.getInstance().getConnection();
//            String sql = "update carrinho set nome = ?, sobrenome = ? , endereco = ?, telefone = ?, status = ? where id = ?";
//            PreparedStatement comando = conn.prepareStatement(sql);
//            comando.setString(1, carrinho.getNome());            
//            comando.setString(2, carrinho.getSobrenome());
//            comando.setString(3, carrinho.getEndereco());
//            comando.setString(4, carrinho.getTelefone());
//            comando.setString(5, carrinho.getStatus());
//            comando.setInt(6, carrinho.getId());
//            comando.execute();
//            comando.close();
//            conn.close();
//            
//        } catch (SQLException e) {
//            throw e;
//        }
//    }
    private static void closeResources(Connection conn, Statement st) {
        try {
            if (st != null) {
                st.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {

        }
    }
}
