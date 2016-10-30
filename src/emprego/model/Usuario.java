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
    private int celular;
    private String perguntaSecreta;
    private String resposta;
    private String data_Nascimento;
    private int cpf;
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
     * @return the cpf
     */
    public int getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(int cpf) {
        this.cpf = cpf;
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
     * @return the celular
     */
    public int getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(int celular) {
        this.celular = celular;
    }

    /**
     * @return the perguntasecreta
     */
    public String getPerguntaSecreta() {
        return perguntaSecreta;
    }

    /**
     * @param perguntasecreta the perguntasecreta to set
     */
    public void setPerguntaSecreta(String perguntaSecreta) {
        this.perguntaSecreta = perguntaSecreta;
    }

    /**
     * @return the resposta
     */
    public String getResposta() {
        return resposta;
    }

    /**
     * @param resposta the resposta to set
     */
    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    /**
     * @return the idUsuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }
    public Usuario(String nome, String email, String senha){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.celular = 0;
        this.telefone = 0;
        this.cpf = 0;
        this.data_Nascimento = "0/0/";
        this.perguntaSecreta = "teste";
        this.resposta = "teste";
        this.idUsuario = 0;
    }
    public Usuario(){
        
    }
    public String writeFile() {
                                    String writeFile = getNome()+";"+getEmail()+";"+getSenha()+";"+
                                    getCelular()+";"+getTelefone()+";"+getCpf()+";"+
                                    getData_Nascimento()+";"+getPerguntaSecreta()+";"+getResposta()+";"+getIdUsuario()+";\n";
        
        return writeFile;
    }

    public String ToString() {
        return "Nome: "+getNome()+" Email: "+getEmail()+" CPF: "+getCpf()+" Senha: "+getSenha()+" Celular: "+getCelular()+" Telefone: "+getTelefone()+" Pergunta: "+getPerguntaSecreta()+" Resposta: "+getResposta()+ "Id do Usuário : "+getIdUsuario()+" Data de Nascimento: "+getData_Nascimento();
    }

     public String toString() {
        return "Código: "+getIdUsuario()+" Nome: "+getNome()+" Data de Nascimento: "+getData_Nascimento()+" Email: "+getEmail()+"Data de Registro: "+getDataregistro()+" Ultimo Login: "+getUltimologin()+" Senha: "+getSenha()+" Completo: "+getCompleto();
    }
    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}
