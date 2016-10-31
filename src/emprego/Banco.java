/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emprego;

import emprego.model.Profissional;
import emprego.model.Usuario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author gcamargo
 */
public class Banco {

    public static int idUsuario;
    public static int idProfissional;
    public static int idServico;
    public static int idSolicitacao;
    public static String nomeUsuario;
    public static boolean completarUsuario = false;
    public static boolean isUsuario = true;

    public boolean Login(String email, String senha) {

        try {
            //Registra JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            //Abrindo a conexão
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmpreGO?zeroDateTimeBehavior=convertToNull", "root", "e2n5b4");

            String sql = "select idUsuario,nome from Usuario where email='" + email + "' and senha='" + senha + "';";
            //Executa a query de inserção
            java.sql.Statement st = conn.createStatement();
            ResultSet rs;
            rs = st.executeQuery(sql);
            if (rs.next()) {
                idUsuario = rs.getInt(1);
                nomeUsuario = rs.getString(2);
                conn.close();
                return true;
            } else {
                conn.close();
                return false;
            }

        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }//Fim try

    }

   public boolean Cadastro(String nome, String email, String senha) throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            //Abrindo a conexão
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmpreGO?zeroDateTimeBehavior=convertToNull", "root", "e2n5b4");

            ResultSet rs;
            String sql = "insert into Usuario (nome,email,senha)" + " values ('" + nome + "','" + email + "','" + senha + "');";
            //Executa a query de inserção
            java.sql.Statement st = conn.createStatement();
            st.executeUpdate(sql);

            JOptionPane.showMessageDialog(null, "Cadastro Efetuado.\nPor favor insira seus dados ao lado para entrar no sistema.");

