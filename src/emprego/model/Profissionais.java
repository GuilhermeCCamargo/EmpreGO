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
public class Profissionais {
    private String nome;
    private String email;
    private String senha;
    private String endereco;
    private String enderecoLocal;
    private String experienciaProfissional;
    private String profissao;
    private String data_Nascimento;
    private int telefone;
    private int isUsuario;
    private int idUsuario;
    private int completo;
    private int ciente;
    private int idProfissional;
    private int telefoneComercial;
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
     * @return the enderecoLocal
     */
    public String getEnderecoLocal() {
        return enderecoLocal;
    }

    /**
     * @param enderecoLocal the enderecoLocal to set
     */
    public void setEnderecoLocal(String enderecoLocal) {
        this.enderecoLocal = enderecoLocal;
    }

    /**
     * @return the experienciaProfissional
     */
    public String getExperienciaProfissional() {
        return experienciaProfissional;
    }

    /**
     * @param experienciaProfissional the experienciaProfissional to set
     */
    public void setExperienciaProfissional(String experienciaProfissional) {
        this.experienciaProfissional = experienciaProfissional;
    }

    /**
     * @return the profissao
     */
    public String getProfissao() {
        return profissao;
    }

    /**
     * @param profissao the profissao to set
     */
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    /**
     * @return the data_Nascimento
     */
    public String getData_Nascimento() {
        return data_Nascimento;
    }

    /**
     * @param data_Nascimento the data_Nascimento to set
     */
    public void setData_Nascimento(String data_Nascimento) {
        this.data_Nascimento = data_Nascimento;
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

    /**
     * @return the ciente
     */
    public int getCiente() {
        return ciente;
    }

    /**
     * @param ciente the ciente to set
     */
    public void setCiente(int ciente) {
        this.ciente = ciente;
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
     * @return the telefoneComercial
     */
    public int getTelefoneComercial() {
        return telefoneComercial;
    }

    /**
     * @param telefoneComercial the telefoneComercial to set
     */
    public void setTelefoneComercial(int telefoneComercial) {
        this.telefoneComercial = telefoneComercial;
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

    @Override
    public String toString() {
        return "Profissionais{" + "nome=" + nome + ", email=" + email + ", senha=" + senha + ", endereco=" + endereco + ", enderecoLocal=" + enderecoLocal + ", experienciaProfissional=" + experienciaProfissional + ", profissao=" + profissao + ", data_Nascimento=" + data_Nascimento + ", telefone=" + telefone + ", isUsuario=" + isUsuario + ", idUsuario=" + idUsuario + ", completo=" + completo + ", ciente=" + ciente + ", idProfissional=" + idProfissional + ", telefoneComercial=" + telefoneComercial + ", dataregistro=" + dataregistro + ", ultimologin=" + ultimologin + '}';
    }
    
    
}
