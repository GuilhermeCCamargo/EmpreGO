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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author gcamargo
 */
public class Banco implements InterfaceBanco {

    public static int idUsuario;
    public static int idProfissional;
    public static int idServico;
    public static int idSolicitacao;
    public static String nomeUsuario;
    public static boolean completarUsuario = false;
    public static boolean isUsuario = true;

    @Override
    public Usuario Login(String email, String senha) {

        try {

            Usuario usuariologado = new Usuario();
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmpreGO?zeroDateTimeBehavior=convertToNull", "root", "e2n5b4");
            String sql = "select * from Usuario where email='" + email + "' and senha='" + senha + "';";
            java.sql.Statement st = conn.createStatement();
            ResultSet rs;
            rs = st.executeQuery(sql);

            if (rs.next()) {
                
                usuariologado.setIdUsuario(rs.getInt(1));
                usuariologado.setNome(rs.getString(2));
                usuariologado.setData_nascimento(rs.getString(3));
                usuariologado.setEmail(rs.getString(4));
                usuariologado.setDataregistro(rs.getDate(5));
                usuariologado.setUltimologin(rs.getDate(6));
                usuariologado.setSenha(rs.getString(7));
                usuariologado.setCompleto(rs.getInt(8));
                usuariologado.setTelefone(rs.getInt(9));
                usuariologado.setEndereco(rs.getString(10));
                usuariologado.setIsUsuario(rs.getInt(11));

                conn.close();
                return usuariologado;
            } else {
                conn.close();
                return null;
            }

        } catch (SQLException error) {

            JOptionPane.showMessageDialog(null, error + "\nVerifique a instrução sql e o status de sua conexão com o banco de dados.\n");
            return null;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex + "\nVerifique as configurações do servidor e da classe em questão.");
            return null;
        }//Fim try

    }

    @Override
    public boolean Cadastro(String nome, String email, String senha) throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            //Abrindo a conexão
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmpreGO?zeroDateTimeBehavior=convertToNull", "root", "e2n5b4");

            ResultSet rs;
            String sql = "insert into Usuario (nome,email,senha)" + " values ('" + nome + "','" + email + "','" + senha + "');";
            //Executa a query de inserção
            java.sql.Statement st = conn.createStatement();
            if (st.executeUpdate(sql) > 0) {

                JOptionPane.showMessageDialog(null, "Cadastro Efetuado.\nPor favor insira seus dados ao lado para entrar no sistema.");

                conn.close();

                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, verifique a conexão com o banco de dados.");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + "\nNão foi possível efetuar o cadastrono momento, possivelmente por um erro causado pelo SQL.\nVerifique sua conexão com o banco de dados e servidor.");
            return false;
        }//Fim try
    }

    @Override
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

    @Override
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

    @Override
    public boolean completarCadastroUsuario(String nome, String dataNascimento, String email, String endereco, int telefone) throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            //Abrindo a conexão
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmpreGO?zeroDateTimeBehavior=convertToNull", "root", "e2n5b4");

            ResultSet rs;
            String sql = "update Usuario set dataNascimento='" + dataNascimento + "', nome='" + nome + "', email='" + email + "', endereco='" + endereco + "', telefone='" + telefone + "', completo='1',isUsuario='1' where IdUsuario='" + idUsuario + "';";
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

    @Override
    public boolean completarCadastroProfissional(String experiencia, String profissao) throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            //Abrindo a conexão
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmpreGO?zeroDateTimeBehavior=convertToNull", "root", "e2n5b4");
            String sqlupdate = "update Usuario set isUsuario='1' where IdUsuario='" + idUsuario + "';";
            ResultSet rs;
            String sql = "insert into Profissional (idUsuario,experiencia,profissao) values ('" + idUsuario + "','" + experiencia + "','" + profissao + "');";
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

    @Override
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

    @Override
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

    @Override
    public boolean contratarProfissional(int idProfissional, String descricao) throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            //Abrindo a conexão
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmpreGO?zeroDateTimeBehavior=convertToNull", "root", "e2n5b4");

            String sql = "insert into SolicitacaoServico (idProfissional,idUsuario,descricao) values ('" + idProfissional + "','" + idUsuario + "','" + descricao + "');";
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

    @Override
    public List<Profissional> listaprofissionais() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        List<Profissional> listadeprofissionais = new ArrayList<>();
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmpreGO?zeroDateTimeBehavior=convertToNull", "root", "e2n5b4");
        String sql = "select * from Profissional  ;";

        java.sql.Statement st = conn.createStatement();

        ResultSet rs;
        rs = st.executeQuery(sql);

        rs.next();//Retirando o result set da posição zero que no caso é nula
        do {

            Profissional novoProf = new Profissional();
            novoProf.setIdProfissional(rs.getInt(1));
            novoProf.setIdUsuario(rs.getInt(2));
            novoProf.setExperienciaProfissional(rs.getString(3));
            novoProf.setProfissao(rs.getString(4));

            rs.next();//Comando para não operar sob a mesma posição

            listadeprofissionais.add(novoProf);
        } while (rs.next() != false);
        return listadeprofissionais;
    }

    @Override
    public Profissional procuraProfissional(List<Profissional> lista, int codigo) {
        Profissional encontrado = null;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getIdUsuario() == codigo) {
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
