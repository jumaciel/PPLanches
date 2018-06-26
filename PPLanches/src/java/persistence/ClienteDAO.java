package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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
            st.execute("insert into cliente (id, nome, email, endereco, telefone, status)"
                    + " values ('" + cliente.getId() + "', '" + cliente.getNome() + "'"
                    + ", '" + cliente.getEmail() + "', '" + cliente.getEndereco() + "','" + cliente.getTelefone() + "','" + cliente.getStatus() + "')");
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResources(conn, st);
        }
    }

    public void delete(Cliente cliente) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("delete from cliente where id ='" + cliente.getId() + "'");
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResources(conn, st);
        }
    }

    public static List<Cliente> obterClientes() throws ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        List<Cliente> clientes = new ArrayList<Cliente>();
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from cliente");
            while (rs.next()) {
                Cliente cliente = new Cliente(rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("email"),
                        rs.getString("endereco"),
                        rs.getString("telefone"),
                        rs.getString("status"));
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources(conn, st);
        }
        return clientes;
    }

    public static Cliente obterCliente(int codigo) throws ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        Cliente cliente = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from cliente where id = " + codigo);
            rs.first();
            cliente = new Cliente(rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("email"),
                    rs.getString("endereco"),
                    rs.getString("telefone"),
                    rs.getString("status"));
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources(conn, st);
        }
        return cliente;
    }

      public static void alterar(Cliente cliente) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            String sql = "update cliente set nome = ?, email = ? , endereco = ?, telefone = ?, status = ? where id = ?";
            PreparedStatement comando = conn.prepareStatement(sql);
            comando.setString(1, cliente.getNome());            
            comando.setString(2, cliente.getEmail());
            comando.setString(3, cliente.getEndereco());
            comando.setString(4, cliente.getTelefone());
            comando.setString(5, cliente.getStatus());
            comando.setInt(6, cliente.getId());
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
