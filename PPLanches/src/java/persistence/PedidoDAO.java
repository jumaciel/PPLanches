package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Pedido;

public class PedidoDAO {
    
    private static PedidoDAO instance = new PedidoDAO();
    
    private PedidoDAO() {
        
    }
    
    public static PedidoDAO getInstance() {
        return instance;
    }
    
     public void save(Pedido pedido) throws SQLException,
            ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("insert into pedido (status,pedido,valorTotal,descricao)"
                    + " values ('" + pedido.getStatus() + "', '" + pedido.getValorTotal() + "', '" + pedido.getDescricao() + "'"
                    + ", '" + pedido.getCodPed() + "')");
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResources(conn, st);
        }
    }
    public void delete(Pedido pedido) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        try {
             conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("delete from pedido where id ='" + pedido.getCodPed()+ "'");
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResources(conn, st);
        }
    }
    
    public static List<Pedido> obterPedidos() throws ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        List<Pedido> pedidos = new ArrayList<Pedido>();
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from pedido");
            while (rs.next()) {
                 Pedido pedido = new Pedido(rs.getInt("codPed"),
                        rs.getString("status"),
                        rs.getFloat("valorTotal"),
                        rs.getString("descricao"));
                pedidos.add(pedido);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources(conn, st);
        }
        return pedidos;
    }
    
    public static Pedido obterPedido(int codigo) throws ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        Pedido pedido = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from pedido where CD_FUNC = " + codigo);
            rs.first();
            pedido = new Pedido(rs.getInt("CD_FUNC"),
                       rs.getString("status"),
                        rs.getFloat("valorTotal"),
                        rs.getString("descricao"));
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources(conn, st);
        }
        return pedido;
    }
    
    public static void alterar(Pedido pedido) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        try {
              conn = DatabaseLocator.getInstance().getConnection();
            String sql = "update pedido set status = ?,valorTotal =?,descricao=?,  where codPed = ?";
            PreparedStatement comando = conn.prepareStatement(sql);
            comando.setString(1, pedido.getStatus());
            comando.setFloat(2, pedido.getValorTotal());
            comando.setString(3, pedido.getDescricao());
            comando.setInt(4,pedido.getCodPed());
            comando.execute();
            comando.close();
            conn.close();
            
        } catch (SQLException e) {
            throw e;
        }
    }
    
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
