/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emprego;

import emprego.model.Profissional;
import emprego.model.Usuario;
import java.sql.Connection;
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
                conn.close();
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + "\nNão foi possível efetuar o cadastrono momento, possivelmente por um erro causado pelo SQL.\nVerifique sua conexão com o banco de dados e servidor.");
            return false;
        }//Fim try
    }

    @Override
    public boolean verificarCadastro(int codigo) throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmpreGO?zeroDateTimeBehavior=convertToNull", "root", "e2n5b4");
            String sql = "select completo from Usuario where IdUsuario='" + codigo + "';";
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
    public boolean completarCadastroUsuario(String nome, String dataNascimento, String email, String endereco, int telefone, int codigo) throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            //Abrindo a conexão
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmpreGO?zeroDateTimeBehavior=convertToNull", "root", "e2n5b4");

            ResultSet rs;
            String sql = "update Usuario set dataNascimento='" + dataNascimento + "', nome='" + nome + "', email='" + email + "', endereco='" + endereco + "', telefone='" + telefone + "', completo='1' where IdUsuario='" + codigo + "';";
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
    public boolean completarCadastroUsuarioPro(String nome, String dataNascimento, String email, String endereco, int telefone, int codigo) throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            //Abrindo a conexão
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmpreGO?zeroDateTimeBehavior=convertToNull", "root", "e2n5b4");

            ResultSet rs;
            String sql = "update Usuario set dataNascimento='" + dataNascimento + "', nome='" + nome + "', email='" + email + "', endereco='" + endereco + "', telefone='" + telefone + "', completo='1', isUsuario='1' where IdUsuario='" + codigo + "';";
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
    public boolean completarCadastroProfissional(String experiencia, String profissao, int codigo) throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            //Abrindo a conexão
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmpreGO?zeroDateTimeBehavior=convertToNull", "root", "e2n5b4");

            ResultSet rs;
            String sql = "insert into Profissional (idUsuario,experiencia,profissao) values ('" + codigo + "','" + experiencia + "','" + profissao + "');";
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
    public Profissional montarProfissional(int codigo) throws ClassNotFoundException {

        try {
            Class.forName("com.mysql.jdbc.Driver");

            //Abrindo a conexão
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmpreGO?zeroDateTimeBehavior=convertToNull", "root", "e2n5b4");

            String sql = "select * from Profissional where idUsuario='" + codigo + "';";
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
    public boolean contratarProfissional(int idProfissional, String descricao, int codigo) throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            //Abrindo a conexão
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmpreGO?zeroDateTimeBehavior=convertToNull", "root", "e2n5b4");

            String sql = "insert into SolicitacaoServico (idProfissional,idUsuario,descricao) values ('" + idProfissional + "','" + codigo + "','" + descricao + "');";
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

    @Override
    public Usuario veficaUsuario(String email, String senha, String dataNascimento) {

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

    public List<Profissional> listarIsUsuario() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmpreGO?zeroDateTimeBehavior=convertToNull", "root", "e2n5b4");
            String sql = "select * from Usuario where isUsuario='1';";
            //Executa a query de inserção
            java.sql.Statement st = conn.createStatement();

            ResultSet rs;
            rs = st.executeQuery(sql);
            rs.next();
            List<Profissional> listadeprofissionais = new ArrayList<>();

            if(rs != null){
            do {

                Profissional novoUsuario = new Profissional();
                novoUsuario.setIdUsuario(rs.getInt(1));
                novoUsuario.setNome(rs.getString(2));
                novoUsuario.setData_nascimento(rs.getString(3));
                novoUsuario.setEmail(rs.getString(4));
                novoUsuario.setDataregistro(rs.getDate(5));
                novoUsuario.setUltimologin(rs.getDate(6));
                novoUsuario.setSenha(rs.getString(7));
                novoUsuario.setCompleto(rs.getInt(8));
                novoUsuario.setTelefone(rs.getInt(9));
                novoUsuario.setEndereco(rs.getString(10));
                novoUsuario.setIsUsuario(rs.getInt(11));
                listadeprofissionais.add(novoUsuario);
            } while (rs.next() != false);
            return listadeprofissionais;
            }else{
                            return null;
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }

    public List<Profissional> listarTabelaProfissional(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmpreGO?zeroDateTimeBehavior=convertToNull", "root", "e2n5b4");
            List<Profissional> listaTabela = new ArrayList<>();
            java.sql.Statement st = conn.createStatement();
            String sqlprof = "select * from Profissional  ;";
            ResultSet res;
            res = st.executeQuery(sqlprof);
            res.next();
           if(res != null){
            do{
                Profissional profissional = new Profissional();
                profissional.setIdProfissional(res.getInt(1));
                profissional.setIdUsuario(res.getInt(2));
                profissional.setExperienciaProfissional(res.getString(3));
                profissional.setProfissao(res.getString(4));
                listaTabela.add(profissional);
            }while(res.next() != false);
            return listaTabela;
           }else{
               return null;
           }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
    }
    public List<Profissional> montagemdoProfissional(List<Profissional> listaTabelaProfissional, List<Profissional> listaIsUsuario){
        int sizeTabela = listaTabelaProfissional.size();
        int sizeIsUsuario = listaIsUsuario.size();
        List<Profissional> listamontada = new ArrayList<>();
        for (int i = 0; i < sizeTabela; i++){
            for (int j = 0; j < sizeIsUsuario; j++){
                if(listaTabelaProfissional.get(i).getIdUsuario() == listaIsUsuario.get(j).getIdUsuario()){
                   Profissional auxiliar = listaIsUsuario.get(j);
                   auxiliar.setProfissao(listaTabelaProfissional.get(i).getProfissao());
                   auxiliar.setExperienciaProfissional(listaTabelaProfissional.get(i).getExperienciaProfissional());
                   listamontada.add(auxiliar);
                }
            }
            
        }
        if(listamontada.size() != 0){
            return listamontada;
        }else{
            return null;
        }
    }
    
}
