package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import model.Cliente;

public class ClienteDAO {
     private static ClienteDAO instance = new ClienteDAO();
    
    private ClienteDAO() {
        
    }
    
    public static ClienteDAO getInstance() {
        return instance;
    }
    
    public void save(Cliente cliente) throws SQLException,
            ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("insert into cliente ( endereco, sobrenome, nome, telefone, status)"
                    + " values ('" + cliente.getEndereco() + "', '" + cliente.getSobrenome() + "'"
                    + ", '" + cliente.getNome() + "','" + cliente.getTelefone() + "','" + cliente.getStatus() + "')");
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResources(conn, st);
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
