package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Funcionario;

public class FuncionarioDAO {
    
    private static FuncionarioDAO instance = new FuncionarioDAO();
    
    private FuncionarioDAO() {
        
    }
    
    public static FuncionarioDAO getInstance() {
        return instance;
    }
    
    public void save(Funcionario funcionario) throws SQLException,
            ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("insert into funcionario (idFuncionario, nome, sobrenome, status)"
                    + " values ('" + funcionario.getIdFuncionario() + "', '" + funcionario.getNome() + "', '" + funcionario.getSobrenome() + "'"
                    + ", '" + funcionario.getStatus() + "')");
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResources(conn, st);
        }
    }
    
    public void delete(Funcionario funcionario) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("delete from funcionario where idFuncionario ='" + funcionario.getIdFuncionario() + "'");
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResources(conn, st);
        }
    }
    
    public static List<Funcionario> obterFuncionarios() throws ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from funcionario");
            while (rs.next()) {
                Funcionario funcionario = new Funcionario(rs.getInt("idFuncionario"),
                        rs.getString("nome"),
                        rs.getString("sobrenome"),
                        rs.getString("status"));
                funcionarios.add(funcionario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources(conn, st);
        }
        return funcionarios;
    }
    
    public static Funcionario obterFuncionario(int codigo) throws ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        Funcionario funcionario = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from funcionario where idFuncionario = " + codigo);
            rs.first();
            funcionario = new Funcionario(rs.getInt("idFuncionario"),
                        rs.getString("nome"),
                        rs.getString("sobrenome"),
                        rs.getString("status"));
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources(conn, st);
        }
        return funcionario;
    }
    
    public static void alterar(Funcionario funcionario) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            String sql = "update funcionario set nome = ?, sobrenome = ? , status = ? where idFuncionario = ?";
            PreparedStatement comando = conn.prepareStatement(sql);
            comando.setString(1, funcionario.getNome());            
            comando.setString(2, funcionario.getSobrenome());
            comando.setString(3, funcionario.getStatus());
            comando.setInt(4, funcionario.getIdFuncionario());
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
