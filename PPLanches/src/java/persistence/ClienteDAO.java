package persistence;

import java.sql.Connection;
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
            st.execute("insert into cliente (id, nome, sobrenome, endereco, telefone, status)"
                    + " values ('" + cliente.getId() + "', '" + cliente.getNome() + "'"
                    + ", '" + cliente.getSobrenome() + "', '" + cliente.getEndereco() + "','" + cliente.getTelefone() + "','" + cliente.getStatus() + "')");
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
                        rs.getString("sobrenome"),
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
                    rs.getString("sobrenome"),
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
