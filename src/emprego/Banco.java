/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emprego;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
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

    public boolean Login(String email, String senha){
    
         try {
       //Registra JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            //Abrindo a conexão
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmpreGO?zeroDateTimeBehavior=convertToNull", "root", "e2n5b4");

            String sql = "select idUsuario,nome from Usuario where email='"+email+"' and senha='"+senha+"';";
            //Executa a query de inserção
            java.sql.Statement st = conn.createStatement();
            ResultSet rs;
            rs = st.executeQuery(sql);
            if(rs.next() ){
                idUsuario = rs.getInt(1);
                nomeUsuario = rs.getString(2);
                conn.close();     
           return true;
            }else{
                 conn.close();
return false;
            }
         
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }//Fim try
     
    }
    
    public boolean Cadastro(String nome, String email, String senha) throws ClassNotFoundException{
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
    
    public boolean verificarCadastro() throws ClassNotFoundException{
        try {
                       Class.forName("com.mysql.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmpreGO?zeroDateTimeBehavior=convertToNull", "root", "e2n5b4");
            String sql = "select completo from Usuario where IdUsuario='"+idUsuario+"';";
            //Executa a query de inserção
            java.sql.Statement st = conn.createStatement();
           
            ResultSet rs;
            rs = st.executeQuery(sql);
            rs.next();
            
           
             if (rs.getInt(1) == 0) {
                 conn.close();
               return true;
              
            } else{
                               conn.close();
           return false;
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }//Fim try
        
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
    