            conn.close();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }//Fim try
    }

    public boolean verificarCadastro() throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmpreGO?zeroDateTimeBehavior=convertToNull", "root", "e2n5b4");
            String sql = "select completo from Usuario where IdUsuario='" + idUsuario + "';";
            //Executa a query de inserção
            java.sql.Statement st = conn.createStatement();

            ResultSet rs;
            rs = st.executeQuery(sql);
            rs.next();

            if (rs.getInt(1) == 0) {
                conn.close();
                return true;

            } else {
                conn.close();
                return false;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }//Fim try

    }

    public boolean completarCadastro(String nome, String dataNascimento, String email, String endereco, int telefone) throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            //Abrindo a conexão
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmpreGO?zeroDateTimeBehavior=convertToNull", "root", "e2n5b4");

            ResultSet rs;
            String sql = "update Usuario set dataNascimento='" + dataNascimento + "', nome='" + nome + "', email='" + email + "', endereco='" + endereco + "', telefone='" + telefone + "', completo='1' where IdUsuario='" + idUsuario + "';";
            //Executa a query de inserção
            java.sql.Statement st = conn.createStatement();
            st.executeUpdate(sql);

            conn.close();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }//Fim try
    }
    public boolean completarCadastroProfissional(String experiencia, String profissao) throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            //Abrindo a conexão
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmpreGO?zeroDateTimeBehavior=convertToNull", "root", "e2n5b4");
            String sqlupdate = "update Usuario set isUsuario='1' where IdUsuario='"+idUsuario+"';";
            ResultSet rs;
            String sql = "insert into Profissional (idUsuario,experiencia,profissao) values ('"+idUsuario+"','"+experiencia+"','"+profissao+"');";
            //Executa a query de inserção
            java.sql.Statement st = conn.createStatement();
            st.executeUpdate(sql);

            conn.close();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }//Fim try
    }

    public Profissional montarProfissional() throws ClassNotFoundException {

        try {
            Class.forName("com.mysql.jdbc.Driver");

            //Abrindo a conexão
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmpreGO?zeroDateTimeBehavior=convertToNull", "root", "e2n5b4");

            String sql = "select * from Profissional where idUsuario='" + idUsuario + "';";
            //Executa a query de inserção
            java.sql.Statement st = conn.createStatement();
            st.executeQuery(sql);
            ResultSet rset;
            rset = st.executeQuery(sql);
            rset.next();
            Profissional novoProf = new Profissional();
            novoProf.setIdProfissional(rset.getInt(1));
            novoProf.setIdUsuario(rset.getInt(2));
            novoProf.setExperienciaProfissional(rset.getString(3));
            novoProf.setProfissao(rset.getString(4));

            conn.close();
            return novoProf;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }//Fim try

    }

    public Usuario montarUsuario() throws ClassNotFoundException {

        try {
            Class.forName("com.mysql.jdbc.Driver");

            //Abrindo a conexão
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmpreGO?zeroDateTimeBehavior=convertToNull", "root", "e2n5b4");

            ResultSet res;
            String sql = "select * from Usuario where idUsuario='" + idUsuario + "';";
            //Executa a query de inserção
            java.sql.Statement st = conn.createStatement();
            st.executeQuery(sql);

            res = st.executeQuery(sql);
            res.next();
            Usuario novoUsuario = new Usuario();
            novoUsuario.setIdUsuario(res.getInt(1));
            novoUsuario.setNome(res.getString(2));
            novoUsuario.setData_nascimento(res.getString(3));
            novoUsuario.setEmail(res.getString(4));
            novoUsuario.setDataregistro(res.getDate(5));
            novoUsuario.setUltimologin(res.getDate(6));
            novoUsuario.setSenha(res.getString(7));
            novoUsuario.setCompleto(res.getInt(8));
            novoUsuario.setTelefone(res.getInt(9));
            novoUsuario.setEndereco(res.getString(10));
            novoUsuario.setIsUsuario(res.getInt(11));

            conn.close();
            return novoUsuario;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }//Fim try

    }

    public Profissional contratarProfissional(String nome, String email, Date dataregistro) throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            //Abrindo a conexão
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmpreGO?zeroDateTimeBehavior=convertToNull", "root", "e2n5b4");

            ResultSet rs;
            String sql = "select * Usuario where nome='" + nome + "' and email='" + email + "' and dataregistro='" + dataregistro + "';";
            //Executa a query de inserção
            java.sql.Statement st = conn.createStatement();

            rs = st.executeQuery(sql);
            rs.next();

            conn.close();
            return null;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }//Fim try
    }

    public List<Profissional> listaprofissionais() throws ClassNotFoundException, SQLException{
         Class.forName("com.mysql.jdbc.Driver");
                List<Profissional> listadeprofissionais = new ArrayList<>();
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmpreGO?zeroDateTimeBehavior=convertToNull", "root", "e2n5b4");
                String sql = "select * from Usuario  ;";
                //Executa a query de inserção
                java.sql.Statement st = conn.createStatement();

                ResultSet rs;
                rs = st.executeQuery(sql);
                int i = 0;
                rs.next();
                do {

                    Profissional novoProf = new Profissional();
                    novoProf.setIdProfissional(rs.getInt(1));
                    novoProf.setIdUsuario(rs.getInt(2));
                    novoProf.setExperienciaProfissional(rs.getString(3));
                    novoProf.setProfissao(rs.getString(4));
                    
                    i = i + 1;
                    rs.next();

                    listadeprofissionais.add(novoProf);
                } while (rs.next() != false);
        return listadeprofissionais;
    }
     public Profissional procuraProfissional (List<Profissional> lista, int codigo){
        Profissional encontrado = null;
         for(int i = 0; i < lista.size(); i++){
             if(lista.get(i).getIdUsuario() == codigo){
               encontrado = lista.get(i);  
             }
         }
         return encontrado;
     }       
    
    /**
     * @return the idUsuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return the idProfissional
     */
    public int getIdProfissional() {
        return idProfissional;
    }

    /**
     * @param idProfissional the idProfissional to set
     */
    public void setIdProfissional(int idProfissional) {
        this.idProfissional = idProfissional;
    }

    /**
     * @return the idServico
     */
    public int getIdServico() {
        return idServico;
    }

    /**
     * @param idServico the idServico to set
     */
    public void setIdServico(int idServico) {
        this.idServico = idServico;
    }

    /**
     * @return the idSolicitacao
     */
    public int getIdSolicitacao() {
        return idSolicitacao;
    }

    /**
     * @param idSolicitacao the idSolicitacao to set
     */
    public void setIdSolicitacao(int idSolicitacao) {
        this.idSolicitacao = idSolicitacao;
    }

    /**
     * @return the nome
     */
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    /**
     * @param nome the nome to set
     */
    public void setNomeUsuario(String nome) {
        this.nomeUsuario = nome;
    }

}
