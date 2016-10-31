/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emprego.model;

import java.sql.Date;

/**
 *
 * @author gcamargo
 */
public class Usuario {

    public Usuario(int id, String lastName, String firstName, String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the dataregistro
     */
    public Date getDataregistro() {
        return dataregistro;
    }

    /**
     * @param dataregistro the dataregistro to set
     */
    public void setDataregistro(Date dataregistro) {
        this.dataregistro = dataregistro;
    }

    /**
     * @return the ultimologin
     */
    public Date getUltimologin() {
        return ultimologin;
    }

    /**
     * @param ultimologin the ultimologin to set
     */
    public void setUltimologin(Date ultimologin) {
        this.ultimologin = ultimologin;
    }

    /**
     * @return the completo
     */
    public int getCompleto() {
        return completo;
    }

    /**
     * @param completo the completo to set
     */
    public void setCompleto(int completo) {
        this.completo = completo;
    }

    private String nome;
    private String email;
    private String senha;
    private int telefone;
    private String endereco;
    private String data_Nascimento;
    private int isUsuario;
    private int idUsuario;
    private int completo;
    private Date dataregistro;
    private Date ultimologin;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the data_nascimento
     */
    public String getData_Nascimento() {
        return data_Nascimento;
    }

    /**
     * @param data_nascimento the data_nascimento to set
     */
    public void setData_nascimento(String data_nascimento) {
        this.data_Nascimento = data_nascimento;
    }

    /**
     * @return the telefone
     */
    public int getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the idUsuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = 0;
        this.data_Nascimento = "0/0/";
        this.idUsuario = 0;
    }

    public Usuario() {

    }

    public String toString() {
        return getIdUsuario()+" - "+"Nome: " + getNome() + " - "+"Email: " + getEmail() + " - "+"Data de Registro: " + getDataregistro();
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the isUsuario
     */
    public int getIsUsuario() {
        return isUsuario;
    }

    /**
     * @param isUsuario the isUsuario to set
     */
    public void setIsUsuario(int isUsuario) {
        this.isUsuario = isUsuario;
    }
}
